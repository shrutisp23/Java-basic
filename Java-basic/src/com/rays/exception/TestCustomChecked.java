package com.rays.exception;

public class TestCustomChecked {
	public static void main(String[] args) throws CustomChecked {
		 try{ 
			 dad();
		 }catch(CustomChecked e){
			 System.out.println("exception :"+e.getMessage());
		 }
	}
    public static void dad() throws CustomChecked {
    	mom();
    }
    public static void mom() throws CustomChecked {
    	son();
    }
    public static void son() throws CustomChecked {
    	CustomChecked e = new CustomChecked();
    	throw e;
    }
}
