package FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Handson8 {
	public static boolean isPrime(int n) {
		int c=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		} if(c==1) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		
		Supplier<ArrayList<Integer>> s = () -> {
			ArrayList<Integer> primes = new ArrayList<>();
			int i=2,c=0;
			while(c<10) {
				if(isPrime(i)) {
					primes.add(i);
					c++;
				}
				i++;
			}
			return primes;
		};
		System.out.println(s.get());
	}
}
