package com.java.oops.intro;

public class Main {

	public static void main(String[] args) {

		int x;// pritive variable intilaised but not delared [local a vraible]
//		System.out.println(x);//Compile Time Error

		Icecream iceCream1 = new Icecream();
		System.out.println(iceCream1.price);
		System.out.println(iceCream1.brand);

		Icecream iceCream2 = iceCream1;//ref variables

		
		iceCream1.brand = "Amul";
		iceCream1.color = "Purple";
		iceCream1.price = 67.5f;
//		iceCream1.flavour= "blackberry";

		iceCream1 = null;
		iceCream2.brand = "Baskin Robin";
		

		System.out.println(iceCream2.price);
		System.out.println(iceCream2.brand);
		System.out.println(iceCream2.flavour);

		iceCream1 = iceCream2;
		System.out.println(iceCream1.price);
		System.out.println(iceCream1.brand);
		System.out.println(iceCream1.flavour);

		iceCream1.eatingIceCream();
		iceCream1.sellIceCream();

	}

}

class Icecream {

	String color;// null properties | instance/object variabels
	String brand;// null
	float price;// 0.0
	String flavour;// null

	void sellIceCream() {// fn == methods
		int y = 9;
		System.out.println("Selling Icecream");
	}

	void eatingIceCream() {
		System.out.println("Eating Icecream");
	}

}
