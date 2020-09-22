package StreamApi;

import java.util.ArrayList;
import java.util.stream.*;

public class Handson1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(23);
		list.add(-6);
		list.add(-3);
		list.add(-4);
		list.add(-23);
		ArrayList<Integer> negativeNumbers = (ArrayList<Integer>) list.stream().filter(x-> x<0 && x%2==0).collect(Collectors.toList());
		System.out.println(negativeNumbers);
		
	}
}
