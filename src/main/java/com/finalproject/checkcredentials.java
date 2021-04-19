package com.finalproject;
import com.finalproject.dao;
import com.finalproject.dao.Dao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class checkcredentials extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	String username = request.getParameter("uname");
	String password = request.getParameter("psw");
	Dao d = new Dao();
	boolean value = d.check(username,password);
	if (value==true)
	{
		RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
		rd.include(request, response);
		
	}
	
	else
		{
		RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
		}
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
