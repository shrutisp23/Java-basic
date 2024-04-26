package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		 Map<Integer, String> map = new HashMap();
		  map.put(1,  "one");
		  map.put(2, "two");
		  map.put(3, "three");
		  map.put(4, "four");
		  System.out.println(map);
		  
		  //map.clear();
		  
		  map.remove(1);
		  System.out.println(map);
		  
		  
		// Retrieve and print values based on keys
			System.out.println(map.get(3));
			
	    // Check if a key is present in the map
     	System.out.println(map.containsKey(4));
     // Check if a value  is present in the map
     		System.out.println(map.containsValue("two"));
     		
    		System.out.println(map.entrySet());

    		System.out.println(map.isEmpty());

    		System.out.println(map.keySet());

    		System.out.println(map.size());

    		System.out.println(map.values());
    		
    		
	 	  
		  
	}

}
