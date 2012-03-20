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

/**
 * Utilities for working with monetary values that handle null.
 * <p>
 * This utility class contains thread-safe static methods.
 *
 * @author Stephen Colebourne
 */
public final class MoneyUtils {

    //-----------------------------------------------------------------------
    /**
     * Private constructor.
     */
    private MoneyUtils() {
    }

    //-----------------------------------------------------------------------
    /**
     * Checks if the monetary value is zero, treating null as zero.
     * <p>
     * This method accepts any implementation of {@code BigMoneyProvider}.
     * 
     * @return true if the money is null or zero
     */
    public static boolean isZero(BigMoneyProvider moneyProvider) {
    	// TODO Not Implemented yet
    	return false;
    }

    /**
     * Checks if the monetary value is positive and non-zero, treating null as zero.
     * <p>
     * This method accepts any implementation of {@code BigMoneyProvider}.
     * 
     * @return true if the money is non-null and positive
     */
    public static boolean isPositive(BigMoneyProvider moneyProvider) {
    	// TODO Not Implemented yet
    	return false;
    }

    /**
     * Checks if the monetary value is positive or zero, treating null as zero.
     * <p>
     * This method accepts any implementation of {@code BigMoneyProvider}.
     * 
     * @return true if the money is null, zero or positive
     */
    public static boolean isPositiveOrZero(BigMoneyProvider moneyProvider) {
    	// TODO Not Implemented yet
    	return false;
    }

    /**
     * Checks if the monetary value is negative and non-zero, treating null as zero.
     * <p>
     * This method accepts any implementation of {@code BigMoneyProvider}.
     * 
     * @return true if the money is non-null and negative
     */
    public static boolean isNegative(BigMoneyProvider moneyProvider) {
    	// TODO Not Implemented yet
    	return false;
    }

    /**
     * Checks if the monetary value is negative or zero, treating null as zero.
     * <p>
     * This method accepts any implementation of {@code BigMoneyProvider}.
     * 
     * @return true if the money is null, zero or negative
     */
    public static boolean isNegativeOrZero(BigMoneyProvider moneyProvider) {
    	// TODO Not Implemented yet
    	return false;
    }

    //-----------------------------------------------------------------------
    /**
     * Finds the maximum {@code Money} value, handing null.
     * <p>
     * This returns the greater of money1 or money2 where null is ignored.
     * If both input values are null, then null is returned.
     * 
     * @param money1  the first money instance, null returns money2
     * @param money2  the first money instance, null returns money1
     * @return the maximum value, null if both inputs are null
     * @throws CurrencyMismatchException if the currencies differ
     */
    public static Money max(Money money1, Money money2) {
    	// TODO Not Implemented yet
    	return null;
    }

    /**
     * Finds the minimum {@code Money} value, handing null.
     * <p>
     * This returns the greater of money1 or money2 where null is ignored.
     * If both input values are null, then null is returned.
     * 
     * @param money1  the first money instance, null returns money2
     * @param money2  the first money instance, null returns money1
     * @return the minimum value, null if both inputs are null
     * @throws CurrencyMismatchException if the currencies differ
     */
    public static Money min(Money money1, Money money2) {
    	// TODO Not Implemented yet
    	return null;
    }

    //-----------------------------------------------------------------------
    /**
     * Adds two {@code Money} objects, handling null.
     * <p>
     * This returns {@code money1 + money2} where null is ignored.
     * If both input values are null, then null is returned.
     * 
     * @param money1  the first money instance, null returns money2
     * @param money2  the first money instance, null returns money1
     * @return the total, where null is ignored, null if both inputs are null
     * @throws CurrencyMismatchException if the currencies differ
     */
    public static Money add(Money money1, Money money2) {
    	// TODO Not Implemented yet
    	return null;
    }

    //-----------------------------------------------------------------------
    /**
     * Subtracts the second {@code Money} from the first, handling null.
     * <p>
     * This returns {@code money1 - money2} where null is ignored.
     * If both input values are null, then null is returned.
     * 
     * @param money1  the first money instance, null treated as zero
     * @param money2  the first money instance, null returns money1
     * @return the total, where null is ignored, null if both inputs are null
     * @throws CurrencyMismatchException if the currencies differ
     */
    public static Money subtract(Money money1, Money money2) {
    	// TODO Not Implemented yet
    	return null;
    }

    //-----------------------------------------------------------------------
    /**
     * Finds the maximum {@code BigMoney} value, handing null.
     * <p>
     * This returns the greater of money1 or money2 where null is ignored.
     * If both input values are null, then null is returned.
     * 
     * @param money1  the first money instance, null returns money2
     * @param money2  the first money instance, null returns money1
     * @return the maximum value, null if both inputs are null
     * @throws CurrencyMismatchException if the currencies differ
     */
    public static BigMoney max(BigMoney money1, BigMoney money2) {
    	// TODO Not Implemented yet
    	return null;
    }

    /**
     * Finds the minimum {@code BigMoney} value, handing null.
     * <p>
     * This returns the greater of money1 or money2 where null is ignored.
     * If both input values are null, then null is returned.
     * 
     * @param money1  the first money instance, null returns money2
     * @param money2  the first money instance, null returns money1
     * @return the minimum value, null if both inputs are null
     * @throws CurrencyMismatchException if the currencies differ
     */
    public static BigMoney min(BigMoney money1, BigMoney money2) {
    	// TODO Not Implemented yet
    	return null;
    }

    //-----------------------------------------------------------------------
    /**
     * Adds two {@code BigMoney} objects, handling null.
     * <p>
     * This returns {@code money1 + money2} where null is ignored.
     * If both input values are null, then null is returned.
     * 
     * @param money1  the first money instance, null returns money2
     * @param money2  the first money instance, null returns money1
     * @return the total, where null is ignored, null if both inputs are null
     * @throws CurrencyMismatchException if the currencies differ
     */
    public static BigMoney add(BigMoney money1, BigMoney money2) {
    	// TODO Not Implemented yet
    	return null;
    }

    //-----------------------------------------------------------------------
    /**
     * Subtracts the second {@code BigMoney} from the first, handling null.
     * <p>
     * This returns {@code money1 - money2} where null is ignored.
     * If both input values are null, then null is returned.
     * 
     * @param money1  the first money instance, null treated as zero
     * @param money2  the first money instance, null returns money1
     * @return the total, where null is ignored, null if both inputs are null
     * @throws CurrencyMismatchException if the currencies differ
     */
    public static BigMoney subtract(BigMoney money1, BigMoney money2) {
    	// TODO Not Implemented yet
    	return null;
    }
}
