package com.rays.exercise;

import java.util.Random;

public class Exercise {
	public int s ;
	
	// Maximum Number
             public void max(int a,int b) {
            	
         		if(a>b) {
         			System.out.println("a is greater than b");
         		}
         		else {
         			System.out.println("b is greater than a");
         		}
             }
     // Minimum Number
         		
         	  public void min(int a,int b) {
                	
             		if(a<b) {
             			System.out.println("a is smaller than b");
             		}
             		else {
             			System.out.println("b is smaller than a");
             		}
             }
         	  
     // Random Number
         	  public  void randomNumber() {

         			Random r = new Random();

         			for (int i = 0; i < 5; i++) {

         				int randno = r.nextInt(50);

         				System.out.println(randno);

         			}
         	  }
         	  //Factorial 
         	  public void factorial(int n ) {
         		
            	 int fact =1;
            	 for(int i=1;i<=n;i++) {
            		fact= fact*i;
            	   
            	 }
            	 System.out.println(fact);
         	  }
     // Reverse Digits
         	  public int reverse() {
         		 int num = 432;
         		int rev =0;
         		while(num!=0) {
         			int r= num%10;	
         			 rev = rev*10+r;
         			 num = num/10;
         		}
         		
         		System.out.println(rev);
         		
         		  return rev;
         	  }
    // Fibonacci Series 
         	  public static void fibonacciSeries() {
         			int a = 0;
         			int b = 1;
         			int c;
         			for (int i = 1; i <= 10; i++) {
         				c = a + b;
         				System.out.print(a + " ");
         				a = b;
         				b = c;
         	  }
         	  
       }
   // Divisibility
         	  public static int divisibility() {
         		   int sum=0;
         			for(int i =100; i<200;i++) {
         				if(i%7==0) {
         					sum =sum+i;
         			}
         		
         		}
         			System.out.println(sum);
         			return sum;
         	  }		
    // 2D array
         	  public void twoDArray(int row , int col) {
         			
         		 int[][] arr = new int[row][col];
         		for(int i=0;i<row;i++) {
         			
         			for (int j=0;j<col;j++) {
         				arr[i][j]= (j+1)*(i+2);
         			}
         		}
         				System.out.println(" array is "); 
                     for(int m=0; m<row;m++) {
                     	for(int j=0; j<col;j++) {
                     		System.out.print(arr[m][j]+" ");
                     	}
                     	System.out.println();
                     }
         	  }
     // triangle 
         	  public void traingle(int n) {
         	
         			 for(int i=1;i<=n;i++) {
         				 for(int j = 1; j<=i;j++) {
         					 System.out.print(i+" ");
         				 }
         				 System.out.println();
         			 }
         	  }
   // ArmStrong Number
         	  public void armStrong() {
         		 int num = 153;
           		int temp = 0;
           		int num2 = num;
           		int r = 0;

           		while (num2 != 0) {

           			r = num2 % 10;
           			temp = temp + r * r * r;
           			num2 = num2 / 10;

           		}

           		if (temp == num) {

           			System.out.println("ArmStrongNo");

           		} else {
           			System.out.println("Not ArmStrongNo");
           		}

         	  }
     // PAlindrome number 
         	  public void palindromeNumber()
         	  {
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
    // Prime number
         	  public void primeNumber(int num ) {
         		int count =0;
         		for(int i=2;i<num;i++) {
         			if( num % i==0) {
         				count++;
         			}
         		
         		}
         		if(count==0) {
         			System.out.println("Prime no");
         			
         		}else 
         		{
         			System.out.println(" not a Prime no");
         		}
         	  }
     // Harmonic Series
         	  public static void harmonicSeries() {
         		 for (float i = 1; i <= 10; i++) {

         			System.out.print(1 / i + ",");
         		}
         	  }
         			
  // Consecutive average 
         	  public void consecutive() {
         		
         	     int n =23;
         	      int oddSum=0;
         	      int count1 = 0;
         	      int count2 = 0;
         	      int evenSum = 0;
         	      for(int i=1; i<=n; i++) {
         		   if (i%2==0) {
         			  count1++;
         			  oddSum = oddSum + i;
         		  }else {
         			  count2++;
         			  evenSum = evenSum + i;
         		  }
         	  }
         	      System.out.println("odd number "+(oddSum/count1));
         	      System.out.println("even number "+(evenSum/count2));
         		  
         		  
         	  }
      // second largest
         	  public void secondLargest() {
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
         // Missing element
         	  public void missingElement() {
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