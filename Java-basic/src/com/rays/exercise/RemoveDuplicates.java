package com.rays.exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	
	List list = new ArrayList();
	Set duplicate = new HashSet();
	
	list.add("Shruti");
	list.add("Patel");
	list.add("1");
	list.add("1");
	list.add("Shruti");
	list.add("Shruti");
	
	Set s = new HashSet();
	
//	Iterator it = list.iterator();
//	while(it.hasNext()) {
//		Object obj = it.next();
//		if(!s.add(obj)) {
//			duplicate.add(obj);
//			
//		}
//		
//		
//        
//	}
	for(int i =0;i<list.size();i++) {
		
		if(s.add(list.get(i))) {
			
		}else {
			duplicate.add(list.get(i));
		}
	}
	System.out.println(duplicate);
	
	
	


}
}
 
