package com.rays.collection.equalshashcode;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
public static void main(String[] args) {
	SortedSet s = new TreeSet();
	s.add("One");
	s.add("Byee");
	s.add("Byi");
	
	// automatically sorted in ascending order
	for (Object obj : s) {
		System.out.println(obj);
	}
	// get first element 
	System.out.println(s.first());
	
	// get last element
	System.out.println(s.last());
	
}
}
