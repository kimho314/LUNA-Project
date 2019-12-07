package com.newlecture.web.storage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/app")
public class WebStorage extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int count = 0;

		// ����ҿ� count���� �ִٸ� �о�ͼ� �����ؾ���
		// 1. application ����� ���
		// ServletContext application = req.getServletContext();
		// Object _count = application.getAttribute("count");

		// 2. session ����� ���
		// HttpSession session = req.getSession();
		// Object _count = session.getAttribute("count");

		// 3. Cookie ����� ��� : Ŭ���̾�Ʈ(��������) �����
		/*
		Object _count = null;
		Cookie[] cookies = req.getCookies();

		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("count")) {
					_count = c.getValue();
					break;
				}
			}
		}
		*/
		
		// 4. TextField�� �̿��� �����
		Object _count = req.getParameter("count");
		
		if (_count != null) {
			count = Integer.parseInt(String.valueOf(_count));
		}

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		out.printf("count: %d <br >", count++);
		out.printf("<form>"
				+ "<input type=\"text\" name=\"count\" value=\"%d\"/><input type=\"submit\" name=\"+\">"
				+ "</form>", count);
		
		// application.setAttribute("count", count);
		// session.setAttribute("count", count);
		/*
		Cookie cookie = new Cookie("count", Integer.toString(count));
		cookie.setPath("/");
		int expiry = 5;
		cookie.setMaxAge(expiry);
		// ��Ű�� Ű�� ���Ƶ� ��ΰ� �ٸ��� �������� �ְ� �ȴ�.
		// �������� ��ο� ���� �� ������ ������ ���������.
		resp.addCookie(cookie);
		*/
	}
}
