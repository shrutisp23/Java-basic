package com.rays.collection.equalshashcode;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection2 {
public static void main(String[] args) {
	// creates a collection 
	Collection c = new ArrayList();
	c.add("Bura mt dekho");
	c.add("Bura mt suno");
	c.add("Bura mt bolo");
	System.out.println("LEngth of collection "+c.size());
//	for(Object obj : c) {
//		System.out.println(obj);
//	}
	//Convert collection into array 
	
	Object[] oArray = c.toArray();
	// print all elements of array 
	for (Object obj : oArray) {
		String s = (String) obj;
		System.out.println(s);
	}
	

}
}
