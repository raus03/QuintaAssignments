package com.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employees_stream> list = new ArrayList<Employees_stream>();
		
		//Adding employees
		list.add(new Employees_stream("Jade", 10000, "Bangalore", 24));
		list.add(new Employees_stream("Judy", 11000, "Delhi", 25));
		list.add(new Employees_stream("Dexter", 20000, "Mumbai", 26));
		list.add(new Employees_stream("Suzy", 23000, "Delhi", 22));
		list.add(new Employees_stream("Lex", 5000, "Bangalore", 34));
		list.add(new Employees_stream("John", 45000, "Delhi", 33));
		list.add(new Employees_stream("Danish", 25000, "Bangalore", 32));
		list.add(new Employees_stream("Dinesh", 32000, "Bangalorer", 30));
		list.add(new Employees_stream("Rajesh", 48000, "Mumbai", 27));
		
		//salary greater than 11000
		List<Employees_stream> salary2=list.stream()
				     .filter(p->p.salary>11000)
				     .collect(Collectors.toList());
		
		list.forEach(x-> System.out.println(x.name));
		
		List<Employees_stream> employeeList = list.stream()
		             .filter(x->x.salary>30000)
		             .filter(x->x.region=="Bangalore")
		             .collect(Collectors.toList());
		list.forEach(x->System.out.println(x.name));
	}

}
