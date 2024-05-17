package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/secondEx")
public class SecondExample  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=	(String) req.getAttribute("username");
		
		System.out.println("username "+username);
		
		System.out.println("req secound "+req);
		
		PrintWriter pw=resp.getWriter();
		pw.write("Hello How are you chaitanya  , It is get method in secound servlet");
		
		/*
		 * RequestDispatcher rd=req.getRequestDispatcher("thirdEx");
		 * req.setAttribute("username", username); rd.forward(req, resp);
		 */
	}
	
}
