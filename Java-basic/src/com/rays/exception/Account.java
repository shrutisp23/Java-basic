package com.rays.exception;

public class Account {
	public int balance ;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
   
   public void deposite(int amount) {
	   balance += amount;
	   System.out.println("balance after deposites "+balance);
   }
   public void withdrawl(int amount) throws InsufficientBalance {
	   if((balance-amount)>=2000) {
		   balance-= amount;
		   System.out.println("balance after withdrawl:"+balance);
	   }else {
		   InsufficientBalance ib = new InsufficientBalance ();
		   throw ib;
	   }
	  
   }
   

}
