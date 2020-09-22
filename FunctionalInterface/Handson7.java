package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Handson7 {
	public static void evenOdd(int n) {
		if(n%2==0) {
			System.out.println(n+" even");
		} else {
			System.out.println(n+" odd");
		}
	}
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,3,65,98,5,11,10,89,7,56);
		Consumer<Integer> c = i-> evenOdd(i);
		numbers.forEach(n->c.accept(n));
	}
}
