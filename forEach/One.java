package forEach;

import java.util.ArrayList;

public class One {
	public static void main(String[] args) {
		ArrayList<String> weekdays = new ArrayList<String>();
		weekdays.add("Sunday");
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		weekdays.add("Saturday");
		
		weekdays.forEach(System.out::println);
	}
}
