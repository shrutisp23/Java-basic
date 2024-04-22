package com.rays.Inheritance;

public class Shape {
	private String Color;
	public int borderWidth;

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public void area() {
		System.out.println("Shape Area Method");
	}


}
