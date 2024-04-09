package com.java.oops.encapsulation;

class Main {

	public static void main(String[] args) {
		
		Engine eng = new Engine(5);
		System.out.println(eng.hashCode());
		Car c1 = new Car(321, "Tata Harrier", eng);
		String sayMyCar = c1.sayMyCar();
		System.out.println(sayMyCar);
		


//		c1.vehichileNo = -9883;
//		System.out.println(c1.getVehichileNo());
//
//		int vehichileNo = c1.getVehichileNo();
//		vehichileNo = 999999;
//
		Engine eng1 = c1.getEng();
		System.out.println(eng1.hashCode());
		eng1.engineNumber = -998;
//		
//		System.out.println(c1.getVehichileNo());
		System.out.println(sayMyCar);

	}

//CUROSITY 

}
