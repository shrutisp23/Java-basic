package com.rays.oops.interf;

public class Businessman implements Richman, SocialWorker {

	@Override
	public void helpToOthers() {
		System.out.println("helpToOthers");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("earnMoney");
	}

	@Override
	public void donation() {
		System.out.println("donation");	
	}

	@Override
	public void party() {
		System.out.println("party");
	}
	public void abc() {
		System.out.println("abc");
	}

}
