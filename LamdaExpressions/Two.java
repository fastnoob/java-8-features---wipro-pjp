package LamdaExpressions;

import java.util.ArrayList;

public class Two {
	public static StringBuilder rev(String str) {
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb=sb.reverse();
		return sb;
	}
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Shayan");
		al.add("Irin");
		al.add("Supratim");
		al.add("Tanmoy");
		al.add("Prasanta");
		al.add("Partha");
		al.add("Suraj");
		al.add("Bhadra");
		al.add("Subir");
		al.add("Sayan");
		
		al.forEach(
				n-> {
					System.out.println(rev(n));
				}
				
				);
		
	}
}
