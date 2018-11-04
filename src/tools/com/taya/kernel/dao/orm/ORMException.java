/**
 * TAYAFOOD 2018
 */
package com.taya.kernel.dao.orm;

/**
 * @author AnMTD
 */
public class ORMException extends RuntimeException {

	public ORMException() {
		super();
	}

	public ORMException(String msg) {
		super(msg);
	}

	public ORMException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public ORMException(Throwable cause) {
		super(cause);
	}

}
