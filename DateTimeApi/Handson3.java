package DateTimeApi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Handson3 {

	 public static void main(String[] args) {
	        LocalDate joiningDate = LocalDate.of(2020, Month.MAY, 19);
	        LocalDate today = LocalDate.now();
	        
	        Period experience = Period.between(joiningDate, today);
	        int years = experience.getYears();
	        int months = experience.getMonths();
	        int days = experience.getDays();

	        System.out.println("*** YOUR EXPERIENCEC WITH WIPRO ***");
	        
	        System.out.println(days + " Days");    
	        System.out.println(months + " Months");
	        System.out.println(years + " Years");
	       
	    }

}
