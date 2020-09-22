package MethodReferences;


interface FactAns {
	public int show(int a);
}
public class Two {
	public static int digitCount(int a) {
		int count=0;
		while(a!=0) {
			a=a/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		FactAns f = Two::digitCount;
		System.out.println(f.show(45));
		
	}
}
