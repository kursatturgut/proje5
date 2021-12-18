package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception1 {

	public static void main(String[] args) {
		// kullanýcýdan istediði kadar sayý alýp sayýlarý toplayan program yapýnýz 
		
		int sayý=0;
		int sayýtop=0;
		int count=0;
		
		Scanner scan=new Scanner (System.in);
		// InputMismatchException
		
try {
	while (count<10000) {
		System.out.println("lütfen toplamak için bir sayý yazýnýz  \n bitirmek için  sayý dýþýnda bir tusa basýnýz  ");
		sayý=scan.nextInt();
		sayýtop+=sayý;
		count++;
	}
} catch (InputMismatchException e) {
	
}	
	System.out.println(sayýtop);	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}	