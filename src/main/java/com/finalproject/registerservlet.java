package com.finalproject;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.finalproject.dao.Dao;
import com.finalproject.model.Model;

/**
 * Servlet implementation class registerservlet
 */
public class registerservlet extends HttpServlet {
		
		private int uid=100;
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
		
		
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		uid++;
		Model m  = new Model();
		m.setAddress(request.getParameter("address1"));
		m.setCity(request.getParameter("city"));
		m.setEmail(request.getParameter("email"));
		m.setGender(request.getParameter("gender"));
		m.setNumber(request.getParameter("phone"));
		m.setPassword(request.getParameter("password"));
		m.setUid(uid);
		m.setUsername(request.getParameter("username"));
		Dao d  = new Dao();
		d.Insert(m);
		
	RequestDispatcher rd = request.getRequestDispatcher("index.html");
	rd.forward(request, response);
			
	}

}
