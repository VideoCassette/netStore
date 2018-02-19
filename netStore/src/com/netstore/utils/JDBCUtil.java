package com.netstore.utils;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 
 * @author 陈东时
 * 
 *         mysql数据库连接池工具类 数据库对象为静态加载
 * 
 *         提供四个方法 1、 getCon 2、getState 3、getPreState 4、close
 */

public class JDBCUtil {

	private static String USER;
	private static String PASSWD;
	private static String URL;
	private static String DRIVER;

	private static Connection con = null;
	private static Properties prop = null;

	// 静态加载模块
	static {

		prop = new Properties();
		InputStream inStream;
		inStream = JDBCUtil.class.getClassLoader().getResourceAsStream(
				"jdbc.properties");
		try {
			prop.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		USER =  prop.getProperty("USER");
		PASSWD = prop.getProperty("PASSWD");
		URL = prop.getProperty("URL");
		DRIVER = prop.getProperty("DRIVER");
		try {

			Class.forName(DRIVER);

			con = DriverManager.getConnection(URL, USER, PASSWD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return Connection
	 * 
	 *         返回数据库连接对象
	 */
	public static Connection getCon() {
		return con;
	}

	/**
	 * 
	 * @return
	 * 
	 *         返回Statement
	 */
	public static Statement getState() {
		Statement state;
		try {
			state = con.createStatement();
			return state;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 
	 * @param sql
	 *            入参为需要执行的SQL语句
	 * @return 返回 PreparedStatement对象
	 */
	public static PreparedStatement getPreState(String sql) {
		PreparedStatement preState;
		try {
			preState = con.prepareStatement(sql);
			return preState;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * 数据库关闭工具类
	 * 
	 * @param io
	 *            入参为可关闭对象 Statement PrepareStatement Connection等
	 * 
	 *            可以有多个入参
	 */
	public static void close(Closeable... io) {
		for (Closeable closeable : io) {
			try {
				closeable.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
