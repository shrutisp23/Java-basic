package com.rays.oops;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile am = new Automobile();
		am.setColor("Grey");
		System.out.println(am.getColor());
		am.setMake("Done");
		System.out.println(am.getMake());
		am.setSpeed(150);
		System.out.println(am.getSpeed());
		am.setNO_OF_GEARS(5);
		System.out.println(am.getNO_OF_GEARS());
	}

}
