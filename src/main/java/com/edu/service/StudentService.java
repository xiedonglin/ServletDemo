package com.edu.service;

import com.edu.bean.Student;
import com.edu.dao.StudentDAO;

public class StudentService {
	public Student checkUserLogin(String username,String password) {
		StudentDAO studentDAO =new StudentDAO();
		Student student =studentDAO.getLogin(username, password);
		return student;
		
	}

}
