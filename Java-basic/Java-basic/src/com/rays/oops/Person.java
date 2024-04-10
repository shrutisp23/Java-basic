package com.rays.oops;

import java.util.Date;

public class Person {
	private String name; 
	private Date d;
	private String add;
	public static final int AGE = 20;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public static int getAge() {
		return AGE;
	}
	
	

}
