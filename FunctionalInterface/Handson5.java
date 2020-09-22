package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Handson5 {

	public static boolean isPerfectSquare(int number) {
		int count=0;
		for(int i=0;i<=number;i++) {
			if(i*i==number) {
				count++;
			}
		}
		if(count>0) {
			return true;
		} else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,3,6,5,9,64,36,81,1,0);
		Predicate<Integer> p = x->isPerfectSquare(x);
		for(int perfectSquareNumbers : numbers) {
			if(p.test(perfectSquareNumbers)) {
				System.out.println(perfectSquareNumbers);
			}
		}
		
	}

}
