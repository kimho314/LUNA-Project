package com.newlecture.web.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newlecture.web.service.NoticeService;

@WebServlet("/notice/detail")
public class NoticeDetailController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ��¿� ���Ǵ� ���� : Model
		String noticeTitle = null;
		//int noticeId = 0;
		String noticeContent = null;
		String noticeWriter_id = null;
		int noticeHit = 0;
		String noticeRegdate = null;
		
		Integer id = Integer.parseInt(request.getParameter("id"));

		String url = "jdbc:oracle:thin:@112.223.37.243:1521/xepdb1";
		String sql = "select * FROM NOTICE where id = ? order by id desc ";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "ACORN", "newlec");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			rs.next();

			noticeTitle = rs.getString("title");
			noticeRegdate =rs.getString("regdate");
			noticeWriter_id = rs.getString("writer_id");
			noticeHit = Integer.parseInt(rs.getString("hit"));
			noticeContent = rs.getString("content");

			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// redirection
//		response.sendRedirect("detail.jsp"); // �帧�� ������� ������ ȣ���� �� �ִ�. (�帧�� �������� ������)
		
		request.setAttribute("title", noticeTitle);
		request.setAttribute("regdate", noticeRegdate);
		request.setAttribute("writer_id", noticeWriter_id);
		request.setAttribute("hit", noticeHit);
		request.setAttribute("content", noticeContent);
		// forwarding
		request
		.getRequestDispatcher("/WEB-INF/view/admin/board/notice/detail.jsp")
		.forward(request, response); // request, response �� ���� �������⶧����(�۾�����) �Է°��� ������ �帧�� �����ϴ� �ٸ� ������ ȣ��
	}
}
