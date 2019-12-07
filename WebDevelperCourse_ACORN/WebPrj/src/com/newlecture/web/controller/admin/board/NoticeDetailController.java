package com.newlecture.web.controller.admin.board;

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

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;
import com.newlecture.web.service.newlec.NewlecNoticeService;

@WebServlet("/admin/board/notice/detail")
public class NoticeDetailController extends HttpServlet {
	
	private NoticeService noticeService ;
	
	public NoticeDetailController() {
		noticeService = new NewlecNoticeService();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// 1. ����ڰ� ��û�� id�� �Է� ����
		int id = Integer.parseInt(request.getParameter("id"));
		// 2. ������ ����
		Notice notice = noticeService.getNoticeById(id);
		// 3. ����ϴ� �������� ����
		request.setAttribute("n", notice);
		
		request.getRequestDispatcher("detail.jsp").forward(request, response);
	}
}
