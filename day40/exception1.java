package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception1 {

	public static void main(String[] args) {
		// kullan�c�dan istedi�i kadar say� al�p say�lar� toplayan program yap�n�z 
		
		int say�=0;
		int say�top=0;
		int count=0;
		
		Scanner scan=new Scanner (System.in);
		// InputMismatchException
		
try {
	while (count<10000) {
		System.out.println("l�tfen toplamak i�in bir say� yaz�n�z  \n bitirmek i�in  say� d���nda bir tusa bas�n�z  ");
		say�=scan.nextInt();
		say�top+=say�;
		count++;
	}
} catch (InputMismatchException e) {
	
}	
	System.out.println(say�top);	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}	