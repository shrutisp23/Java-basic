package com.rays;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParsing {
	public static void main(String[] args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		String date = "25/01/2001";

		Date d = sdf.parse(date);

		System.out.println(d+ " (String To date)");

		String StringDate = sdf.format(d);

		System.out.println(StringDate + " (date To String)");

	}

}
