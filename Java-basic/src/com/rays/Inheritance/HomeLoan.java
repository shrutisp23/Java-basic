package com.rays.Inheritance;

public class HomeLoan {
public static void main(String[] args) {
	AxisBank ab = new AxisBank();
	Bank b = new AxisBank();
	Bank b1 = new HDFCBank();
	Bank b2 = new ICICIBank();
	b.interestRate();
	b1.interestRate();
	b2.interestRate();
	ab.interestRate();
	System.out.println(ab.getName());
	
}
}
