package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Handson3 {
	public static boolean isPalindrome(String str) {
		String reverse="";
		int i=str.length()-1;
		while(i>=0) {
			reverse+=str.charAt(i);
			i--;
		}
		if(reverse.equals(str)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("shayan","oho","perk","sturuts");
		Predicate<String> p = x->isPalindrome(x);
		for(String palindromeWords : list) {
			if(p.test(palindromeWords)) {
				System.out.println(palindromeWords);
			}
		}
	
	}
	

}
