/**
 * TAYAFOOD 2018
 */
package com.taya.kernel.dao.orm;

import com.taya.kernel.dao.orm.ORMException;

/**
 * @author AnMTD
 */
public interface ScrollableResults {

	public boolean first() throws ORMException;

	public Object[] get() throws ORMException;

	public Object get(int i) throws ORMException;

	public boolean last() throws ORMException;

	public boolean next() throws ORMException;

	public boolean previous() throws ORMException;

	public boolean scroll(int i) throws ORMException;

}
