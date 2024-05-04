package com.rays.thread;

public class TestRunnable implements Runnable {
	String name = null;

	public TestRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " = " + name);
		}
	}
}
