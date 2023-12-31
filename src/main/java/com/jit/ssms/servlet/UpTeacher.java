package com.jit.ssms.servlet;

import com.jit.ssms.daoimp.TeacherDaoImo;
import com.jit.ssms.model.Teacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpTeacher")
public class UpTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		TeacherDaoImo daoImo = new TeacherDaoImo();
		Teacher teacher = new Teacher(Integer.parseInt(request.getParameter("number")), request.getParameter("name"),
				request.getParameter("gender"), Integer.parseInt(request.getParameter("age")),
				request.getParameter("classs"));
		daoImo.updateTeacher(teacher);
		request.setAttribute("list", daoImo.selectAllTeacher());
		request.getRequestDispatcher("/teacherlist.jsp").forward(request, response);
	}

}
