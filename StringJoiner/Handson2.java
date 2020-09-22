package StringJoiner;

import java.util.StringJoiner;

public class Handson2 {

	public static void main(String[] args) {
		StringJoiner s1 = new StringJoiner("-");
		s1.add("Agartala");
		s1.add("Dharmanagar");
		s1.add("Udaipur");
		
		StringJoiner s2 = new StringJoiner("-");
		s2.add("Jaipur");
		s2.add("Bengaluru");
		s2.add("Pune");
		
		s1.merge(s2);
		System.out.println("Case #i");
		System.out.println("s1:"+s2);
		
		s2.merge(s1);
		System.out.println("Case #ii");
		System.out.println("s2:"+s1);
	}

}
