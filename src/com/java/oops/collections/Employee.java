package com.java.oops.collections;

public class Employee implements Comparable<Employee> {

	int empId;
	String name;
	int age;

	public Employee(int empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee emp) {

		if (emp.age == this.age)
			return 0;
		else if (emp.age < this.age)
			return 6;
		else
			return -1;
	}

}
