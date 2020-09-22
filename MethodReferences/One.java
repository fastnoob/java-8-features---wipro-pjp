package MethodReferences;

interface Show {
	public int show(int a);
}

public class One {
	int Factorial(int n) {
		int i,ans=1;
		for(i=1;i<=n;i++) {
			ans=ans*i;
		}
		return ans;
	}
	public static void main(String[] args) {
		One one = new One();
		Show s= one::Factorial;
		System.out.println(s.show(5));
	}
}