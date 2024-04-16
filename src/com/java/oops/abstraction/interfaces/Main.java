package com.java.oops.abstraction.interfaces;

public class Main {

	public static void main(String[] args) {
		
		//We cannot create an object of interface DIRECTLY
		
		ChildrenBank ac1 = new ChildrenBank("John", 10, 670, 0);
		System.out.println(ac1);
		
		Bank bank = new Bank() {//Annonymous Inner Type
			
			@Override
			public int withdrawMoney(int amount) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int addMoney(int amount) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	

	}

}
