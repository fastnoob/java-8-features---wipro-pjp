package parallelArraySorting;

import java.util.Arrays;

public class Handson3 {
	public static void main(String[] args) {
		int[] numbers = new int[] {8,9,58,4,7,1,2,3,6,23};
		System.out.println("Unsorted array");
		for(int i:numbers) {
			System.out.println(i);
		}
		Arrays.parallelSort(numbers,0,5);
		
		System.out.println("Sorted array upto first 5 elements");
		for(int i:numbers) {
			System.out.println(i);
		}
	}
}
