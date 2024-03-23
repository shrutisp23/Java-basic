package com.rays;

public class MissingNumber {
public static void main(String[] args) {
	int a [] = {2,4,6,8,15,12};
	int b [] = {2,4,6,8,10,12,15};
	
	int suma = 0;
	int sumb = 0;
	
	for (int i = 0; i < a.length; i++) {
		suma = suma+a[i];
	}
	
	for (int i = 0; i < b.length; i++) {
		sumb = sumb+b[i];
	}

		System.out.println(sumb - suma);
		
		
	
}
}
