/**
 * TAYAFOOD 2018
 */
package com.taya.tools;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.taya.kernel.util.ArrayUtil;
import com.taya.kernel.util.CharPool;
import com.taya.kernel.util.GetterUtil;
import com.taya.kernel.util.StringPool;
import com.taya.kernel.util.StringUtil;

/**
 * @author AnMTD
 */
public class Validator {

	public static boolean isName(String name) {
		if (isNull(name)) {
			return false;
		}

		for (char c : name.trim().toCharArray()) {
			if (!isChar(c) && !Character.isWhitespace(c)) {
				return false;
			}
		}

		return true;
	}

	public static boolean isChar(String s) {
		if (isNull(s)) {
			return false;
		}

		for (char c : s.toCharArray()) {
			if (!isChar(c)) {
				return false;
			}
		}

		return true;
	}

	public static boolean isChar(char c) {
		int x = c;

		if (((x >= _CHAR_LOWER_CASE_BEGIN) && (x <= _CHAR_LOWER_CASE_END))
				|| ((x >= _CHAR_UPPER_CASE_BEGIN) && (x <= _CHAR_UPPER_CASE_END))) {

			return true;
		}

		return false;
	}

	public static boolean isNotNull(Long l) {
		return !isNull(l);
	}

	public static boolean isNotNull(Object obj) {
		return !isNull(obj);
	}

	public static boolean isNotNull(String s) {
		return !isNull(s);
	}

	public static boolean isNull(Long l) {
		if ((l == null) || (l.longValue() == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isNull(Object obj) {
		if (obj instanceof Long) {
			return isNull((Long) obj);
		} else if (obj instanceof String) {
			return isNull((String) obj);
		} else if (obj == null) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isNull(String s) {
		if (s == null) {
			return true;
		}

		int counter = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == CharPool.SPACE) {
				continue;
			} else if (counter > 3) {
				return false;
			}

			if (counter == 0) {
				if (c != CharPool.LOWER_CASE_N) {
					return false;
				}
			} else if (counter == 1) {
				if (c != CharPool.LOWER_CASE_U) {
					return false;
				}
			} else if ((counter == 2) || (counter == 3)) {
				if (c != CharPool.LOWER_CASE_L) {
					return false;
				}
			}

			counter++;
		}

		if ((counter == 0) || (counter == 4)) {
			return true;
		}

		return false;
	}

	public static boolean isXml(String s) {
		if (s.startsWith(_XML_BEGIN) || s.startsWith(_XML_EMPTY)) {
			return true;
		} else {
			return false;
		}
	}

	private static final int _CHAR_LOWER_CASE_BEGIN = 97;

	private static final int _CHAR_LOWER_CASE_END = 122;

	private static final int _CHAR_UPPER_CASE_BEGIN = 65;

	private static final int _CHAR_UPPER_CASE_END = 90;

	private static final int _DIGIT_BEGIN = 48;

	private static final int _DIGIT_END = 57;

	private static final char[] _EMAIL_ADDRESS_SPECIAL_CHAR = new char[] { '.', '!', '#', '$', '%', '&', '\'', '*', '+',
			'-', '/', '=', '?', '^', '_', '`', '{', '|', '}', '~' };

	private static final String _VARIABLE_TERM_BEGIN = "[$";

	private static final String _VARIABLE_TERM_END = "$]";

	private static final String _XML_BEGIN = "<?xml";

	private static final String _XML_EMPTY = "<root />";

	private static Pattern _emailAddressPattern = Pattern
			.compile("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@"
					+ "(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?");
	private static Pattern _ipv4AddressPattern = Pattern
			.compile("^" + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."
					+ "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)" + "$");
	private static Pattern _ipv6AddressPattern = Pattern.compile("^"
			+ "\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|" + "(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|"
			+ "((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)" + "(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|"
			+ "(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:" + "((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)"
			+ "(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|"
			+ "(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|"
			+ "((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)"
			+ "(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|"
			+ "(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|"
			+ "((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)"
			+ "(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|"
			+ "(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|"
			+ "((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)"
			+ "(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|"
			+ "(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|"
			+ "((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)"
			+ "(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|"
			+ "(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:" + "((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\."
			+ "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*" + "$");
	private static Pattern _variableNamePattern = Pattern.compile("[_a-zA-Z]+[_a-zA-Z0-9]*");
}
