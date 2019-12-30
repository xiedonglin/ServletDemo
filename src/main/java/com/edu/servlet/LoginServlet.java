package com.edu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edu.bean.Student;
import com.edu.service.StudentService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
        HttpSession session = request.getSession(true);
        String username = request.getParameter("username");
		String password = request.getParameter("password");
		StudentService service=new StudentService();
		Student sd = service.checkUserLogin(username, password);
		if(sd != null) {


		    Cookie cookie = new Cookie("xiedonglin","helloworld");
		    response.addCookie(cookie);


		    request.getSession().setAttribute("student", sd);
			response.sendRedirect(request.getContextPath()+"/user/info.jsp");
		}else {
			response.sendRedirect(request.getContextPath()+"?error=ture");
		}

	}

}
