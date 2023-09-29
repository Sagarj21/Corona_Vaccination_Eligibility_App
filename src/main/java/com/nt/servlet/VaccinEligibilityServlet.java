package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VaccinEligibilityServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get print writer
		PrintWriter pw=res.getWriter();
		//set content type
		res.setContentType("text/html");
		//read form from data
		String name=req.getParameter("pname");
		int age =Integer.parseInt(req.getParameter("page"));
		String addrs=req.getParameter("paddrs");
		//write b logic
		if(age<18)
			pw.println("<h1 style='color:red;text-align:centre'>"+name+"you are not eligible for corona vaccin</h1>");
		else
			pw.println("<h1 style='color:red;text-align:centre'>"+name+"you are  eligible for corona vaccin ,take it</h1>");
		//add home hyprerlink 
		pw.println("<a href='http://localhost:9090/CoronaVaccinApp/corona_vaccin.html'><img src='images/home1.jpg'></a>");
		 
		
		//close stream
		pw.close();
	}//doget
}//class
