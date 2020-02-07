package com.lti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Result extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		/*
		 * int k = (int) req.getAttribute("Value");
		 */
		
		HttpSession httpSession = req.getSession();
		int m = (int) httpSession.getAttribute("m");

		PrintWriter printWriter = res.getWriter();
		/*
		 * printWriter.println("Addition is " + k);
		 */
		/*
		 * int k = Integer.parseInt(req.getParameter("Value"));
		 */

		printWriter.println("Multiplication is " + m);

	}
}
