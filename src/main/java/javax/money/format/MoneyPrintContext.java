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
package javax.money.format;

import java.util.Locale;

/**
 * Context used when printing money.
 * <p>
 * This class is mutable and intended for use by a single thread.
 * A new instance is created for each parse.
 */
public final class MoneyPrintContext {

    //-----------------------------------------------------------------------
    /**
     * Gets the locale.
     * 
     * @return the locale, never null
     */
    public Locale getLocale() {
    	// TODO Not Implemented yet
    	return null;
    }

    /**
     * Sets the locale.
     * 
     * @param locale  the locale, not null
     */
    public void setLocale(Locale locale) {
    	// TODO Not Implemented yet
    }

}
