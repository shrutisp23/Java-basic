package com.rays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s = "Google";
		String s1 = s.toLowerCase();
		for (int i =0;i<s1.length();i++) {
			char c = s1.charAt(i);
			int dup = s1.indexOf(c, i+1);
			if(dup==-1) {
				System.out.println(c);
			}
		}
			
			
	}

}
