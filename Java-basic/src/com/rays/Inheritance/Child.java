package com.rays.Inheritance;


public class Child extends Parent {
	public static void sum()
	{
		System.out.println("Child sum method");
	}
	public static void main(String[] args) {
	Parent c = new Child();
		c.sum();
		
	}

}
