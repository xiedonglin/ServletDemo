package com.edu.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
        throws IOException, ServletException {
        // TODO �Զ����ɵķ������
        System.out.println("adFilter start");
        chain.doFilter(req, resp);
        System.out.println("end");

    }

    @Override
    public void destroy() {
        // TODO �Զ����ɵķ������
        // Filter.super.destroy();
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO �Զ����ɵķ������
        // Filter.super.init(filterConfig);
        System.out.println("Filter init");
    }

}
