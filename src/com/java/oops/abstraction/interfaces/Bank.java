package com.java.oops.abstraction.interfaces;

public interface Bank {// 100% abstract methods

//	public static final
	String BANK_NAME = "Children Bank";// p s f
	
	
//	abstract keyword is optional

	public abstract int withdrawMoney(int amount);

	int addMoney(int amount);

}
