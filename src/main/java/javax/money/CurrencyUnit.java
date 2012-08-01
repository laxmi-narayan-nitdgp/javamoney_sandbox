/*
 *  Copyright 2009-2011 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package javax.money;

import java.io.Serializable;
import java.util.Currency;
import java.util.List;
import java.util.Locale;


/**
 * A unit of currency.
 * <p>
 * This class represents a unit of currency such as the British Pound, Euro
 * or US Dollar.
 * <p>
 * The set of loaded currencies is provided by an instance of {@link CurrencyUnitDataProvider}.
 * The provider used is determined by the system property {@code javax.money.CurrencyUnitDataProvider}
 * which should be the fully qualified class name of the provider. The default provider loads the first
 * resource named {@code /MoneyData.csv} on the classpath.
 * <p>
 * This class is immutable and thread-safe.
 *
 * @author Stephen Colebourne
 */
public final class CurrencyUnit implements Comparable<CurrencyUnit>, Serializable {

    /**
     * The serialisation version.
     */
    private static final long serialVersionUID = 1L;

    // a selection of commonly traded, stable currencies
    /**
     * The currency 'USD' - United States Dollar.
     */
    public static final CurrencyUnit USD = of("USD");
    /**
     * The currency 'EUR' - Euro.
     */
    public static final CurrencyUnit EUR = of("EUR");
    /**
     * The currency 'JPY' - Japanese Yen.
     */
    public static final CurrencyUnit JPY = of("JPY");
    /**
     * The currency 'GBP' - British pound.
     */
    public static final CurrencyUnit GBP = of("GBP");
    /**
     * The currency 'CHF' - Swiss Franc.
     */
    public static final CurrencyUnit CHF = of("CHF");
    /**
     * The currency 'AUD' - Australian Dollar.
     */
    public static final CurrencyUnit AUD = of("AUD");
    /**
     * The currency 'CAD' - Canadian Dollar.
     */
    public static final CurrencyUnit CAD = of("CAD");

    /**
     * TODO wouldn't a Set be more appropriate? (A collection that contains no duplicate elements.)
     * 
     * Gets the list of all registered currencies.
     * <p>
     * This class only permits known currencies to be returned, thus this list is
     * the complete list of valid singleton currencies. The list may change after
     * application startup, however this isn't recommended.
     *
     * @return the sorted, independent, list of all registered currencies, never null
     */
    public static List<CurrencyUnit> registeredCurrencies() {
    	// TODO Not Implemented yet
    	return null;
    }

    //-----------------------------------------------------------------------
    /**
     * Obtains an instance of {@code CurrencyUnit} matching the specified JDK currency.
     * <p>
     * This converts the JDK currency instance to a currency unit using the code.
     *
     * @param currency  the currency, not null
     * @return the singleton instance, never null
     */
    public static CurrencyUnit of(Currency currency) {
    	// TODO Not Implemented yet
    	return null;
    }

    /**
     * Obtains an instance of {@code CurrencyUnit} for the specified ISO-4217 three letter currency code.
     * <p>
     * A currency is uniquely identified by ISO-4217 three letter code.
     *
     * @param currencyCode  the currency code, not null
     * @return the singleton instance, never null
     * @throws IllegalCurrencyException if the currency is unknown
     */
    public static CurrencyUnit of(String currencyCode) {
    	// TODO Not Implemented yet
    	return null;
    }

    /**
     * Obtains an instance of {@code CurrencyUnit} for the specified ISO-4217 numeric currency code.
     * <p>
     * The numeric code is an alternative to the three letter code.
     * This method is lenient and does not require the string to be left padded with zeroes.
     *
     * @param numericCurrencyCode  the currency code, not null
     * @return the singleton instance, never null
     * @throws IllegalCurrencyException if the currency is unknown
     */
    public static CurrencyUnit ofNumericCode(String numericCurrencyCode) {
    	// TODO Not Implemented yet
    	return null;
    }

    /**
     * Obtains an instance of {@code CurrencyUnit} for the specified ISO-4217 numeric currency code.
     * <p>
     * The numeric code is an alternative to the three letter code.
     *
     * @param numericCurrencyCode  the numeric currency code, not null
     * @return the singleton instance, never null
     * @throws IllegalCurrencyException if the currency is unknown
     */
    public static CurrencyUnit ofNumericCode(int numericCurrencyCode) {
    	// TODO Not Implemented yet
    	return null;
    }

    /**
     * Obtains an instance of {@code CurrencyUnit} for the specified locale.
     * <p>
     * Only the country is used from the locale.
     *
     * @param locale  the locale, not null
     * @return the singleton instance, never null
     * @throws IllegalCurrencyException if the currency is unknown
     */
    public static CurrencyUnit of(Locale locale) {
    	// TODO Not Implemented yet
    	return null;
    }

    /**
     * Obtains an instance of {@code CurrencyUnit} for the specified country code.
     * <p>
     * Country codes should generally be in upper case.
     * This method is case sensitive.
     *
     * @param countryCode  the country code, not null
     * @return the singleton instance, never null
     * @throws IllegalCurrencyException if the currency is unknown
     */
    public static CurrencyUnit ofCountry(String countryCode) {
    	// TODO Not Implemented yet
    	return null;
    }

    //-----------------------------------------------------------------------
    /**
     * Obtains an instance of {@code CurrencyUnit} for the specified currency code.
     * <p>
     * This method exists to match the API of {@link Currency}.
     *
     * @param currencyCode  the currency code, not null
     * @return the singleton instance, never null
     * @throws IllegalCurrencyException if the currency is unknown
     */
    public static CurrencyUnit getInstance(String currencyCode) {
    	// TODO Not Implemented yet
    	return null;
    }

    /**
     * Obtains an instance of {@code CurrencyUnit} for the specified locale.
     * <p>
     * This method exists to match the API of {@link Currency}.
     *
     * @param locale  the locale, not null
     * @return the singleton instance, never null
     * @throws IllegalCurrencyException if the currency is unknown
     */
    public static CurrencyUnit getInstance(Locale locale) {
    	// TODO Not Implemented yet
    	return null;
    }

    //-----------------------------------------------------------------------
    /**
     * Constructor, creating a new currency instance.
     * 
     * @param code  the currency code, not null
     * @param numericCurrencyCode  the numeric currency code, -1 if none
     * @param decimalPlaces  the decimal places, not null
     */
    CurrencyUnit(String code, short numericCurrencyCode, short decimalPlaces) {
    	// TODO Not Implemented yet
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the ISO-4217 three letter currency code.
     * <p>
     * Each currency is uniquely identified by a three-letter code.
     * 
     * @return the three letter ISO-4217 currency code, never null
     */
    public String getCode() {
    	// TODO Not Implemented yet
    	return null;
    }

    /**
     * Gets the ISO-4217 numeric currency code.
     * <p>
     * The numeric code is an alternative to the standard three letter code.
     * 
     * @return the numeric currency code
     */
    public int getNumericCode() {
    	// TODO Not Implemented yet
    	return 0;
    }

    /**
     * Gets the ISO-4217 numeric currency code as a three digit string.
     * <p>
     * This formats the numeric code as a three digit string prefixed by zeroes if necessary.
     * If there is no valid code, then an empty string is returned.
     * 
     * @return the three digit numeric currency code, empty is no code, never null
     */
    public String getNumeric3Code() {
    	// TODO Not Implemented yet
    	return null;
    }

    /**
     * Gets the number of decimal places typically used by this currency.
     * <p>
     * Different currencies have different numbers of decimal places by default.
     * For example, 'GBP' has 2 decimal places, but 'JPY' has zero.
     * Pseudo-currencies will return zero.
     * <p>
     * See also {@link #getDefaultFractionDigits()}.
     * 
     * @return the decimal places, from 0 to 9 (normally 0, 2 or 3)
     */
    public int getDecimalPlaces() {
    	// TODO Not Implemented yet
    	return 0;
    }

    /**
     * Checks if this is a pseudo-currency.
     * 
     * @return true if this is a pseudo-currency
     */
    public boolean isPseudoCurrency() {
    	// TODO Not Implemented yet
    	return false;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the ISO-4217 three-letter currency code.
     * <p>
     * This method matches the API of {@link Currency}.
     * 
     * @return the currency code, never null
     */
    public String getCurrencyCode() {
    	// TODO Not Implemented yet
    	return null;
    }

    /**
     * Gets the number of fractional digits typically used by this currency.
     * <p>
     * Different currencies have different numbers of fractional digits by default.
     * For example, 'GBP' has 2 fractional digits, but 'JPY' has zero.
     * Pseudo-currencies are indicated by -1.
     * <p>
     * This method matches the API of {@link Currency}.
     * The alternative method {@link #getDecimalPlaces()} may be more useful.
     * 
     * @return the fractional digits, from 0 to 9 (normally 0, 2 or 3), or -1 for pseudo-currencies
     */
    public int getDefaultFractionDigits() {
    	// TODO Not Implemented yet
    	return 0;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the symbol for this locale from the JDK.
     * <p>
     * If this currency doesn't have a JDK equivalent, then the currency code
     * is returned.
     * <p>
     * This method matches the API of {@link Currency}.
     * 
     * @return the JDK currency instance, never null
     */
    public String getSymbol() {
    	// TODO Not Implemented yet
    	return null;
    }

    /**
     * Gets the symbol for this locale from the JDK.
     * <p>
     * If this currency doesn't have a JDK equivalent, then the currency code
     * is returned.
     * <p>
     * This method matches the API of {@link Currency}.
     * 
     * @param locale  the locale to get the symbol for, not null
     * @return the JDK currency instance, never null
     */
    public String getSymbol(Locale locale) {
    	// TODO Not Implemented yet
    	return null;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the JDK currency instance equivalent to this currency.
     * <p>
     * This attempts to convert a {@code CurrencyUnit} to a JDK {@code Currency}.
     * 
     * @return the JDK currency instance, never null
     * @throws IllegalArgumentException if no matching currency exists in the JDK
     */
    public Currency toCurrency() {
    	// TODO Not Implemented yet
    	return null;
    }

    //-----------------------------------------------------------------------
    /**
     * Compares this currency to another by alphabetical comparison of the code.
     * 
     * @param other  the other currency, not null
     * @return negative if earlier alphabetically, 0 if equal, positive if greater alphabetically
     */
    public int compareTo(CurrencyUnit other) {
    	// TODO Not Implemented yet
    	return 0;
    }

    /**
     * Checks if this currency equals another currency.
     * <p>
     * The comparison checks the 3 letter currency code.
     * 
     * @param obj  the other currency, null returns false
     * @return true if equal
     */
    @Override
    public boolean equals(Object obj) {
    	// TODO Not Implemented yet
    	return false;
    }

    /**
     * Returns a suitable hash code for the currency.
     * 
     * @return the hash code
     */
    @Override
    public int hashCode() {
    	// TODO Not Implemented yet
    	return 0;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the currency code as a string.
     * 
     * @return the currency code, never null
     */
    @Override
    public String toString() {
    	// TODO Not Implemented yet
    	return null;
    }

}
