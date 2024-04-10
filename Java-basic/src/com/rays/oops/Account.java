package com.rays.oops;

public class Account {

	private String accountNo;
	private String accountType;
	private double balance;
	// methods

	public void setaccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(int depo) {
		System.out.println("Your deposited amount is " + depo);
		balance = balance + depo;
		System.out.println("Your total balance is " + balance);
	}

	public void withdrawal(int withdrawl) {
		System.out.println("Your withdrawl amount is " + withdrawl);
		if (balance > withdrawl) {
			balance = balance - withdrawl;
			System.out.println("Your remaining balance is " + balance);
		} else {
			System.out.println("Insufficient amount !!!");
		}
	}

	public void fundTransfer(int ft) {
		System.out.println("Amount to be Transfer" + ft);
		if (ft < balance) {
			System.out.println("Fund transfer done ");
			balance = balance - ft;
			System.out.println("Your remaining balance is " + balance);

		} else {
			System.out.println("Insufficient amount !!!");
		}

	}

	public void payBill(double pb) {
		if (pb < balance) {
			System.out.println("Bill Payment done ");
			balance = balance - pb;
			System.out.println("Your remaining balance is " + balance);

		} else {
			System.out.println("Insufficient amount !!!");
		}

	}

}
