package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context3")
public class ServletContextTest3Servlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setContentType("text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		
		ServletContext sc = this.getServletContext();
		
		SharedObject obj1 = new SharedObject();
		obj1.setCount(100);
		obj1.setStr("��ü ���� �׽�Ʈ - 1");
		sc.setAttribute("data1", obj1);
		
		SharedObject obj2 = new SharedObject();
		obj2.setCount(200);
		obj2.setStr("��ü ���� �׽�Ʈ - 2");
		sc.setAttribute("data2", obj2);
		
		out.print("ServletContext��ü�� ������ ����� �Ͽ����ϴ�.!");
		out.close();
	}
}