package DateTimeApi;

import java.time.LocalDate;

public class Handson1 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today's date : "+today);
		System.out.println("Date after 10 days : "+today.plusDays(10));
		

	}

}
