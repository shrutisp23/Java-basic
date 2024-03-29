package com.rays;

public class ExtractDuplicate {
	public static void main(String[] args) {
//		String s1 ="Googlllle";
//		String s = s1.toLowerCase();
//		for(int i =0; i<s.length();i++) {
//			char c = s.charAt(i);
//			int dup = s.indexOf(c,i+1);
//			if ( dup != -1) {
//				System.out.print(c);
//			}
//		}
		String str1  = "Googlllle";
         String str = str1.toLowerCase();
		char[] ch = str.toCharArray();

		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '0';

				}

			}
			if (count > 1 && ch[i] != '0') {
				System.out.print(ch[i]);

			}

		}
	}

}
