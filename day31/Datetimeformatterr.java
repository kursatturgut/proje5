package day31;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetimeformatterr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	LocalDateTime saattarih= LocalDateTime.now();
	System.out.println(saattarih);
	
	// d�zg�n bi�i isterseniz 
	
	DateTimeFormatter d�zen= DateTimeFormatter.ofPattern("dd / MM / YYYY EEEE HH : mm");
	
	System.out.println(d�zen.format(saattarih));
	
	// format olu�tururken  g�n i�in 
	// d ba�taki s�f�r� yazma z

	// dd tek haneli g�nleri  01 gibi yazar 
	// 
	//
	
	
	
	
	
	
	
	}

}
