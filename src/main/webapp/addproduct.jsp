<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>only admins can add the products</h1>
<form action = "Upload" method = "post"
         enctype = "multipart/form-data">
         <label for="name"><strong>Poduct Name</strong></label>
        <input type="text" placeholder="Enter Product Name" name="name" required>
         
        
        <label for="price"><strong>Poduct Price</strong></label>
        <input type="text" placeholder="Enter Product Price" name="price" required>
         
         <input type = "file" name = "image" size = "50"  placeholder="upload image"/>
         <br/>
         
        </form>

</body>
</html>