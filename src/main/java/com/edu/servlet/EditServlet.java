package com.edu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.bean.Student;
import com.edu.service.StudentService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Edit")
public class EditServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + "----" + cookie.getValue());
        }
        response.sendRedirect(request.getContextPath() + "/user/infotest.jsp");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        // TODO Auto-generated method stub
        // doGet(request, response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        StudentService service = new StudentService();
        Student sd = service.checkUserLogin(username, password);
        if (sd != null) {
            request.getSession().setAttribute("student", sd);
            response.sendRedirect(request.getContextPath() + "/user/info.jsp");
        } else {
            response.sendRedirect(request.getContextPath() + "?error=ture");
        }

    }

}
