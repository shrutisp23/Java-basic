package com.rays.oops.abs;

public class TestShape {
	public static void main(String[] args) {

		Rectangle r = new Rectangle();

		r.area();
		r.sum();
		

		Shape s = new Rectangle();
		
		s.area();
		s.sum();
		
		
		Shape.sum();

	}
}
