package com.rays;

public class SortingOfString {
	public static void main(String[] args) {
		String s = "shruti";
		char temp;

		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;

				}

			}
			System.out.print(ch[i]);

		}
	}

}
