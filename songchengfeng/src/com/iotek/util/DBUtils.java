package com.iotek.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtils {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;

	static {
		
		InputStream in = DBUtils.class.getResourceAsStream("/db.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
			url = prop.getProperty("mysql.url");
			username = prop.getProperty("mysql.username");
			password = prop.getProperty("mysql.password");
			driver = prop.getProperty("mysql.driver");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConn() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
	}

}
