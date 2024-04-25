package com.rays.oops.abs;

public class TestShape1 {
	public static void main(String[] args) {
		int sum = 0;
		Shape1[] s = new Shape1[3];
		s[0] = Shape1.getShape(1);
		s[1] = Shape1.getShape(2);
		s[2] = Shape1.getShape(3);
		Rectangle1 r = (Rectangle1) s[0];
		r.setLength(10);
		r.setBreadth(20);
		
		Circle c = (Circle) s[1];
		c.setRadius(5);
		
		TRiangle t = (TRiangle) s[2];
		
		t.setLength(5);
		t.setHeight(4);
		
		
		for (int i = 0; i < s.length; i++) {

			int p = s[i].area();
			sum = sum + p;
			
			

		}
		System.out.println("Total area is " + sum);

	}
}
