/**
 * TAYAFOOD 2018
 */
package com.taya.kernel.dao.orm;

import java.io.Serializable;
import java.sql.Connection;

import com.taya.kernel.dao.orm.LockMode;
import com.taya.kernel.dao.orm.ORMException;
import com.taya.kernel.dao.orm.Query;
import com.taya.kernel.dao.orm.SQLQuery;

/**
 * @author AnMTD
 */
public interface Session {
	
	public void clear() throws ORMException;

	public Connection close() throws ORMException;

	public boolean contains(Object object) throws ORMException;

	public Query createQuery(String queryString) throws ORMException;

	public Query createQuery(String queryString, boolean strictName)
		throws ORMException;

	public SQLQuery createSQLQuery(String queryString) throws ORMException;

	public SQLQuery createSQLQuery(String queryString, boolean strictName)
		throws ORMException;

	public void delete(Object object) throws ORMException;

	public void evict(Object object) throws ORMException;

	public void flush() throws ORMException;

	public Object get(Class<?> clazz, Serializable id) throws ORMException;

	public Object get(Class<?> clazz, Serializable id, LockMode lockMode)
		throws ORMException;

	public Object getWrappedSession() throws ORMException;

	public Object load(Class<?> clazz, Serializable id) throws ORMException;

	public Object merge(Object object) throws ORMException;

	public Serializable save(Object object) throws ORMException;

	public void saveOrUpdate(Object object) throws ORMException;

}
