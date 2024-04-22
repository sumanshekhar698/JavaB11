package com.java.oops.collections;

public class EmployeePlain {

	int empId;
	String name;
	int age;

	public EmployeePlain(int empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + "]";
	}

}
