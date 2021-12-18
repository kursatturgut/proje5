package day31;

import java.time.LocalDate;
import java.time.LocalTime;

public class dateTime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	LocalDate tarih=LocalDate.now();
	
	System.out.println(tarih);
	
	System.out.println(tarih.getDayOfMonth());
	System.out.println(tarih.getDayOfYear());
	System.out.println(tarih.getDayOfWeek());
	System.out.println(tarih.getChronology());
	System.out.println(tarih.getMonth());
	
	System.out.println(tarih.lengthOfYear());
	System.out.println(tarih.plusDays(20));
	System.out.println(tarih.plusYears(5));
	
	System.out.println(tarih.minusDays(20));
	System.out.println(tarih.minusWeeks(20));
	
	System.out.println(tarih.minusYears(5).minusMonths(5).minusDays(5));
	
	
	System.out.println(tarih.minusYears(21).isLeapYear());
	
	LocalDate doðum= LocalDate.of(1, 10, 01);
	System.out.println(doðum);
	
	}

}
