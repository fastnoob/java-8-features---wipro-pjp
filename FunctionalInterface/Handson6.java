package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Handson6 {
	public static String reverse(String word) {
		int i=word.length()-1;
		String revWord = "";
		while(i>=0) {
			revWord+=word.charAt(i);
			i--;
		}
		return revWord;
	}
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Monday","Mangoe","Banana","Icecream","Strawberry","Milk","Puppy","Laptop","Books","Desktop");
		Consumer<String> c = i->System.out.println(i);
		Consumer<List<String>> cReversedWords = list -> {
			for(int i=0;i<list.size();i++) {
				list.set(i, reverse(list.get(i)));
			}
		};
		cReversedWords.accept(words);
		words.forEach(n->c.accept(n));
	}
}
