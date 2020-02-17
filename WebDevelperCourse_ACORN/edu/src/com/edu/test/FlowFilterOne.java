package com.edu.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FlowFilterOne implements Filter
{
	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
		System.out.println("init() ȣ�� ....... one");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException
	{
		System.out.println("doFilter() ȣ�� �� ....... one");
		chain.doFilter(request, response);
		System.out.println("doFilter() ȣ�� �� ....... one");
	}
	
	@Override
	public void destroy()
	{
		System.out.println("destroy() ȣ�� ........ one");
	}
}