package day31;

import java.time.LocalTime;

public class localtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	LocalTime saat=LocalTime.now();
	System.out.println(saat);
	
	int syý=10;
	for (int i = 0; i < 100000; i++) {
		syý++;
	}
	LocalTime saat1=LocalTime.now();
	System.out.println(saat1);
	
	
	
	double nano1=saat.getNano();
	double nano2=saat1.getNano();
	
	
	System.out.println(nano2-nano1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
