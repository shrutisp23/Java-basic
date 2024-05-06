package com.rays.java8;

public class TestByLambdaExpression {
public static void main(String[] args) {
	  Hello h = () -> {
		  System.out.println("Lambda Expression");
		  
	  };
	  h.say();
}
}
