package OptionalClass;

import java.util.Optional;

import javax.naming.NamingException;

public class Employee {
	String name;
	public static void main(String[] args) throws NamingException {
		Employee employee = new Employee();
		Optional<String> check = Optional.ofNullable(employee.name);
		System.out.println(check.orElseThrow(NamingException::new));
	}

}
