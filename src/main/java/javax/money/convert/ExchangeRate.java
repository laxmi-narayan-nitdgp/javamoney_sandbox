/**
 * Copyright (c) 2005, 2012, Werner Keil.
 * All rights reserved. 
 * Contributors:
 *    Werner Keil - initial API and implementation
 */
package javax.money.convert;

import javax.money.Money;
import javax.money.CurrencyUnit;
import java.util.Date;

/**
 * @author Werner Keil
 * @version 0.2.1
 */
public class ExchangeRate {

	/**
	 * Holds the source CurrencyUnit.
	 */
	private final CurrencyUnit source;

	/**
	 * Holds the target CurrencyUnit.
	 */
	private final CurrencyUnit target;

	/**
	 * Holds the exchange factor.
	 */
	private final Number factor;

	/**
	 * Holds the effective (start) date.
	 */
	private final Date date;

	//private final Date interval;
	
	public ExchangeRate(CurrencyUnit source, CurrencyUnit target, Number factor,
			Date fromDate, Date toDate) {
		super();
		this.source = source;
		this.target = target;
		this.factor = factor;
		this.date = fromDate;
		//this.interval = new DateInterval(fromDate.getTime(), toDate.getTime());
	}
	
	public ExchangeRate(CurrencyUnit source, CurrencyUnit target, Number factor,
			Date date) {
		this(source, target, factor, date, date);
	}

	public ExchangeRate(CurrencyUnit source, CurrencyUnit target, Number factor) {
		this(source, target, factor, new Date());
	}

	public CurrencyUnit getSource() {
		return source;
	}

	public CurrencyUnit getSourceUnit() {
		return source;
	}

	public CurrencyUnit getTarget() {
		return target;
	}

	public CurrencyUnit getTargetUnit() {
		return target;
	}

	public Number getFactor() {
		return factor;
	}

	public Date getDate() {
		return date;
	}

//	public DateInterval getInterval() {
//		return interval;
//	}
}
