package LamdaExpressions;

import java.util.ArrayList;

public class Three {
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
						if(n.length()%2!=0) {
							System.out.println(n);
						}
					}
					);
		}
}
