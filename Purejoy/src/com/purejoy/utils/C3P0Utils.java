package com.purejoy.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Utils {
	static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

	/**
	 * 获取连接的方法
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		Connection conn = tl.get();
		if (conn == null) {
			conn = dataSource.getConnection();
			tl.set(conn);
		}
		return conn;

	}

	public static ComboPooledDataSource getDataSource() throws SQLException{
		
		return dataSource;
	}
	
	
	/**
	 * @throws SQLException
	 * 
	 */
	public static void startTransaction() throws SQLException {
		getConnection().setAutoCommit(false);

	}

	public static void commit() throws SQLException {
		getConnection().commit();
		close(getConnection());
	}

	public static void rollback() throws SQLException {
		getConnection().rollback();
		close(getConnection());
	}

	/**
	 * 关闭资源的操作
	 */
	public static void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void close(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void close(Connection conn) {
		if (conn != null) {
			try {
				tl.remove();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void close(Connection conn, Statement stmt) {
		close(conn);
		close(stmt);
	}

	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		close(conn);
		close(stmt);
		close(rs);
	}

}
