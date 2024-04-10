package com.rays;

public class CountInt {
	public static void main(String[] args) {
		int count =0;
		String s = "Shrutisp23";
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isDigit(c)) {
				count++;
				System.out.println(c);
			}
		}
		System.out.println("the no of int in given string is : "+count );

	}

}
