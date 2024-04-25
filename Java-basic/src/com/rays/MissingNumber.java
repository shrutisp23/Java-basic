package com.rays;

public class MissingNumber {
public static void main(String[] args) {
	int a [] = {2,4,6,8,15,12};
	int b [] = {2,4,6,8,10,12,15,16};
	int count = 0;
	
	
	for(int i =0; i<b.length; i++) {
		  count = 0;
		for(int j =0; j<a.length;j++) {
			if(b[i]==a[j]) {
				count++;
			}	
			
		}
		 if (count == 0) {
			 System.out.println(" missing no is "+a[i]); 
		 }
	}

	
		
		
	
}
}
