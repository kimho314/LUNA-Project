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

@WebServlet("/calc2")
public class Calc2 extends HttpServlet {

	// GET�� ������ ó���� �ϰ�
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter(); // response ���

		int result = 0;
		
		Object result_ = request.getAttribute("result");
		if(result_ != null)
			result = (Integer)result_;
		
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<title>����</title>");
		out.write("</head>");
		out.write("<body>");

		out.write("	<form action=\"calc2\" method = \"post\">");
		out.printf("		<input type =\"text\" name =\"num\" readonly=\"readonly\" value = \"%d\" dir =\"rtl\"><br>",
				result);
		out.write("		<input type = \"submit\" name=\"btn\" value = \"1\">");
		out.write("		<input type = \"submit\" name=\"btn\" value = \"2\">");
		out.write("		<input type = \"submit\" name=\"btn\" value = \"3\"><br>");
		out.write("		<input type = \"submit\" name=\"btn\" value = \"����\">");
		out.write("		<input type = \"submit\" name=\"btn\" value = \"����\">");
		out.write("		<input type = \"submit\" name=\"btn\" value = \"���\">");

		out.write("	</form>");
		out.write("</body>");
		out.write("</html>");
	}
	
	// POST�� ���� ó��....
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int result = 0;
		String num = request.getParameter("num"); // request �Է�
		String btn = request.getParameter("btn"); // request �Է�
		String status = num;

		switch (btn) {
		case "1":
		case "2":
		case "3":
			status += btn;
			break;
		}

		result = Integer.parseInt(status);
		
		request.setAttribute("result", result);
		
//		�����̳� ������ ������ ����/���� �����ϴ� ������� ������ �ʾƼ� ������.
//		�̰��� ��ġ �����ϴ� ������ ��θ� ��Ż�ϴ� ������ �ν��� �ȴ�.
		
		doGet(request, response); 
	}
}