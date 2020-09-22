package DateTimeApi;

import java.time.LocalTime;

public class Handson5 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Current time : "+time);
		System.out.println("Time after 25 minutes will be : "+time.plusMinutes(25));

	}

}
