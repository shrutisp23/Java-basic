package com.rays;

public class Consecutive {
	public static void main (String[] args) {
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
}
