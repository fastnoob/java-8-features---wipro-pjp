package DateTimeApi;

import java.time.LocalTime;

public class Handson6 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Current time : "+time);
		System.out.println("Time after 5 hours and 30 minutes : "+time.plusMinutes(330));
		
	}

}
