package com.rays.oops;

public class Automobile {
	private String color;
	private int speed;
	private String make;
	public static int NO_OF_GEARS = 5;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public static int getNO_OF_GEARS() {
		return NO_OF_GEARS;
	}

	public static void setNO_OF_GEARS(int nO_OF_GEARS) {
		NO_OF_GEARS = nO_OF_GEARS;
	}

}
