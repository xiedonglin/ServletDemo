package com.edu.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
        throws IOException, ServletException {
        // TODO 自动生成的方法存根
        System.out.println("adFilter start");
        chain.doFilter(req, resp);
        System.out.println("end");

    }

    public void destroy() {
        // TODO 自动生成的方法存根
        // Filter.super.destroy();
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO 自动生成的方法存根
        // Filter.super.init(filterConfig);
        System.out.println("Filter init");
    }

}
