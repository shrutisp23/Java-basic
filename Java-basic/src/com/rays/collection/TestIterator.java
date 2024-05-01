package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
public static void main(String[] args) {
	
	List list = new ArrayList();
	list.add("Shruti");
	list.add("Patel");
	list.add(20);
	list.add("UIT -RGPV");
	System.out.println(list);
	
	System.out.println("Using for loop");
	
for(int i = 0; i< list.size()-1; i++) {
	System.out.println(list.get(i));
}
System.out.println("Using for each loop");
for(Object obj: list) {
	System.out.println(obj);
}
	System.out.println("Using iterators");
	
    Iterator it = list.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
    	
}

}
