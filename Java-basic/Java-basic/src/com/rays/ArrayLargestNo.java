package com.rays;

public class ArrayLargestNo {
	
       
	static int largest(int arr[], int n){
		
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> max) {
				max = arr[i]; 
			}
 }
		return max;
 }
public static void main(String[] args){
	 int arr[]= {60,30,40,10,110,50};
	  int n=arr.length;
   int temp = largest(arr,n);
   System.out.println(temp);
			}

 }
