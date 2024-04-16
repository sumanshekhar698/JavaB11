package com.java.oops.exception_handling;

public class TypesOfException {
	
	public static void main(String[] args) {
		//Inbuilt
//			Checked
//			Uncehcked
		
//Custom
//		Checked
		
		System.out.println("START");
//		System.out.println(9/0);//Unchecked
		System.out.println("END");
		
		
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);//must handled :: Checked Exception
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}

	
	}

}
