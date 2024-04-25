package com.rays.oops.abs;

public class Circle extends Shape1 {
	private int radius;
	public static final double PI = 3.14;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public  int  area() {
		area = (int) (PI*radius*radius); 
		System.out.println("Circle area is "+area);
		return area;
	}

}
