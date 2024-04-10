package com.rays.oops;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.setBorderWidth(5);
		s.setColor("Red");
		System.out.println("Border width is " +s.getBorderWidth()); 
		System.out.println("Color  is " +s.getColor()); 

	}

}
