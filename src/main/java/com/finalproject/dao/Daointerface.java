package com.finalproject.dao;

import com.finalproject.model.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Daointerface 
{
	

	public void delete();
	public void update();
	public void view();
	public void Insert(Model m);
	
}
