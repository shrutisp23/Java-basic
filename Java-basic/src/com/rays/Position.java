package com.rays;

public class Position {
	
	static int findPosition(int num[], int m) {
		  int position =0;
		   for(int i=0;i<num.length;i++) {
			   if (num[i]==m) {
				   position=i;
			   }
		   }
		  
		  return position;
	}
	
     public static void main(String[] args) {
    	 int arr[]= {10,20,30,40,50};
    	 int n = 40;
    	int pos= findPosition(arr,n);
    	System.out.println("Position of a given number is "+pos);
    	 
     }
}
