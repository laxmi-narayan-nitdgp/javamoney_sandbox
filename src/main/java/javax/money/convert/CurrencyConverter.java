/**
 * Copyright (c) 2005, 2012, Werner Keil.
 *
 * Contributors:
 *    Werner Keil - initial API
 */
package javax.money.convert;

import static java.util.FormattableFlags.LEFT_JUSTIFY;
import static javax.money.CurrencyUnit.of;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

import javax.money.CurrencyUnit;
import javax.money.Money;

/**
 * <p>
 * This class represents a converter between two currencies.
 * </p>
 * 
 * <p>
 * CurrencyUnit converters convert values based upon the current exchange rate
 * {@link CurrencyUnit#getExchangeRate() exchange rate}. If the
 * {@link CurrencyUnit#getExchangeRate() exchange rate} from the target CurrencyUnit to
 * the source CurrencyUnit is not set, conversion fails. In others words, the
 * converter from a CurrencyUnit <code>A</code> to a CurrencyUnit <code>B</code> is
 * independant from the converter from <code>B</code> to <code>A</code>.
 * </p>
 * 
 * @author <a href="mailto:units@catmedia.us">Werner Keil</a>
 * @version 0.2.2
 */
public class CurrencyConverter implements ExchangeRateProvider, Formattable {

	/**
	 * Holds the exchange rate.
	 */
	private final ExchangeRate rate;

	private void checkFactor(Number factor) {
		if (factor == null)
			throw new UnsupportedOperationException("Exchange Rate not set " +
					rate.getSource() + "->" + rate.getTarget()); //$NON-NLS-1$
	}

//	private CurrencyUnit fromJDK(java.util.Currency jdkCurrency) {
//		return CurrencyUnit.getInstance(CurrencyUnit.getCurrencyCode());
//	}

	/**
	 * Creates the CurrencyUnit converter from the source CurrencyUnit to the target
	 * CurrencyUnit.
	 * 
	 * @param source
	 *            the source CurrencyUnit.
	 * @param target
	 *            the target CurrencyUnit.
	 * @param factor
	 *            the multiplier factor from source to target.
	 * @return the corresponding converter.
	 */
	private CurrencyConverter(CurrencyUnit source, CurrencyUnit target, Number factor) {
		rate = new ExchangeRate(source, target, factor);
	}

	/**
	 * Creates the CurrencyUnit converter from the source CurrencyUnit to the target
	 * CurrencyUnit.
	 * 
	 * @param source
	 *            the source CurrencyUnit.
	 * @param target
	 *            the target CurrencyUnit.
	 * @param factor
	 *            the multiplier factor from source to target.
	 * @return the corresponding converter.
	 */
	public CurrencyConverter(CurrencyUnit source, Money target,
			Number factor) {
		if (target instanceof Money) {
			rate = new ExchangeRate(source, target.getCurrencyUnit(),
					factor);
		} else {
			CurrencyUnit defCurrency = CurrencyUnit.getInstance(Locale.getDefault());
			rate = new ExchangeRate(defCurrency, defCurrency, factor);
		}
	}

	/**
	 * Creates the CurrencyUnit converter from the source CurrencyUnit to the target
	 * CurrencyUnit using <strong>JDK</strong> types.
	 * 
	 * @param source
	 *            the source CurrencyUnit (<strong>JDK</strong>).
	 * @param target
	 *            the target CurrencyUnit (<strong>JDK</strong>).
	 * @param factor
	 *            the multiplier factor from source to target.
	 * @return the corresponding converter.
	 */
	public CurrencyConverter(java.util.Currency source,
			java.util.Currency target, Number factor) {
		rate = new ExchangeRate(of(source), of(target), factor);
	}

	/**
	 * Returns the source CurrencyUnit.
	 * 
	 * @return the source CurrencyUnit.
	 */
	public CurrencyUnit getSource() {
		return rate.getSource();
	}

	/**
	 * Returns the target CurrencyUnit.
	 * 
	 * @return the target CurrencyUnit.
	 */
	public CurrencyUnit getTarget() {
		return rate.getTarget();
	}

	public CurrencyConverter inverse() {
		return new CurrencyConverter(rate.getTarget(), rate.getSource(),
				rate.getFactor());
	}

	public CurrencyConverter negate() {
		return new CurrencyConverter(rate.getSource(), rate.getTarget(), -rate
				.getFactor().doubleValue());
	}

	public double convert(double value) {
		// Number factor = getExchangeRate(rate.getTarget());
		Number factor = rate.getFactor();
		checkFactor(factor);
		return factor.doubleValue() * value;
	}

	public Number convert(Number value, MathContext ctx)
			throws ArithmeticException {
		// Number factor = rate.getSource().getExchangeRate(rate.getTarget());
		Number factor = rate.getFactor();
		checkFactor(factor);
		if (factor instanceof BigDecimal)
			return ((BigDecimal)value).multiply((BigDecimal) factor, ctx);
		if (factor instanceof Number) {
			return ((BigDecimal)value).multiply(
					(BigDecimal.valueOf(((Number) factor).doubleValue())), ctx);
		} else { // Reverts to double convert.
			return ((BigDecimal)value)
					.multiply(BigDecimal.valueOf(factor.doubleValue()), ctx);
		}
	}

	public Number convert(Number value) {
		if (value instanceof BigDecimal) {
			return convert((BigDecimal) value, MathContext.DECIMAL128);
		} else {
			return convert(value.doubleValue());
		}
	}

	@Override
	public boolean equals(Object cvtr) {
		if (!(cvtr instanceof CurrencyConverter))
			return false;
		CurrencyConverter that = (CurrencyConverter) cvtr;
		return this.rate.getSource().equals(that.rate.getSource())
				&& this.rate.getTarget().equals(that.rate.getTarget());
	}

	@Override
	public int hashCode() {
		return rate.getSource().hashCode() + rate.getTarget().hashCode();
	}

	@Override
	public final String toString() {
		return String.format("%s -> %s", getSource()
				.getSymbol(), getTarget().getSymbol());
	}

	public boolean isLinear() {
		return true;
	}

	public boolean isIdentity() {
		return false;
	}

	public ExchangeRate getExchangeRate() {
		return rate;
	}

	public void formatTo(Formatter fmt, int f, int width, int precision) {
		StringBuilder sb = new StringBuilder();

		// decide form of name
		String name = getSource().toString();
		String symbol = getSource().getSymbol();
		// if (fmt.locale().equals(Locale.FRANCE))
		// name = frenchCompanyName;
		// boolean alternate = (f & ALTERNATE) == ALTERNATE;
		boolean usesymbol = true; // alternate || (precision != -1 && precision
									// < 10);
		String out = (usesymbol ? symbol : name);

		// apply precision
		if (precision == -1 || out.length() < precision) {
			// write it all
			sb.append(out);
		} else {
			sb.append(out.substring(0, precision - 1)).append('*');
		}

		// apply width and justification
		int len = sb.length();
		if (len < width)
			for (int i = 0; i < width - len; i++)
				if ((f & LEFT_JUSTIFY) == LEFT_JUSTIFY)
					sb.append(' ');
				else
					sb.insert(0, ' ');

		fmt.format(sb.toString());
	}
}
