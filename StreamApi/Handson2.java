package StreamApi;

import java.util.ArrayList;
import java.util.stream.*;

class Employee {
	int empNo;
	String name;
	int age;
	String location;
	Employee(int empNo, String name, int age, String location) {
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.location = location;
	}
}

public class Handson2 {
	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "Shayan", 23, "Pune"));
		employee.add(new Employee(2, "Supratim", 23, "Mumbai"));
		employee.add(new Employee(3, "Prasanta", 23, "Pune"));
		employee.add(new Employee(4, "Tanmoy", 22, "Bangalore"));
		
		ArrayList<Employee> puneEmployees = (ArrayList<Employee>) employee.stream().filter( x -> x.location.equals("Pune")).collect(Collectors.toList());
		for (Employee x : puneEmployees) {
		System.out.println("Emp No : "+x.empNo+", Name : "+x.name+", Age : "+x.age+", Location : "+x.location);
	}
}
}
