package com.rays.oops;

public class TestAccount {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setaccountNo("0101CS21115");

		System.out.println(acc.getAccountNo());
		acc.setAccountType("Current Account");
		System.out.println(acc.getAccountType());
		acc.setBalance(8000);
		System.out.println(acc.getBalance());
		acc.fundTransfer(561);
		acc.deposit(789);
		acc.withdrawal(857);
		acc.payBill(4475);

	}
}
