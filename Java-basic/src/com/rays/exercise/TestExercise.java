package com.rays.exercise;

public class TestExercise {
	public static void main(String[] args) {
		Exercise e = new Exercise();
		e.s =10;
		System.out.println(e.s);
		e.max(10,20);
		e.min(10,20);
		e.randomNumber();
		e.factorial(5);
		e.reverse();
		
		Exercise.fibonacciSeries();
		int i = Exercise.divisibility();
		System.out.println(i);
		e.twoDArray(4, 5);
		e.traingle(4);
		e.armStrong();
		e.palindromeNumber();
		e.primeNumber(20);
		Exercise.harmonicSeries();
		e.consecutive();
		e.secondLargest();
		e.missingElement();
	
	}

}
