package com.rays.java8;

@FunctionalInterface
public interface DefaultStaticInterface {
    public void abstractMethod();
    public default void defaultMethod() {
    	System.out.println("default Method");
    }
    public static void staticMethod() {
    	System.out.println("static method");
    }
    
}
