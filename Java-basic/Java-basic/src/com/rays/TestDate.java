package com.rays;
import java.text.SimpleDateFormat;
import java.util.*;
public class TestDate {
     public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		String s = sdf.format(d);
		System.out.println(s);
		
	}
}
