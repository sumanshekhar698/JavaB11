package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSorting {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(32, "Danny", 40));
		empList.add(new Employee(22, "Don", 30));
		empList.add(new Employee(12, "Michael", 32));
		empList.add(new Employee(82, "Michelle", 44));
		empList.add(new Employee(12, "Mary", 23));

		Collections.sort(empList);
//		empList.forEach(System.out::println);

		ArrayList<EmployeePlain> empList2 = new ArrayList<>();

		empList2.add(new EmployeePlain(22, "Don", 30));
		empList2.add(new EmployeePlain(12, "Michael", 32));
		empList2.add(new EmployeePlain(82, "Michelle", 44));
		empList2.add(new EmployeePlain(12, "Angel", 44));
		empList2.add(new EmployeePlain(12, "Mary", 23));
		empList2.add(new EmployeePlain(32, "Danny", 40));
//		Collections.sort(empList2, new IdComparator());
//		Collections.sort(empList2, new NameComparator());
		Collections.sort(empList2, (emp1, emp2) -> {
			if (emp1.empId == emp2.empId)
				return 0;
			else if (emp1.empId < emp2.empId)
				return 6;
			else
				return -1;
		});
		empList2.forEach(System.out::println);

	}

}

class IdComparator implements Comparator<EmployeePlain> {

	@Override
	public int compare(EmployeePlain emp1, EmployeePlain emp2) {

		if (emp1.empId == emp2.empId)
			return 0;
		else if (emp1.empId < emp2.empId)
			return 6;
		else
			return -1;
	}

}

class NameComparator implements Comparator<EmployeePlain> {

	@Override
	public int compare(EmployeePlain emp1, EmployeePlain emp2) {
		return -emp1.name.compareTo(emp2.name);
	}

}
