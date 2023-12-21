package com.jit.ssms.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {


	private String logon_page;

	private String register_page;

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		resp.setContentType("text/html;");
		resp.setCharacterEncoding("utf-8");
		HttpSession session = req.getSession();

		String request_uri = req.getRequestURI();

		String ctxPath = req.getContextPath();

		String uri = request_uri.substring(ctxPath.length());

		System.out.println("uri:" + uri);
		if (uri.equals(logon_page) || uri.equals(register_page)) {
			chain.doFilter(request, response);
			return;
		} else {

			if (null != session.getAttribute("uname") && "" != session.getAttribute("uname")) {
				chain.doFilter(request, response);
				return;
			} else {
				String msg = "??δ?????";
				String url = "Errorer";
				req.setAttribute("err", msg);
				RequestDispatcher dis = req.getRequestDispatcher(url);
				dis.forward(req, resp);
			}
		}
	}

	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		logon_page = "/login.jsp";
		System.out.println(logon_page);
		if (null == logon_page) {
			throw new ServletException("????????????????");
		}
	}

}