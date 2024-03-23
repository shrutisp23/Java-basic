package com.rays;

public class Palindrom {
    public static void main(String[] args) {
    	int num = 121;
    	int num2 = num; 
    	int rev = 0;
    	while(num2!=0) {
    		int r = num2%10;
    		rev = (rev*10)+r;
    		num2=num2/10;
    		
    	}
    	 System.out.println("reverse is "+rev);
    	 if(rev==num) {
    		 System.out.println("The given no is Palindrome no");
    	 }
    	 else {
    		 System.out.println("The given no is not a Palindrome no");

    	 }
    }
}
