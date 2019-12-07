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

@WebServlet("/hello")
public class Nana extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		PrintWriter out = response.getWriter(); // response ���

		// localhost:8080/hello?cnt=3
		String temp = request.getParameter("cnt"); // request �Է�
		int cnt = 10;

		if (temp != null && !temp.equals(""))
			cnt = Integer.parseInt(temp);

		for (int i = 0; i < cnt; i++) {
			out.print("�ȳ� <br>");
		}
		
		String x = request.getParameter("x");
			out.print(x);
			
		out.println("<a href= \"index.html\"> ����������. </a>");
	}
}