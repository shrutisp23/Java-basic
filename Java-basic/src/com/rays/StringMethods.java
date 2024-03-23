package com.rays;
 import java.lang.String ;
   //import java.util.*;
public class StringMethods {
	public static void main (String[] args) {
		
	
	String name = " Vijay Dinanath Chaouhan";
	System.out.println("length of string "+name.length());
	System.out.println(" 8th character of string "+name.charAt(8));
	System.out.println("Dina index is " +name.indexOf("Dina"));
	System.out.println("First i Position "+name.lastIndexOf("i"));
	System.out.println("Last i position "+name.length());
	System.out.println(" a is replaced by b"+name.replace("a","b"));
	System.out.println(" all a is replaced  by b "+name.replaceAll("a","b"));
	System.out.println(" chhota vijay "+name.toLowerCase());
	System.out.println("bada vijay "+name.toUpperCase());
	System.out.println(" starts with vijay "+name.startsWith("Vijay"));
	System.out.println("Ends with han "+name.endsWith("han"));
	System.out.println("substring "+name.substring(6));
	
	}
}
