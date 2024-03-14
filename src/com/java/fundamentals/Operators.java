package com.java.fundamentals;

public class Operators {

	public static void main(String[] args) {

		// Assingemnet Operator

		int x = 9;// = assingment operator

//		unary operators
		x++;// x = x+1 10
		System.out.println(x++);// 10

		// 11
		++x;// 12
		System.out.println(++x);// 13

		x = 10;
		int y = 20;
		x = ++x - --x - --y + y-- + ++x - y--;// TODO
//		System.out.println(x);

		// ShortHand Operators
		y = 50;
//		y = y + 7;
		y += 7;// *+-/

		System.out.println(4 % 10);// 4/10 10*0 + 4

		x = 100;
		// Comparison Operators
		if (!(x > 200)) {// > < >= <= == != !
			System.out.println("High");
		}

		// BitWise DSA
		System.out.println(7 & 8);
		System.out.println(7 | 8);
		System.out.println(7 ^ 8);
		System.out.println(~8);

		System.out.println(8 ^ 8);// 0

		System.out.println(8 >> 3);
		System.out.println(8 << 3);
		
//		conditional OR || Conditional AND &&


	}

}
