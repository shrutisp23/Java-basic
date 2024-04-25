package com.rays;

public class SecondHighest  {
	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		int arr[]= {10,87,65,49,32,45,96,44,36,12,9,25};
		int max=0;
		int min=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				min=max;
				max=arr[i];
			}
			if((min<arr[i])&&(arr[i]<max)) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}

