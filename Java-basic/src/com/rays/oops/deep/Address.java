package com.rays.oops.deep;

public class Address implements Cloneable{
	private String street;
    private String city;
    private String state;
    private String zipCode;
    public Address(String street, String city, String state, String zipcode ) {
    	this.street = street;
    	this.city = city;
    	this.state  = state;
    	this.zipCode = zipcode;
    }
   
}


