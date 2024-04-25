package com.rays.oops.abs;

public class TRiangle extends Shape1 {
   private int length;
   private int  height;
   int area;
	public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
	@Override
	public int area() {
		 area = (int) (0.5 * length * height);
			System.out.println(" Triangle area is "+area);
			return area;
			

	}

}
