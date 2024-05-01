package com.rays.collection.vector;

import java.util.Iterator;
import java.util.Vector;

public class vectorExample {
	public static void main(String[] args) {
		
		Vector vec = new Vector();

		vec.addElement("Shruti");
		vec.addElement("Patel");
		vec.addElement(100);

		System.out.println(vec);


		Iterator it = vec.iterator();

		

		while (it.hasNext()) {

			System.out.println(it.next());

		}




	
	}

}
