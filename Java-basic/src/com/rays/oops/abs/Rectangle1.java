package com.rays.oops.abs;


public class Rectangle1 extends Shape1 {
   private int length;
   private int breadth;
	public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getBreadth() {
	return breadth;
}
public void setBreadth(int breadth) {
	this.breadth = breadth;
}
	@Override
	public int area() {
		area  = length*breadth;
		System.out.println("rectangle area is "+area);
		return area;

		
	}

}
