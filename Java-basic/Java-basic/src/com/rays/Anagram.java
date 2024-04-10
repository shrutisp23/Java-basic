package com.rays;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str ="triangle";
		String str1 = "integral";
		char temp;

		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();

		
		
		

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;

				}

			}
		}
			temp = 0;
			for (int m = 0; m < ch.length; m++) {
				for (int n = m + 1; n < ch.length; n++) {
					if (ch1[m] > ch[m]) {
						temp = ch[m];
						ch[m] = ch[n];
						ch[n] = temp;

					}

				}
			}
			boolean result = Arrays.equals(ch, ch1);
			 if (result == true) {
				 System.out.println("Anagram");

				}
			 else {
				 System.out.println(" not an Anagram");
				 
				}
		 

	



		
	}

}
