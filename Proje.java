import java.util.Scanner;

public class Proje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
        (Ignore case sensitivity)

        Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz
      input : Learning java is easy
      output: maximumCounts occurring character is : a
       */
	Scanner scan=new Scanner (System.in);
	System.out.println("l�tfn bir metin griniz");
	String metin=scan.nextLine();
	int saya�=0;
	int count=0;
	char crt = 0;
	int d�ng�=0;
	do {
		for (int i = 0; i < metin.length(); i++) {
			for (int j = 1; j < metin.length(); j++) {
				if (metin.charAt(i)==metin.charAt(j)) {
					count++;
					d�ng�++;
				}
			if (count>saya�) {
				saya�=count;
			crt=metin.charAt(i);
			}
			}
		count=0;
			
		}
	} while (d�ng�<30);
	
	System.out.println(crt);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
