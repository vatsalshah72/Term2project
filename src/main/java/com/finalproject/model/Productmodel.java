package com.finalproject.model;

import java.io.InputStream;
import java.sql.Blob;

public class Productmodel 
{
private String name1;
private int price;

private InputStream image;

public InputStream getImage() {
	return image;
}
public void setImage(InputStream image) {
	this.image = image;
}
public String getName1() {
	return name1;
}
public void setName1(String name1) {
	this.name1 = name1;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
