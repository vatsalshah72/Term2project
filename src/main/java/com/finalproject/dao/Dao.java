package com.finalproject.dao;
import java.sql.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.finalproject.*;
import com.finalproject.model.Model;


public class Dao implements Daointerface
{
Connection connection = null;
String url ="jdbc:mysql://127.0.0.1:3306/?user=root";
String pass = "1234";
String user ="root";


private static final String insert_query= "insert into users  values " + "(?,?,?,?,?,?,?,?)";

	
	public Connection getconnection()
	{
	
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, pass);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

			return connection;
		
	}

	

	@Override
	public void delete() 
	{
		try 
		{
			Connection connect = getconnection();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

	@Override
	public void update() 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, pass);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public boolean view() 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, pass);
			
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return false;
	}



	public void Insert(Model model) 
	{
		try(Connection connection = getconnection()) 
		{
			
			
			
			PreparedStatement preparedStatement = connection.prepareStatement(insert_query);
			preparedStatement.setString(1, model.getUsername());
			preparedStatement.setString(2, model.getPassword());
			preparedStatement.setString(3, model.getNumber());
			preparedStatement.setString(4, model.getGender());
			preparedStatement.setString(5,model.getAddress());
			preparedStatement.setString(6, model.getCity());
			preparedStatement.setInt(7, model.getUid());
			preparedStatement.setString(8, model.getEmail());
			int count = preparedStatement.executeUpdate();
			if (count>0)
			{
				System.out.print("register success ");
			}
			else
			{
				
				System.out.println("register failure");
			}
			
			
			
			
			
			
		} 
		catch (Exception e) 
		{
			
			System.out.println(e.getMessage());;
		} 
	}
	
	public boolean check(String user, String pass)
	{
		try(Connection connection = getconnection())
		{
		String query1 = "select username,password from users";
		Statement st =  connection.createStatement();
		ResultSet rs = st.executeQuery(query1);
		while(rs.next())
		{
			if (rs.getString("username")==user)
			{
				if(rs.getString("password")==pass)
					return true;
				
			}
			
		}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());;
			
		}
		return false;
		
		
	}


	
	
}
