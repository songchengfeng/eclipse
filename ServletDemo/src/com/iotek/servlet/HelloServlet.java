package com.iotek.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		@SuppressWarnings("unused")
		PrintWriter pw = resp.getWriter();
		String userName = req.getParameter("userName");
		String psw = req.getParameter("password");
		String msg = "";
		if ("abc".equals(userName) && "123".equals(psw)) {
			msg = "login successful";
		} else {
			msg = "login fail";
		}

		req.setAttribute("message", userName + "," + msg);
		System.out.println(userName + "," + msg);
		
		// pw.write("<p style='color:red;'>the data from
		// servlet</p><div>hello,world!</div>");
		// pw.flush();
		// pw.close();
		req.getRequestDispatcher("first.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("------post-------");
		doGet(req, resp);
	}

}
