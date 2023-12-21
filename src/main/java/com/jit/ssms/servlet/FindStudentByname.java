package com.jit.ssms.servlet;

import com.jit.ssms.daoimp.StudentDaoImo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/FindStudentByname")
public class FindStudentByname extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FindStudentByname() {
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
		StudentDaoImo daoImo = new StudentDaoImo();
		request.setAttribute("list", daoImo.selectStudentByName(request.getParameter("name")));
		request.getRequestDispatcher("/studentlist.jsp").forward(request, response);
		doGet(request, response);
	}

}
