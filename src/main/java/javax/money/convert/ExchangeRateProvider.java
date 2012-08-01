/**
 * Copyright (c) 2012, Werner Keil.
 *
 * Contributors:
 *    Werner Keil - initial API
 */
package javax.money.convert;

/**
 * @author <a href="mailto:units@catmedia.us">Werner Keil</a>
 * @version 0.1
 */
public interface ExchangeRateProvider {
	public ExchangeRate getExchangeRate();
}
