package com.rays;

public class CountOccurenceOfChar {
	public static void main(String[] args) {
		String name = "jshwudedecvdhcbjsxkdjwdgdfgvdbsjjjj";
		int count =0;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			String m = String.valueOf(ch);

			if (m.matches("d")) {
				count++;

			}

		}
		System.out.println("d : " + count);

	}

}
