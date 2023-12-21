package com.jit.ssms.servlet;

import com.jit.ssms.daoimp.ClasssDaoImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/FindAllClasssNameByUp")
public class FindAllClasssNameByUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FindAllClasssNameByUp() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		ClasssDaoImp daoImo = new ClasssDaoImp();
		request.setAttribute("list", daoImo.selectAll());
		request.getRequestDispatcher("/addStudent.jsp").forward(request, response);
	}

}
