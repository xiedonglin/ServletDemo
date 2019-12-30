package com.purvar.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		StudentService service=new StudentService();
		service.checkUserLogin(username, password);
		System.out.println("login ok");
	}
	
}
