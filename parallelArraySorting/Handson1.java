package parallelArraySorting;

import java.util.Arrays;

public class Handson1 {
	public static void main(String[] args) {
		int arr[] = new int[] {74,5,23,69,4,10,11,17,9,85};
		Arrays.parallelSort(arr);
		System.out.println("SORTED ARRAY");
		for(int i:arr) {
			System.out.println(i);
		}
		int sum=arr[0]+arr[arr.length-1];
		System.out.println("\nSUM OF MAX AND MIN VALUE");
		System.out.println(sum);
	}
}
