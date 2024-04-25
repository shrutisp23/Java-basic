package com.rays.oops.deep;

public class Employee implements Cloneable{
	private String name;
	private Address permanentAddress;
	  private Address localAddress;
	
	
	public Employee (String name, Address permanentAddress,Address localAddress) {
    this.name = name;
	this.permanentAddress = permanentAddress;
	this.localAddress =  localAddress;
	

	
} 
	
}
