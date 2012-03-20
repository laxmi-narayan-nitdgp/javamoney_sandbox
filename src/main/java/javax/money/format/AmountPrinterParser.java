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

import java.io.IOException;
import java.io.Serializable;

import javax.money.BigMoney;


/**
 * Prints and parses the amount part of the money.
 * <p>
 * This class is immutable and thread-safe.
 */
final class AmountPrinterParser implements MoneyPrinter, MoneyParser, Serializable {

    /** Serialization version. */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param style  the style, not null
     */
    AmountPrinterParser(MoneyAmountStyle style) {
    	// TODO Not Implemented yet
    }

    //-----------------------------------------------------------------------
    public void print(MoneyPrintContext context, Appendable appendable, BigMoney money) throws IOException {
    	// TODO Not Implemented yet
    }

    public void parse(MoneyParseContext context) {
    	// TODO Not Implemented yet
    }

    @Override
    public String toString() {
    	// TODO Not Implemented yet
    	return null;
    }

}
