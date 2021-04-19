package com.finalproject.dao;
import com.finalproject.model.*;
import java.sql.*;
import com.finalproject.dao.*;
public class ProductDao 
{
public void addProduct(Productmodel p)

{
	
	
	try 
	{
		Dao d = new Dao();
		Connection connect = d.getconnection();	
		String insert_product = "insert into product  values" + "(?,?,?)" ;
		PreparedStatement preparedStatement = connect.prepareStatement(insert_product);
		preparedStatement.setString(1, p.getName1());
		
		preparedStatement.setInt(2,p.getPrice());
		preparedStatement.setBlob(3, p.getImage());
	}
	catch(Exception e)
	{
		
	}
}
}
