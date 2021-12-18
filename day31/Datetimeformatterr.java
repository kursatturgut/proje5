package day31;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetimeformatterr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	LocalDateTime saattarih= LocalDateTime.now();
	System.out.println(saattarih);
	
	// düzgün biþi isterseniz 
	
	DateTimeFormatter düzen= DateTimeFormatter.ofPattern("dd / MM / YYYY EEEE HH : mm");
	
	System.out.println(düzen.format(saattarih));
	
	// format oluþtururken  gün için 
	// d baþtaki sýfýrý yazma z

	// dd tek haneli günleri  01 gibi yazar 
	// 
	//
	
	
	
	
	
	
	
	}

}
