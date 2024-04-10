package com.rays;

public class FindMissing {
	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50, 60 };
		int arr2[] = { 10, 20, 40, 50, 60 };
	    int suma=0;
	    int sumb =0;
	    for(int i =0; i<arr1.length; i++) {
	    	suma = suma + arr1[i];
	    }
	    for(int j =0; j<arr2.length; j++) {
	    	sumb = sumb + arr2[j];
	    }
		System.out.println(suma - sumb);
	}
}
