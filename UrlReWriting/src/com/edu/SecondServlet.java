package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
//@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
			
			PrintWriter pw=response.getWriter();
			
			//getting value from quesry String
			
			String n=request.getParameter("uname");
			
			pw.println("Welcome " +n);
			
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		
		
 	}

	

}
