package FunctionalInterface;

import java.util.ArrayList;

class Employee {
	int id;
	String name;
	String location;
	int salary;
	Employee(int id, String name, String location, int salary) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
}
public class Handson1 {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Shayan","Pune",32000));
		list.add(new Employee(2,"Supratim","Mumbai",30000));
		list.add(new Employee(3,"Prasanta","Hyderabad",20000));
		list.add(new Employee(4,"Tanmoy","Kolkata",32000));
		list.add(new Employee(5,"Partha","Delhi",35000));
		
		for(Employee x : list) {
			System.out.println(x.location);
		}
	}
}
