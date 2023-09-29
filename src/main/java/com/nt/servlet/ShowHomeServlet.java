package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowHomeServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		
		//set response content type
		res.setContentType("text/html");
		//get printwroter
		PrintWriter pw=res.getWriter();
		//write op to response obj
		pw.println("<h1 style='color:red;text-align:centre'>welcome to servlet</h1>");
		
		pw.close();
	}

}
