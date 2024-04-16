package com.java.oops.abstraction;

public class BankAC {
	String name;
	long acNo;
	int ifscCode;
	int balance;

	@Override
	public String toString() {
		return "BankAC [name=" + name + ", acNo=" + acNo + ", ifscCode=" + ifscCode + ", balance=" + balance + "]";
	}

	int withdrawMoney(int amount) {
		if (amount > balance || amount < 0)
			return -1;
		balance -= amount;
		return balance;
	}

	int addMoney(int amount) {
		if (amount > 0)
			balance += amount;
		return balance;
	}

}
