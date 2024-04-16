package com.java.oops.abstraction.abstract_classes;


// 0 to 100%
public abstract class BankAC1 {// 0 or more absract methods
	String name;
	long acNo;
	int ifscCode;
	int balance;

	@Override
	public String toString() {
		return "BankAC [name=" + name + ", acNo=" + acNo + ", ifscCode=" + ifscCode + ", balance=" + balance + "]";
	}

	public BankAC1(String name, long acNo, int ifscCode, int balance) {
		super();
		this.name = name;
		this.acNo = acNo;
		this.ifscCode = ifscCode;
		this.balance = balance;
	}

	abstract int withdrawMoney(int amount);// abstract methods

	abstract int addMoney(int amount);

	int getIFSC() {//concerte
		return ifscCode;
	}

}
