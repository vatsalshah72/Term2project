<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<!DOCTYPE HTML>
<html>
<head>
<title>Your Cart</title>
<link rel="stylesheet" href="cart.css" />
<link rel="stylesheet" href="topstyle.css" />
</head>
<body bgcolor="grey">
    
    <div id="cartItems">
        <h2>Shopping Cart</h2>
        <div id="tableItems">
            {% for row in product %}
            <div>
                <hr id="seperator">
                
                <div id="itemPrice">
                    ₹{{row[0]}}
                </div>
                
                <div id="itemImage">
                    <img src={{url_for('static', filename='uploads/'+row[3])}} id="image"/>
              </div>
               
            <hr id="seperator">
		    <div id="total">
			    <span id="subtotal">Subtotal</span> : ₹{{tp}}
            </div>
        </div>
    </div>
    <a href="/checkout">Proceed to checkout</a>
    
</div>
</body>
</html>
