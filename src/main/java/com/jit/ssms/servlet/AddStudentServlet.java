package com.jit.ssms.servlet;

import com.jit.ssms.daoimp.StudentDaoImo;
import com.jit.ssms.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddStudent")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		StudentDaoImo daoImo = new StudentDaoImo();
		Student student = new Student(0, request.getParameter("name"), request.getParameter("gender"),
				Integer.parseInt(request.getParameter("age")), request.getParameter("classs"),
				request.getParameter("major"));

		daoImo.insertStudent(student);
		request.setAttribute("list", daoImo.selectAllStudent());
		request.getRequestDispatcher("/studentlist.jsp").forward(request, response);
	}

}
