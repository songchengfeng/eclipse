package com.iotek.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoServlet implements Servlet {
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("-----init------");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("-------service------");
		arg0.getRequestDispatcher("first.jsp").forward(arg0, arg1);
	}
	
	@Override
	public void destroy() {
		System.out.println("------destroy------");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}



	

}
