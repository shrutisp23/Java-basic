package com.rays.oops.interf;

public class Businessman1 extends Student implements Richman1  {

	@Override
	public void donation() {
		System.out.println("Businessman donation");
		
	}

	@Override
	public void party() {
		System.out.println("Business Party");
		
	}

}
