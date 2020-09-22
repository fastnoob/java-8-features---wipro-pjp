package Handson4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(new Employee(1,"Shayan",15000));
		employee.add(new Employee(2,"Supratim",9000));
		employee.add(new Employee(3,"Tanmoy",12000));
		employee.add(new Employee(4,"Partha",8000));
		employee.add(new Employee(5,"Prasanta",8000));
		
		Predicate<Employee> p = x->x.getSalary()<10000;
		
		for(Employee salaries : employee) {
			if(p.test(salaries)) {
				System.out.println(salaries.name);
			}
		}
	}
}
