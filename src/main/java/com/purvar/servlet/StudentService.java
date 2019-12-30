package com.purvar.servlet;

import com.purvar.servlet.*;

public class StudentService {
	
	
	/*
	 * 
	 * 
	 * 验证是否成功
	 * 
	 * 
	 * */
	
	
	
	public boolean checkUserLogin(String username,String password) {
		StudentDAO student_DAO= new StudentDAO();
		Student student = StudentDAO.getLogin(username, password);
		if(student==null) {
			return false;
		}
		return true;
	}
}