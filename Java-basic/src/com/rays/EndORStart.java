package com.rays;

import java.time.LocalDate;

public class EndORStart {
	public static void main(String[] args) {

		// if endDate is less than today print an error message
		LocalDate endDate = LocalDate.of(2002, 11, 17);

		LocalDate startDate = LocalDate.now();

		if (endDate.isBefore(startDate)) {
			System.out.println("Error Message");

		} else {
			System.out.println("Success Message");
		}

	}
}
