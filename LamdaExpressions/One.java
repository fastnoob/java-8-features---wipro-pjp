package LamdaExpressions;

import java.util.ArrayList;

public class One {
	public static int checkPrime(int n) {
		int c=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		al.add(18);
		al.add(19);
		al.add(20);
		al.add(21);
		al.add(22);
		al.add(23);
		al.add(24);
		al.add(25);
		
		
		System.out.println();
		System.out.println("Printing prime numbers");
		al.forEach(
					n-> {
					if(checkPrime(n)==1) {
						System.out.println(n);
					           }
						}
    );
	}

}
