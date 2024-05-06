package com.rays.java8;

public class TestDefaultStaticInterface {
public static void main(String[] args) {
	DefaultStaticInterface ds = new DefaultStaticInterface() {

		@Override
		public void abstractMethod() {
			System.out.println("abstract method....!!!");
		}
	};
	ds.abstractMethod();

	ds.defaultMethod();

	DefaultStaticInterface.staticMethod();
  }
}
