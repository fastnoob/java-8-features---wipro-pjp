package parallelArraySorting;

import java.util.Arrays;
import java.util.Scanner;

public class Handson2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input = ");
		String inputString = sc.nextLine();
		char[] arr = inputString.toCharArray();
		Arrays.parallelSort(arr);
		String outputString = new String(arr);
		System.out.println(outputString);
	}
}