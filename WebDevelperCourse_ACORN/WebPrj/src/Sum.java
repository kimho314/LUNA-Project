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

@WebServlet("/sum")
public class Sum extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		PrintWriter out = response.getWriter(); // response ���

		int x = 0;
		int y = 0;
		String[] xs_ = request.getParameterValues("x");
		int sum = 0;

		for (int i = 0; i < xs_.length; i++) {
			if (xs_[i] != null & !xs_[i].equals("")) {
				sum += Integer.parseInt(xs_[i]);
			}
		}

		out.println("��� ��� : " + sum);
		out.println("<a href= \"sum.html\"> ����������. </a>");
	}
}