package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		
		System.out.println("list is "+list);
		list.add(2, 'e');
		System.out.println("list is "+list);
		
		System.out.println("list is "+list.get(2));
		
		list.remove(1);
		System.out.println("list is "+list);
		
		list.set(3, "Shruti");
		System.out.println("list is "+list);
		
		System.out.println("list is "+list.indexOf('c'));
		System.out.println(list.subList(0, 3));
		
		
		
	
	}

}
