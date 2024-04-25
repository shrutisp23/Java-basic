package com.rays.exception;

public class TestArithmetic {
	public static void main(String[] args) {

		System.out.println("before exeption");

		try {
			int a = 50;

			int b = 0;

			int c = a / b;

			System.out.println("sum = " + c);

		} catch (Exception e) {

			System.out.println("Exception: " + e.getMessage());

		}

		System.out.println("after exception");

	}
}
