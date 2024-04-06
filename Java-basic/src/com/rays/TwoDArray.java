package com.rays;

public class TwoDArray {
	public static void main(String[] args) {
		int row = 9;
		int col = 10;
		int[][] arr = new int[9][10];
		for(int i=0;i<row;i++) {
			
			for (int j=0;j<col;j++)
				System.out.println(" array is "); 
            for(int m=0; m<row;m++) {
            	for(int j=0; j<col;j++) {
            		System.out.print(arr[m][j]+" ");
            	}
            	System.out.println();
            }
	}
 
}
}
