package com.rays;

public class SwitchCaseDiv {
	public static void main(String[] args) {
		int a = 8;
		int b = 2;
		
		System.out.println("For Sum = 1");
		System.out.println("For substract = 2");
		System.out.println("For Multiply = 3");
		System.out.println("For Divide =4");

		switch(1) {
		case 1:
			System.out.println("Sum is "+(a+b));
			break;
		case 2:
			System.out.println("substract is "+(a-b));
			break;
		case 3:
			System.out.println("Divide is "+(a/b));
			break;
		case 4:
			System.out.println("Multiply is "+(a*b));
			break;
	default:
		System.out.println("Nothing else");
	}
        
}
}