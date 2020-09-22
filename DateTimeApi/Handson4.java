package DateTimeApi;

import java.time.LocalDate;

public class Handson4 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020,5,23);
		if(date.isLeapYear()) {
			System.out.println(date+" is a leap year.");
		} else {
			System.out.println(date+" is not a leap year.");
		}

	}

}
