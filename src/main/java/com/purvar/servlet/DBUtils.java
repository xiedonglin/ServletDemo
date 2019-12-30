package com.purvar.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
private static String url=null;
private static String username=null;
private static String pwd=null;
private static Connection conn=null;



static {	
	try {
		InputStream inputStream = DBUtils.class.getResourceAsStream("/jdbc.properties");
		Properties properties= new  Properties();
		properties.load(inputStream);
		String driver = properties.getProperty("driver");
		url = properties.getProperty("url");
		username = properties.getProperty("username");
		pwd = properties.getProperty("password");
		
		Class.forName(driver);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("加载文件 jbdc失败");
		
	}catch(ClassNotFoundException e){
		System.out.print("加载驱动失败");
		e.printStackTrace();
	}
}
public static Connection getConn() {
	try {
		if (conn == null  ||  conn.isClosed()) {
			conn = DriverManager.getConnection(url,username,pwd);
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return conn;
}
public static void close() {
	try {
		if(conn!=null) {
			conn.close();
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	System.out.println(DBUtils.getConn());
}
public static void close(PreparedStatement stmt) {
	// TODO Auto-generated method stub
	
}
public static void close(ResultSet rs) {
	// TODO Auto-generated method stub
	
}



}
