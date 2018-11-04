/**
 * TAYAFOOD 2018
 */
package com.taya.tools;

import java.util.HashMap;

import com.taya.kernel.util.Validator;

/**
 * @author AnMTD
 */
public class ArgumentsMap extends HashMap<String, String> {

	@Override
	public String get(Object key) {
		String value = super.get(key);

		if (Validator.isNull(value)) {
			value = System.getProperty((String) key);
		}

		return value;
	}
}
