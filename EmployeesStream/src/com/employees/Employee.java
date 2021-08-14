/*package com.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Employee {
	String name;
	int salary;
	String region;
	int age;
	//float avg;

	// creating parameterized constructor
	public Employee(String name, int salary, int age, String region) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.region = region;
	}

	// Method to display highest salary
	static int display(List<Employee> list) {
		System.out.print("The highest salary is: ");
		int i = 0;
		for (Employee l : list) {
			if (i < l.salary) {
				i = l.salary;
			}
		}
		return i;
	}

	// Method to display lowest salary
	static int display2(List<Employee> list) {
		System.out.print("The lowest salary is: ");
		int i = Integer.MAX_VALUE;
		for (Employee l : list) {
			if (i > l.salary) {
				i = l.salary;
			}

		}
		return i;
	}

	// Method to find average salary
	static float display3(List<Employee> list) {
		float avg, sum = 0;
		int no_of_employee = list.size();
		for (Employee l : list) {
			sum += l.salary;
		}
		System.out.print("The Average salary is: ");
		avg = ((float) sum / no_of_employee);
		return avg;
	}

	// Method to find greater and lower than Average salary
	static void display4(List<Employee> list, float avg) {
		List<Integer> greater_salary = new ArrayList<Integer>();
		List<Integer> lower_salary = new ArrayList<Integer>();
		for (Employee l : list) {
			if (avg < l.salary) {
				greater_salary.add(l.salary);
			} else if (avg > l.salary) {
				lower_salary.add(l.salary);
			}
		}
		System.out.print("Salary greater than average salary is: ");
		for (Integer sal : greater_salary) {
			System.out.print("\t" + sal);
		}
		System.out.print("\nSalary lower than average salary is: ");
		for (Integer sal : lower_salary) {
			System.out.print("\t" + sal);
		}
	}

	// Method to name the employees whose age is greater than 30
	static void display5(List<Employee> list) {
		List<String> names = new ArrayList<String>();
		for (Employee l : list) {
			if (30 < l.age) {
				names.add(l.name);
			}
		}
		System.out.print("\nName of Employee whose age is greater than 30 : ");
		for (String name : names) {
			System.out.print("\n" + name);
		}
	}

	// Method to name the employees whose belong to one particular region
	static void display6(List<Employee> list) {
		List<String> names = new ArrayList<String>();
		for (Employee l : list) {
			if ("Bangalore" == l.region) {
				names.add(l.name);
			}
		}
		System.out.print("\nName of Employee whose belong to one particular region :");
		for (String name : names) {
			System.out.print("\n" + name);
		}
	}

	// Method to find Name of Employee whose name start with 'J'
	static void display7(List<Employee> list) {
		List<String> names = new ArrayList<String>();
		for (Employee l : list) {
			if ('J' == l.name.charAt(0)) {
				names.add(l.name);
			}
		}
		System.out.print("\nName of Employee whose name start with 'J' :");
		for (String name : names) {
			System.out.print("\n" + name);
		}
	}

	// Method to name the Employee whose age is less than 30 and the region is
	// Bangalore
	static void display8(List<Employee> list) {
		List<String> names = new ArrayList<String>();
		for (Employee l : list) {
			if (30 > l.age && "Bangalore" == l.region) {
				names.add(l.name);
			}
		}
		System.out.print("\nName of Employee whose age is less than 30 and the region is Bangalore : ");
		for (String name : names) {
			System.out.print("\n" + name);
		}
	}

	// Method to find Name of Employee whose length of name is more than 5
	static void display9(List<Employee> list) {
		List<String> names = new ArrayList<String>();
		for (Employee l : list) {
			if (5 < l.name.length()) {
				names.add(l.name);
			}
		}
		System.out.print("\nName of Employee whose length of name is more than 5: ");
		for (String name : names) {
			System.out.print("\n" + name);
		}
	}

	// Method to Name of Employee whose length of salary is greater then 11000
	static void display10(List<Employee> list) {
		List<String> names = new ArrayList<String>();
		for (Employee l : list) {
			if (11000 < l.salary) {
				names.add(l.name);
			}
		}
		System.out.print("\nName of Employee whose salary is greater than 11000: ");
		/*
		 * for (String name : names) { System.out.print("\n" + name); }
		 */
	}

	// Method to find 2nd Character of name of Employee
	static void display11(List<Employee> list) {
		List<Character> characters = new ArrayList<Character>();
		for (Employee l : list) {
			characters.add(l.name.charAt(1));
		}
		System.out.print("\n2nd Character's of name of Employee: ");
		for (char character : characters) {
			System.out.print("\n" + character);
		}
	}*/

	public static void main(String args[]) {

		List<Employee> list = new ArrayList<Employee>();

		// Adding the employees to the list
		list.add(new Employee("Jade", 10000, 24, "Bangalore"));
		list.add(new Employee("Judy", 11000, 25, "Delhi"));
		list.add(new Employee("Dexter", 20000, 26, "Mumbai"));
		list.add(new Employee("Suzy", 23000, 22, "Delhi"));
		list.add(new Employee("Lex", 5000, 34, "Bangalore"));
		list.add(new Employee("John", 45000, 33, "Delhi"));
		list.add(new Employee("Danish", 25000, 32, "Bangalore"));
		list.add(new Employee("Dinesh", 32000, 30, "Bangalorer"));
		list.add(new Employee("Rajesh", 48000, 27, "Mumbai"));

		List<Float> list2 = list.stream().filter(p -> p.salary > 11000)// filtering data
				.map(p -> p.salary) // fetching price
				.collect(Collectors.toList()); // collecting as list
		
		System.out.println(names2);

		// Finding the highest salary

		System.out.println(display(list));

		System.out.println(display2(list));

		System.out.println(display3(list));

		// System.out.println(display4(list, Ave));

		display5(list);
		display6(list);
		display7(list);
		display8(list);
		display9(list);
		display10(list);
		display11(list);

	}
}