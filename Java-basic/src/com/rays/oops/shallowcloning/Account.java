package com.rays.oops.shallowcloning;

public class Account implements Cloneable {
	public int balance;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


}
