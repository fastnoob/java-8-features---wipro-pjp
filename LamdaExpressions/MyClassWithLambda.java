package LamdaExpressions;

interface WordCount {
	int count(String str);
}
public class MyClassWithLambda {
	public static void main(String[] args) {
	WordCount i = (str) -> str.length();
	String name = "Shayan";
	int ans = i.count(name);
	System.out.println(ans);
}
}
