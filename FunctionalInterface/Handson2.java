package FunctionalInterface;

import java.util.ArrayList;

public class Handson2 {
	public static int sumlist(ArrayList<Integer> list) {
		int sum=0;
		for(int i = 0; i<list.size();i++) {
			sum+=list.get(i);
		}
		return sum;
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(25);
		numbers.add(69);
		numbers.add(35);
		numbers.add(72);
		numbers.add(6);
		numbers.add(23);
		numbers.add(56);
		numbers.add(98);
		numbers.add(85);
		numbers.add(26);
		System.out.println(sumlist(numbers));
		
	}
}
