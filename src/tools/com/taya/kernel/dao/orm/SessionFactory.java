/**
 * TAYAFOOD 2018
 */
package com.taya.kernel.dao.orm;

import java.sql.Connection;

/**
 * @author AnMTD
 */
public interface SessionFactory {

	public void closeSession(Session session) throws ORMException;

	public Session getCurrentSession() throws ORMException;

	public Dialect getDialect() throws ORMException;

	public Session openNewSession(Connection connection) throws ORMException;

	public Session openSession() throws ORMException;

}
