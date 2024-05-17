package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/firstEx")
public class FirstExample extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String username=	req.getParameter("username");
//		PrintWriter pw=resp.getWriter();
//		pw.write("Hello How are you "+username+" ,It is get method");
	
	System.out.println("fist Example" +username);
	System.out.println("req first "+req);
	
	RequestDispatcher rd=req.getRequestDispatcher("secondEx");
	req.setAttribute("username", username);
	rd.forward(req, resp);
	PrintWriter pw=resp.getWriter();
	pw.write("It is firstSerlvet ");
		
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username=	req.getParameter("userName");
		PrintWriter pw=resp.getWriter();
		pw.write("Hello How are you "+username+" , It is post method");
	}

	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username=	req.getParameter("userName");
		PrintWriter pw=resp.getWriter();
		pw.write("Hello How are you "+username+" ,  It is Delete method");
	}


}
