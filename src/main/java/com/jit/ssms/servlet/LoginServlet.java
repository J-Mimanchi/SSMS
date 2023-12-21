package com.jit.ssms.servlet;

import com.jit.ssms.daoimp.LoginDaoImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String uname = request.getParameter("username");
		String upwd = request.getParameter("password");
		LoginDaoImp log = new LoginDaoImp();
		if (log.findUser(uname, upwd)) {
			request.getSession().setAttribute("uname", "admin");
			response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", "./index.jsp");
		}
		request.setAttribute("error", "用户名或密码错误");
		RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/login.jsp");
		rd.forward(request, response);
	}

}
