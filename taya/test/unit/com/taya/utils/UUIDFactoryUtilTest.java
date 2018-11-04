/**
 * TayaFood 2018
 */
package com.taya.utils;

import org.junit.Test;
import junit.framework.TestCase;

/**
 * @author Mai Thành Duy An
 */
public class UUIDFactoryUtilTest extends TestCase {

	String _uuid = "";
	int _uuidLength = 41;

	protected void setUp() {

		_uuid = UUIDFactoryUtil.createUUID();
	}

	@Test
	public void test() {
		if (_uuid.length() == _uuidLength) {
			assertTrue("success", true);
		} else {
			fail("Not generate UUID String !");
		}
		System.out.println("UUID: " + _uuid);
	}

}
