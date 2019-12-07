package com.edu.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FlowFilterTwo implements Filter
{
	String charset;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
		System.out.println("init() ȣ�� ....... two");
		charset = filterConfig.getInitParameter("en");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException
	{
		//request.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding(charset);
		System.out.println("doFilter() ȣ�� �� ........ two");
		chain.doFilter(request, response);
		System.out.println("doFilter() ȣ�� �� ........ two");
	}
	
	@Override
	public void destroy()
	{
		System.out.println("destroy() ȣ�� ....... two");
	}
}
