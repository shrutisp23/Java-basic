package com.rays;

import java.util.Calendar;
import java.util.Date;

public class TestCalender {
	public static void main(String[] args) {
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		// get year of the date 
		 int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		 System.out.println(dayOfYear);
		 // get yesterdays date 
		cal.add(Calendar.DATE,-1);
		System.out.println(cal.getTime());
		
	}

}
