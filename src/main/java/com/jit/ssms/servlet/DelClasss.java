package com.jit.ssms.servlet;

import com.jit.ssms.daoimp.ClasssDaoImp;
import com.jit.ssms.daoimp.StudentDaoImo;
import com.jit.ssms.model.Classs;
import com.jit.ssms.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/DelClasss")
public class DelClasss extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DelClasss() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClasssDaoImp daoImo = new ClasssDaoImp();
		StudentDaoImo studentDaoImo = new StudentDaoImo();
		ArrayList<Student> arrayList = new ArrayList<Student>();
		int id =Integer.parseInt(request.getParameter("id"));
		Classs classsname = daoImo.selectById(id);
		daoImo.delete(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("list", daoImo.selectAll());
		
		for(Student student : studentDaoImo.selectAllStudent())
		{
			if(student.getClasss().equals(classsname.getName()))
			{
				studentDaoImo.delclass(student.getId());
			}
		}
		
		request.getRequestDispatcher("/classslist.jsp").forward(request, response);
	}

}
