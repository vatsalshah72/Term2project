<%@page import="java.io.PrintWriter"%>
<%@page import="com.sun.crypto.provider.RSACipher"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.finalproject.dao.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
	<tr>
		<th>Name</th>
		<th>Image</th>
		<th>Price</th>
	</tr>
<%  

Dao d= new Dao();
ResultSet rs = null;
PrintWriter out1 = response.getWriter();
Blob image = null;
byte[] imgData = null;

try
{
	Connection connect = d.getconnection();
	String query = "Select * from products";
	Statement st = connect.createStatement();
	 rs = st.executeQuery(query);
	 
	 
}
catch(Exception e)
{
	System.out.println(e);
}


%>
 <%image = rs.getBlob("image");
 
 imgData = image.getBytes(1, (int) image.length());
 response.setContentType("image/gif");
 OutputStream o = response.getOutputStream(); 
 while(rs.next()){ %>
 	
 <tr >
 	<td><% out1.print(""+rs.getString("name")); %></td>
 	<td><img src = <% o.write(imgData) ; o.flush() ; o.close(); %> />  </td>
 	<td><% out1.print(""+rs.getString("price")); %></td>
 	
 </tr>

<%} %>
</table>
</body>
</html>