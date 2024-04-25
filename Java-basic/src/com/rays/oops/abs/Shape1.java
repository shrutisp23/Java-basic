package com.rays.oops.abs;


public abstract class Shape1 {
	public int area;
    public abstract int area();
    public static Shape1 getShape(int i) {
		 if (i==1) {
			 return new Rectangle1();
			 
		 }
		 if (i==2) {
			 return new Circle();
		 }
		 if(i==3) {
			 return new TRiangle();
		 }
		return null;

	 
}
}