package com.rays.exception;

public class TestAccount {
      public static void main(String[] args) {
		
	
	Account a = new Account();
	a.setBalance(1000);
	a.deposite(5000);
	
	try {
		a.withdrawl(4001);
	}catch(InsufficientBalance ib) {
		System.err.println("EXception :"+ib);
	}
	System.out.println(a.getBalance());
      }
}
