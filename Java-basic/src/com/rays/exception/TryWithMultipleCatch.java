package com.rays.exception;

public class TryWithMultipleCatch {
	public static void main(String[] args) {
		int a =10;
		int b =0;
		String name = null;
		try {
			int c = a/b;
			System.out.println("division = "+c);
			System.out.println(name.length());
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
