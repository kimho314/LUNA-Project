package com.newlecture.web.controller.admin.board;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;
import com.newlecture.web.service.newlec.NewlecNoticeService;

@WebServlet("/admin/board/notice/reg")
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 100, maxRequestSize = 1024 * 1024 * 100
		* 5)

public class NoticeRegController extends HttpServlet
{

	private NoticeService noticeService;

	public NoticeRegController()
	{
		noticeService = new NewlecNoticeService();
	}

	@Override
	public void init() throws ServletException
	{
		System.out.println("�ʱ�ȭ");
		super.init();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;UTF-8");

		request.getRequestDispatcher("reg.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		Date today = new Date();

		String title = request.getParameter("title");
		String content = request.getParameter("content");
		int result = 0;
		
		Collection<Part> parts = request.getParts();
		
		String fileNames = "";
		
		for (Part p : parts)
		{
			//Part titlePart = request.getPart("title");
			//Part filePart = request.getPart("file");
			//Part contentPart = request.getPart("content");
			
			// noticeService.insertNotice(title , content , "newlec");
			
			if(!p.getName().equals("file[]"))
				continue;
			
			Part filePart = p;
			String fileName = filePart.getSubmittedFileName();
			fileNames += (fileName + ",");
			
			
			ServletContext application = request.getServletContext();
			String urlPath = "/upload";
			String realPath = application.getRealPath(urlPath);

			File file = new File(realPath);
			if (!file.exists())
			{
				file.mkdirs();
			}
			else
			{
				System.out.println("���������");
			}

			System.out.println("realPath : " + realPath);

			InputStream fis = filePart.getInputStream();
			FileOutputStream fos = new FileOutputStream(realPath + File.separator + fileName);

			byte[] buf = new byte[1024];

			int size = 0;
			while ((size = fis.read(buf)) != -1)
			{
				fos.write(buf, 0, size);
			}
			fos.close();
		}
		
		// fileNmaes���� ������ ","�� ���� ����
		fileNames = fileNames.substring(0, fileNames.length()-1);
		
		
		result = noticeService.insertNotice(new Notice(title, content, "newlec", fileNames));
		if (result == 0)
		{
			response.sendRedirect("/error?code=2");
		}
		else
		{
			response.sendRedirect("list");
		}

		/*
		 * ���� ������Ʈ 1. �ұԸ� 2. ���������� ���� �������� ���� 3. ���� ����,, ���� ? -> �ҽ��ڵ� �����ϴ� ������� ����
		 */

	}
}
