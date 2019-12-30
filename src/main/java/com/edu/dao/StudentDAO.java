package com.edu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.edu.bean.Student;
import com.edu.servlet.DBUtils2;

public class StudentDAO {
	public Student getLogin(String username, String password) {
		Student student = new Student();
		Connection conn = DBUtils2.getConn();
		String sql = "select id ,username,password,sex,clase from student where username=? and password=md5(?)";
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, username);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			while (rs.next()) {
				student = new Student();
				student.setId(rs.getInt("id"));
				student.setUsername(rs.getString("username"));
				student.setPassword(rs.getString("password"));
				student.setSex(rs.getString("sex"));
				student.setClase(rs.getString("clase"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtils2.close(rs);
			DBUtils2.close(stmt);
			DBUtils2.close();
		}

		return student;

	}
}
