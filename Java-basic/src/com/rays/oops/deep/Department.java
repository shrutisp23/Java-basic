package com.rays.oops.deep;

import java.lang.reflect.Array;

public class Department implements Cloneable{
	private String name;
    private Employee emp1 ; 
    private  Employee emp2; 
    private Employee emp3; 
    private Employee emp4; 
	
    public Department (String name) {
		this.name = name;
		

}
    protected Object clone() throws CloneNotSupportedException {
        Department c = (Department) super.clone();
  
        
        return c;
    
}
	public void setName(String name) {
	this.name = name;
		
	}
	public String getName() {
		
		return name;
	}
}
