package com.java.oops.constructors;

public class Main {

	public static void main(String[] args) {
//		Employee e1 = new Employee();//consturtors are invoked automatically  while creating an  object
		//you cannot invoke manually afterwards
		
		Employee e2 = new Employee(3,"Rocky");
		System.out.println(e2.name);//Rocky
		
		System.out.println(e2);
		
		Employee e2Test = e2.testEmp();
		System.out.println(e2Test);

		
		
		
		
		
		

	}

}
