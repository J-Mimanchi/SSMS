package com.jit.ssms.servlet;

import com.jit.ssms.daoimp.KechengDaoImp;
import com.jit.ssms.model.Kecheng;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddKecheng")
public class AddKecheng extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		KechengDaoImp daoImo = new KechengDaoImp();
		Kecheng classs = new Kecheng(0, request.getParameter("name"));
		daoImo.insert(classs);
		request.setAttribute("list", daoImo.selectAll());
		request.getRequestDispatcher("/kechenglist.jsp").forward(request, response);
	}

}
