package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYYY:HH-mm-ss");
		System.out.println(ldt.format(format));
		
		System.out.println(ldt.getMonth());
		System.out.println(ldt.getYear());
		System.out.println(ldt.getDayOfWeek());
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getDayOfYear());

	}

}
