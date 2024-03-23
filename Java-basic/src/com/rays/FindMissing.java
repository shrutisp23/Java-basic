package com.rays;

public class FindMissing {
	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50, 60 };
		int arr2[] = { 10, 20, 40, 50, 60 };
		int n1 = arr1.length;
		int n2 = arr2.length;
		int temp = 0;

		for (int i = 0; i < n1; i++) {

			int m = arr1[i];

			for (int j = 0; j < n2; j++) {
				int n = arr2[j];

				if(m==n)
				{
                   break;
			}
		}
		}
		System.out.println("Missing no is " + temp);
	}
}
