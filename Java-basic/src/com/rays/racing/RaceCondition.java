package com.rays.racing;

public class RaceCondition extends Thread {
          String name =  null;
          public static Account account = new Account();
          public RaceCondition(String name) {
        	  this.name = name;
          }
		  @Override
		public void run() {
		// TODO Auto-generated method stub
		 for (int i =0; i<=5;i++) {
			 account.deposite(name, 1000);
		 }
}        
}
