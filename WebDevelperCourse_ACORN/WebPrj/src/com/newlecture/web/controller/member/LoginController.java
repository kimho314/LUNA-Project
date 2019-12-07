package com.newlecture.web.controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newlecture.web.entity.Member;
import com.newlecture.web.service.MemberService;
import com.newlecture.web.service.newlec.NewlecMemberService;

@WebServlet("/member/login")
public class LoginController extends HttpServlet
{
	private MemberService memberService;
	
	public LoginController()
	{
		memberService = new NewlecMemberService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;UTF-8");		
		
		String returnUrl = req.getParameter("returnUrl");
		req.setAttribute("returnUrl", returnUrl);
		
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String id = ""; // ����ڰ� ������ ����
		String pwd = "";
				
		id = req.getParameter("username");
		pwd = req.getParameter("password");
		String returnUrl = req.getParameter("return-url");
		
		boolean isValid = memberService.isValidMember(id, pwd);
		
		if(!isValid)
		{
			// ������ ���Ե� �α��� �������� ������
			resp.sendRedirect("login?error=1");
		}
		else
		{
			// �������� + �Ƕ� : Authentication and Authority
			// �� ������ ���� ������ �Ǿ����� �˸� -> ���� ���¸� ��� ������ �˾ƾ� ��
			// � ���¸� ��� ���ܾ� �ұ�?
			// index �Ǵ� ȸ���������� ������
			req.getSession().setAttribute("userName", id);
			
			if(returnUrl != null && !returnUrl.equals(""))
			{
				resp.sendRedirect(returnUrl);
			}
			else
			{
				resp.sendRedirect("/index");
			}
		}
	}
}
