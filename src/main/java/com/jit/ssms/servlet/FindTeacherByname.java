package com.jit.ssms.servlet;

import com.jit.ssms.daoimp.TeacherDaoImo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/FindTeacherByname")
public class FindTeacherByname extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public FindTeacherByname() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		TeacherDaoImo daoImo = new TeacherDaoImo();
		request.setAttribute("list", daoImo.selectTeacherByName(request.getParameter("name")));
		request.getRequestDispatcher("/teacherlist.jsp").forward(request, response);
		doGet(request, response);
	}

}
