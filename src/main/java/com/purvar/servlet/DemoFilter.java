package com.purvar.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoFilter implements Filter{
	public void destroy() {
		System.out.println("Filterdestroy");
	}
	@Override
	public void doFilter(ServletRequest res, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("doFilter start");
		chain.doFilter(res, resp);
		System.out.println("end  start");
	}
	public void init (FilterConfig config) throws ServletException{
		System.out.println("Filter init");
	}
}
