package StreamApi;

import java.util.ArrayList;

class Student {
	int rollNo;
	String name;
	double mark;
	
	Student(int rollNo, String name, double mark) {
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}
}
public class Handson3 {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(new Student(1, "Supratim", 52));
		student.add(new Student(2, "Shayan", 45));
		student.add(new Student(3, "Prasanta", 69));
		student.add(new Student(4, "Tanmoy", 32.5));

		long c = student.stream().filter(x -> x.mark>=50).count();
		System.out.println(c);
		
	}
}
