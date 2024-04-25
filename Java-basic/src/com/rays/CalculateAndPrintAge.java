package com.rays;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class CalculateAndPrintAge {
	public static void main(String[] args) {
//		long fifteenMin = 15*60*1000;
//		Date d = new Date(fifteenMin);
//		System.out.println(d);
		LocalDate today = LocalDate.now();
		LocalDate empDate = LocalDate.of(2004,01,23);
        Period p = Period.between(empDate, today);
        System.out.println("Age of employee is "+p.getYears()+" years");
		
		
	} 		
		


}
   