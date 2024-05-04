package com.rays.thread;

public class TestByRunnable {
public static void main(String[] args) {

	Thread t1 = new Thread(new TestRunnable("abc"));

	Thread t2 = new Thread(new TestRunnable("xyz"));

	t1.start();
	t2.start();


}
}
