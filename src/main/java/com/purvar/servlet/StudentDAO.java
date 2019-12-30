package com.purvar.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.purvar.servlet.*;
import com.purvar.servlet.Student;
import com.purvar.servlet.DBUtils;

public class StudentDAO {
		public static Student getLogin(String username,String password) {
			Student student = null;
			
			Connection conn = DBUtils.getConn();
			String sql ="select id,username,password,sex clase from student where username = ? and password = md5(?)";
			PreparedStatement stmt = null;
			ResultSet   rs = null;
			try {
				stmt = conn.prepareStatement(sql);
				stmt.setString(1,username);
				stmt.setString(2,password);
				//conn.prepareStatement(sql);
				stmt.executeQuery();
				while(rs.next()) {
					student = new Student();
					student.setId(rs.getInt("id"));
					student.setUsername(rs.getString("username"));
					student.setPassword(rs.getString("password"));
					student.setSex(rs.getString("sex"));
					student.setClase(rs.getString("clase"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
					DBUtils.close(rs);
					DBUtils.close(stmt);
					DBUtils.close();
				
			}
			
			
			return student;
		}
}

