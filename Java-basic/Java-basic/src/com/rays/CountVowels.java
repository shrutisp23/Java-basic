package com.rays;

public class CountVowels {
	public static void main(String[] args) {
		int count = 0;
		 String s = "ShrutiPatel";
		 for(int i =1; i<s.length();i++) {
			 char c = s.charAt(i);
			 if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
				
				  count++;
				  System.out.println(c);
			 }
		
	}
		 System.out.println(count);

			

}
}

