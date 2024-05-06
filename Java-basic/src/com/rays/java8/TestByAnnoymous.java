package com.rays.java8;

public class TestByAnnoymous {
	public static void main(String[] args) {
		
	
   Hello h = new Hello() {
	   
	   @Override
	   public void say() {
		  System.out.println("Functional Interface By Annonymous Function");

	   }
   };
   h.say();
	}
};
