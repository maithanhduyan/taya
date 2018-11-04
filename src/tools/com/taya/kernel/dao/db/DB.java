/**
 * TAYAFOOD 2018
 */
package com.taya.kernel.dao.db;

/**
 * @author AnMTD
 */
public interface DB {

	public static final String[] TYPE_ALL = { DB.TYPE_DB2, DB.TYPE_DERBY, DB.TYPE_FIREBIRD, DB.TYPE_HYPERSONIC,
			DB.TYPE_INFORMIX, DB.TYPE_INGRES, DB.TYPE_INTERBASE, DB.TYPE_JDATASTORE, DB.TYPE_MYSQL, DB.TYPE_ORACLE,
			DB.TYPE_POSTGRESQL, DB.TYPE_SAP, DB.TYPE_SQLSERVER, DB.TYPE_SYBASE };

	public static final String TYPE_DB2 = "db2";

	public static final String TYPE_DERBY = "derby";

	public static final String TYPE_FIREBIRD = "firebird";

	public static final String TYPE_HYPERSONIC = "hypersonic";

	public static final String TYPE_INFORMIX = "informix";

	public static final String TYPE_INGRES = "ingres";

	public static final String TYPE_INTERBASE = "interbase";

	public static final String TYPE_JDATASTORE = "jdatastore";

	public static final String TYPE_MYSQL = "mysql";

	public static final String TYPE_ORACLE = "oracle";

	public static final String TYPE_POSTGRESQL = "postgresql";

	public static final String TYPE_SAP = "sap";

	public static final String TYPE_SQLSERVER = "sqlserver";

	public static final String TYPE_SYBASE = "sybase";
}
