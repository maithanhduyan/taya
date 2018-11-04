/**
 * TAYAFOOD 2018
 */
package com.taya.kernel.util;

import java.util.ArrayList;
import java.util.List;

import com.taya.kernel.util.Validator;
import com.taya.kernel.util.CharPool;

/**
 * @author AnMTD
 */
public class StringUtil {

	public static String[] split(String s) {
		return split(s, CharPool.COMMA);
	}

	public static String[] split(String s, char delimiter) {
		if (Validator.isNull(s)) {
			return _emptyStringArray;
		}

		s = s.trim();

		if (s.length() == 0) {
			return _emptyStringArray;
		}

		if ((delimiter == CharPool.RETURN) || (delimiter == CharPool.NEW_LINE)) {

			return splitLines(s);
		}

		List<String> nodeValues = new ArrayList<String>();

		int offset = 0;
		int pos = s.indexOf(delimiter, offset);

		while (pos != -1) {
			nodeValues.add(s.substring(offset, pos));

			offset = pos + 1;
			pos = s.indexOf(delimiter, offset);
		}

		if (offset < s.length()) {
			nodeValues.add(s.substring(offset));
		}

		return nodeValues.toArray(new String[nodeValues.size()]);
	}

	public static String[] splitLines(String s) {
		if (Validator.isNull(s)) {
			return _emptyStringArray;
		}

		s = s.trim();

		List<String> lines = new ArrayList<String>();

		int lastIndex = 0;

		while (true) {
			int returnIndex = s.indexOf(CharPool.RETURN, lastIndex);
			int newLineIndex = s.indexOf(CharPool.NEW_LINE, lastIndex);

			if ((returnIndex == -1) && (newLineIndex == -1)) {
				break;
			}

			if (returnIndex == -1) {
				lines.add(s.substring(lastIndex, newLineIndex));

				lastIndex = newLineIndex + 1;
			} else if (newLineIndex == -1) {
				lines.add(s.substring(lastIndex, returnIndex));

				lastIndex = returnIndex + 1;
			} else if (newLineIndex < returnIndex) {
				lines.add(s.substring(lastIndex, newLineIndex));

				lastIndex = newLineIndex + 1;
			} else {
				lines.add(s.substring(lastIndex, returnIndex));

				lastIndex = returnIndex + 1;

				if (lastIndex == newLineIndex) {
					lastIndex++;
				}
			}
		}

		if (lastIndex < s.length()) {
			lines.add(s.substring(lastIndex));
		}

		return lines.toArray(new String[lines.size()]);
	}

	private static final String[] _ESCAPE_SAFE_HIGHLIGHTS = { "[@HIGHLIGHT1@]", "[@HIGHLIGHT2@]" };

	protected static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
			'e', 'f' };
	private static final String[] _HIGHLIGHTS = { "<span class=\"highlight\">", "</span>" };

	private static final char[] _RANDOM_STRING_CHAR_TABLE = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
			'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
			'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	private static String[] _emptyStringArray = new String[0];
	private static Boolean _highlightEnabled;
}
