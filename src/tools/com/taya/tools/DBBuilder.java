/**
 * TAYAFOOD 2018
 */
package com.taya.tools;

import java.util.Map;

import com.taya.kernel.dao.db.DB;
import com.taya.utils.StringUtil;

/**
 * @author AnMTD
 */
public class DBBuilder {

	public static void main(String[] args) {
		Map<String, String> arguments = ArgumentsUtil.parseArguments(args);

		String databaseName = arguments.get("db.database.name");

		String databaseTypesString = arguments.get("db.database.types");

		String[] databaseTypes = null;

		if (databaseTypesString == null) {
			databaseTypes = DB.TYPE_ALL;
		} else {
			databaseTypes = StringUtil.split(databaseTypesString);
		}

		String sqlDir = arguments.get("db.sql.sqlDir");

		new DBBuilder(databaseName, databaseTypes, sqlDir);

		System.exit(0);
		
	}

	public DBBuilder(String databaseName, String[] databaseTypes, String sqlDir) {

	}

	private void _buildSQLFile(String sqlDir, String fileName) {

	}

	private void _buildCreateFile(String sqlDir) {

	}

	private String _databaseName;
	private String[] _databaseTypes;

}
