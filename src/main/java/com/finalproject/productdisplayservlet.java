package com.finalproject;
import com.finalproject.*;
import com.finalproject.dao.Dao;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class productdisplayservlet
 */
public class productdisplayservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		doGet(request, response);
		Dao d= new Dao();
		
		try 
		{
			Connection connect = d.getconnection();
			String query = "Select * from products";
			Statement st = connect.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			
			
			
		}
		catch(Exception e) 
		{
			
			
		}
	}

}
