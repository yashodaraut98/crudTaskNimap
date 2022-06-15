package com.te.crud.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Data
//@Table(name="categories_Table")
public class Categories {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int c_id;
	//@Column(name="c_name")
	private String c_name;
	public Categories() {
		
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	@Override
	public String toString() {
		return "Categories [c_id=" + c_id + ", c_name=" + c_name + "]";
	}
	
	public Categories(int c_id, String c_name) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
	}
	

}
