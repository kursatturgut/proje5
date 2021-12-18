import java.util.Scanner;

import Day10_Switccase.SwitchCase6;

public class DuyguDrum {

	static double bakiye = 0;
	static String kartNo = "1234";
	static String Sifre1 = "12345";
	static String i�lem = "";

	public static void main(String[] args) {
		/*
		 * Kullaniciya giri� i�in kart numarasi ve �ifresini isteyin, eger herhangi
		 * birini yanlis girerse tekrar isteyin. Kart numarasi aralarda bo�luk ile
		 * girerse de eger do�ruysa kabul edin. Kart numarasi ve sifre dogrulanirsa
		 * kullanicinin yapabilece�i i�lemleri ekrana yazdirin, Bakiye sorgula, para
		 * yatirma, para �ekme, para g�nderme, sifre de�i�tirme ve cikis. Para �ekme ve
		 * para gonderme i�leminde mevcut bakiyeden buyuk para �ekilemez, Para g�nderme
		 * i�leminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger
		 * de�ilse men� ekranina geri donsun. Sifre de�i�tirme i�leminde mevcut �ifreyi
		 * teyit ettikten sonra, sifre de�i�iklik i�lemini yapmali,
		 */

		String kartN = "";
		String �ifre = "";
    System.out.println("BANKAMIZA HOOOO� GELD�N�Z");
		do {

			Scanner scan = new Scanner(System.in);
			System.out.println("l�tfen kart numaran�z� griniz");
			kartN = scan.next();
			System.out.println("l�tfen kart sifrenizi griniz");
			�ifre = scan.next();

		} while (!kartN.equals(kartNo) && !Sifre1.equals(�ifre));

		System.out.println("kart numaran�z ve �ifeniz basar�l� aferin  devam ediyoruz ");

		
		
		do {
			System.out.println("l�tfen yapacag�n�z i�lemleri se�iniz \n bakiye sorgulama i�in : a"
					+ " \n parayat�rmak i�in :    b \n para �ekmek i�in   :   c \n para g�ndermek i�in  : d \n �ifre de�i�mek i�in  : e "
					+ "\n ��k�� in:          "
					+ "   f ");

			
			Scanner scan = new Scanner(System.in);
			i�lem = scan.next().toLowerCase();

			switch (i�lem) {
			case "a":
				System.out.println(bakiye);
				break;
			case "b":
				paraYat�rma();

				break;
			case "c":
				para�ekme();
				break;
			case "d":
				paraG�nderme();
				break;
			case "e":
				�ifreDe�i�im();
				break;
			case "f":
				System.out.println(" bizi tercihiniz i�in thanks");
				break;
			default:
				System.out.println("l�tfen gecerli gri� yap�n�z ");
				break;
			}
		} while (!i�lem.equals("f"));
		
		

	}

	private static void �ifreDe�i�im() {

		System.out.println("l�tfen kullan�mda olan �ifrenizi griniz");

		Scanner scan = new Scanner(System.in);
		String grilen�if = scan.next();
		if (grilen�if.equals(Sifre1)) {
			System.out.println("yeni �ifrenizi griniz");
			Sifre1 = scan.next();
		} else {
			System.out.println("kullan�mda olan �ifreniz yanl�� grildi ");
			�ifreDe�i�im();
		}
	}

	private static void paraG�nderme() {
		System.out.println("ne kadar kom�u g�nderece�in");
		Scanner scan = new Scanner(System.in);
		double g�nderi = scan.nextDouble();
		if (g�nderi > bakiye) {
			System.out.println("0lmaz olmaz ");
			System.out.println("bu kadar paran yok ");
		} else {
			bakiye -= g�nderi;
			System.out.println("son bakiyen" + bakiye);
		}

	}

	private static void para�ekme() {
		System.out.println("�ekece�iniz miktar nedir ");
		Scanner scan = new Scanner(System.in);
		double �ekilen = scan.nextDouble();
		if (�ekilen > bakiye) {
			System.out.println("i�lem no no no");

		} else {
			bakiye -= �ekilen;
			System.out.println("i�lem oldu yeni bakiye" + bakiye);

		}

	}

	private static void paraYat�rma() {
		System.out.println("l�tfen yat�r�lacak t�rar� griniz");
		Scanner scan = new Scanner(System.in);
		double yatacakTutar = scan.nextDouble();
		bakiye += yatacakTutar;
		System.out.println("para i�in tesekk�r yedik ");
		System.out.println(bakiye);
	}

}
