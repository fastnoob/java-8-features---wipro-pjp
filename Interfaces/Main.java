package Interfaces;


interface Test {
	public void myFunction(int a,int b,int c);
}
public class Main {
	public static void main(String[] args) {
		Test t1 = (a,b,c)->System.out.println(a+b+c);
		Test t2 = (a,b,c)->System.out.println(a*b*c);
		
		t1.myFunction(6, 7, 2);
		t2.myFunction(2, 2, 3);
	}
}
