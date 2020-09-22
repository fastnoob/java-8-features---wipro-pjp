package forEach;

import java.util.ArrayList;

class Employee {
	int id;
	String name,address;
	double salary;
	
	Employee(int id,String name,String address,double salary) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
	
}
public class Two {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Shayan", "Agartala", 35000.00);
		Employee emp2 = new Employee(2, "Supratim", "Agartala", 25000.00);
		Employee emp3 = new Employee(3, "Tanmoy", "Agartala", 30000.00);
		Employee emp4 = new Employee(4, "Prasanta", "Agartala", 33000.00);
		
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		
		employee.forEach(emp -> System.out.println(
								"ID : " + emp.id + " Name : " + emp.name + " Address : "+emp.address+" Salary : "+ emp.salary)
				);
	}
}
