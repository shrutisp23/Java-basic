package com.rays;

import java.util.Random;

public class TestRandonNumber {
	public static void main(String[] args) {

		Random r = new Random();

		for (int i = 0; i < 5; i++) {

			int randno = r.nextInt(50);

			System.out.println(randno);

		}

	}
}
