package StringJoiner;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Handson1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Shayan");
		list.add("Supratim");
		list.add("Prasanta");
		list.add("Bhadra");
		list.add("Tanmoy");
		list.add("Partha");
		list.add("Suraj");
		
		StringJoiner s = new StringJoiner(",","{","}");
		for(String i:list) {
			s.add(i);
		}
		System.out.println(s);
		
	}
}
