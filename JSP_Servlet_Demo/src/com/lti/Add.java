package com.lti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Add extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		/*
		 * String i = req.getParameter("n1"); String j = req.getParameter("n2");
		 */

		/* String k = i + j; */

		/*
		 * System.out.println(k);
		 */

		int i = Integer.parseInt(req.getParameter("n1"));

		int j = Integer.parseInt(req.getParameter("n2"));

		int k = i + j;

		/*
		 * PrintWriter printWriter = res.getWriter();
		 * 
		 * printWriter.println("Result is " + k);
		 */

		// Display to another Servlet

		/*
		 * req.setAttribute("Value", k);
		 */
		RequestDispatcher dispatcher = req.getRequestDispatcher("result");
		dispatcher.forward(req, res);

		/* res.sendRedirect("result"); */

		int m = k * k;

		//Session Management
		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("m", m);
		
	}

}
