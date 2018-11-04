/**
 * TAYAFOOD 2018
 */
package com.taya.tools;

import java.util.Map;

import com.taya.tools.ArgumentsMap;

/**
 * @author AnMTD
 */
public class ArgumentsUtil {
	public static Map<String, String> parseArguments(String[] args) {
		Map<String, String> arguments = new ArgumentsMap();

		for (String arg : args) {
			int pos = arg.indexOf('=');

			if (pos <= 0) {
				throw new IllegalArgumentException("Bad argument " + arg);
			}

			String key = arg.substring(0, pos).trim();
			String value = arg.substring(pos + 1).trim();

			if (key.startsWith("-D")) {
				key = key.substring(2);

				System.setProperty(key, value);
			} else {
				arguments.put(key, value);
			}
		}

		return arguments;
	}
}
