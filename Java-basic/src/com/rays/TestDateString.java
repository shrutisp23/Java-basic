package com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateString {
	public static void main(String[] args) throws Exception {
		String s = "28/03/2024";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Date d = sdf.parse(s);
		System.out.println(d);
	}
}
