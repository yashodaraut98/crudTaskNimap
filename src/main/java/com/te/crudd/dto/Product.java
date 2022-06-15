package com.te.crudd.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int p_id;
private int c_id;
private String p_name;
private int p_quantity;
private int p_price;
public Product() {
	
}
public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
public int getC_id() {
	return c_id;
}
public void setC_id(int c_id) {
	this.c_id = c_id;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public int getP_quantity() {
	return p_quantity;
}
public void setP_quantity(int p_quantity) {
	this.p_quantity = p_quantity;
}
public int getP_price() {
	return p_price;
}
public void setP_price(int p_price) {
	this.p_price = p_price;
}
public Product(int p_id, int c_id, String p_name, int p_quantity, int p_price) {
	super();
	this.p_id = p_id;
	this.c_id = c_id;
	this.p_name = p_name;
	this.p_quantity = p_quantity;
	this.p_price = p_price;
}
@Override
public String toString() {
	return "Product [p_id=" + p_id + ", c_id=" + c_id + ", p_name=" + p_name + ", p_quantity=" + p_quantity
			+ ", p_price=" + p_price + "]";
}

}
