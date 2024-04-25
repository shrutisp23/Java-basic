package com.rays.exception;

public class TestLoginException {
public static void main(String[] args) {
	System.out.println("Before");
	String name = "admi";
	try {
		if (name.equals("admin")) {
			System.out.println("valid user");
		}else {
			throw new LoginException("invalid user");
		}
	}catch(Exception e) {
		System.out.println("Exception " +e);
	}
	finally {
		System.out.println("finally");
	}
	System.out.println("After");
}
}
