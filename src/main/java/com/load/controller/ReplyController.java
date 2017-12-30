package com.load.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.load.service.ReplyService;
import com.load.service.impl.ReplyServiceImpl;

/**
 * Servlet implementation class ReplyController
 */
@WebServlet("/ReplyController")
public class ReplyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReplyService replyService = new ReplyServiceImpl();
       
    public ReplyController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		int currentPage = 1;
		// 每页显示的记录数
		int pageCount = 5;
		String temp = request.getParameter("page");
		if (null != temp) {
			currentPage = Integer.parseInt(temp);
		}
		String replies = replyService.getReplyByPage(currentPage, pageCount);
		int totalPage = replyService.getTotalPage(pageCount);
		/*request.setAttribute("currentPage", currentPage);
		request.setAttribute("replies", replies);
		request.setAttribute("totalPage", totalPage);
		request.getRequestDispatcher("/index.jsp").forward(request, response);*/
		response.getWriter().print((currentPage) == totalPage ? "0" : (currentPage+1));
		response.getWriter().print(replies);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
