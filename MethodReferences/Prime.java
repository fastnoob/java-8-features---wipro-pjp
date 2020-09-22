package MethodReferences;

interface primeCheck {
	public void check(int a);
}

public class Prime {
	int number;
	Prime(int n) {
		number=n;
		int count=0,i;
		for(i=2;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
	}
	
	
	public static void main(String[] args) {
		primeCheck p = Prime::new;
		p.check(23);
	}	
}
