package com.edu.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestServletContextListener implements ServletContextListener
{
	public TestServletContextListener()
	{
		System.out.println("TestservletContextListener ��ü ����");
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce)
	{
		System.out.println("ServletContext ��ü �ʱ�ȭ");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce)
	{
		System.out.println("ServletContext ��ü ����");
	}
}
