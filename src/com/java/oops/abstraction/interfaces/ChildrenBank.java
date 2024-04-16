package com.java.oops.abstraction.interfaces;

public class ChildrenBank implements Bank {

	String name;
	long acNo;
	int ifscCode;
	int balance;

	@Override
	public String toString() {
		return "BankAC [name=" + name + ", acNo=" + acNo + ", ifscCode=" + ifscCode + ", balance=" + balance + "]";
	}

	public ChildrenBank(String name, long acNo, int ifscCode, int balance) {
		super();
		this.name = name;
		this.acNo = acNo;
		this.ifscCode = ifscCode;
		this.balance = balance;
	}

	public int withdrawMoney(int amount) {
		if (amount > balance || amount < 0)
			return -1;
		balance -= amount;
		return balance;
	}

	public int addMoney(int amount) {
		if (amount > 0)
			balance += amount;
		return balance;
	}

}
