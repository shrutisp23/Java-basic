package com.rays.collection.failfastsafe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ExerciseQ {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("one");
		c1.add("Two");
		c1.add("Three");
		c1.add("Four");
		c1.add("Five");
		c1.add(6);
		c1.add("Seven");
		c1.add("Eight");
		
		Iterator it = c1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
