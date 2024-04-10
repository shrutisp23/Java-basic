package com.rays.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String s = "23-01-2004";
		  Date d = sdf.parse(s);
		  p.setD(d);
		  System.out.println(p.getD());
		  p.setName("Shruti Patel");
		  System.out.println(p.getName());
		  p.setAdd("Indore");
		  System.out.println(p.getAdd());
		  
          
          
          
          
		

}
}
