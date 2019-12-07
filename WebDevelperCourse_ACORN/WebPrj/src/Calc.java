import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// servlet-api.jar�� �����ϴ� ���
// 1. ������ ���� ������ �߻����� �ʵ��� classpath�� �����ϱ�
// 2. ������ �� ���� �������� �ϱ� ���� ����

@WebServlet("/calc")
public class Calc extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		PrintWriter out = response.getWriter(); // response ���

		int x = 0;
		int y = 0;
		String temp = request.getParameter("x"); // request �Է�
		String temp1 = request.getParameter("y"); // request �Է�
		int result = 0;

		if (temp != null && temp1 != null) {
			x = Integer.parseInt(temp);
			y = Integer.parseInt(temp1);
		}
		String op = request.getParameter("op");
		
		switch(op) {
			case "����" : result = x+y; break;
			case "����" : result = x-y; break;
			case "����" : result = x*y; break;
			case "������" : result = x/y; break;
		}
		
		out.println("��� ��� : "+result);
		out.println("<a href= \"calc.html\"> ����������. </a>");
	}
}