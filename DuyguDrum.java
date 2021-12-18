import java.util.Scanner;

import Day10_Switccase.SwitchCase6;

public class DuyguDrum {

	static double bakiye = 0;
	static String kartNo = "1234";
	static String Sifre1 = "12345";
	static String iþlem = "";

	public static void main(String[] args) {
		/*
		 * Kullaniciya giriþ için kart numarasi ve þifresini isteyin, eger herhangi
		 * birini yanlis girerse tekrar isteyin. Kart numarasi aralarda boþluk ile
		 * girerse de eger doðruysa kabul edin. Kart numarasi ve sifre dogrulanirsa
		 * kullanicinin yapabileceði iþlemleri ekrana yazdirin, Bakiye sorgula, para
		 * yatirma, para çekme, para gönderme, sifre deðiþtirme ve cikis. Para çekme ve
		 * para gonderme iþleminde mevcut bakiyeden buyuk para çekilemez, Para gönderme
		 * iþleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger
		 * deðilse menü ekranina geri donsun. Sifre deðiþtirme iþleminde mevcut þifreyi
		 * teyit ettikten sonra, sifre deðiþiklik iþlemini yapmali,
		 */

		String kartN = "";
		String þifre = "";
    System.out.println("BANKAMIZA HOOOOÞ GELDÝNÝZ");
		do {

			Scanner scan = new Scanner(System.in);
			System.out.println("lütfen kart numaranýzý griniz");
			kartN = scan.next();
			System.out.println("lütfen kart sifrenizi griniz");
			þifre = scan.next();

		} while (!kartN.equals(kartNo) && !Sifre1.equals(þifre));

		System.out.println("kart numaranýz ve þifeniz basarýlý aferin  devam ediyoruz ");

		
		
		do {
			System.out.println("lütfen yapacagýnýz iþlemleri seçiniz \n bakiye sorgulama için : a"
					+ " \n parayatýrmak için :    b \n para çekmek için   :   c \n para göndermek için  : d \n þifre deðiþmek için  : e "
					+ "\n çýkýþ in:          "
					+ "   f ");

			
			Scanner scan = new Scanner(System.in);
			iþlem = scan.next().toLowerCase();

			switch (iþlem) {
			case "a":
				System.out.println(bakiye);
				break;
			case "b":
				paraYatýrma();

				break;
			case "c":
				paraÇekme();
				break;
			case "d":
				paraGönderme();
				break;
			case "e":
				þifreDeðiþim();
				break;
			case "f":
				System.out.println(" bizi tercihiniz için thanks");
				break;
			default:
				System.out.println("lütfen gecerli griþ yapýnýz ");
				break;
			}
		} while (!iþlem.equals("f"));
		
		

	}

	private static void þifreDeðiþim() {

		System.out.println("lütfen kullanýmda olan þifrenizi griniz");

		Scanner scan = new Scanner(System.in);
		String grilenþif = scan.next();
		if (grilenþif.equals(Sifre1)) {
			System.out.println("yeni þifrenizi griniz");
			Sifre1 = scan.next();
		} else {
			System.out.println("kullanýmda olan þifreniz yanlýþ grildi ");
			þifreDeðiþim();
		}
	}

	private static void paraGönderme() {
		System.out.println("ne kadar komþu göndereceðin");
		Scanner scan = new Scanner(System.in);
		double gönderi = scan.nextDouble();
		if (gönderi > bakiye) {
			System.out.println("0lmaz olmaz ");
			System.out.println("bu kadar paran yok ");
		} else {
			bakiye -= gönderi;
			System.out.println("son bakiyen" + bakiye);
		}

	}

	private static void paraÇekme() {
		System.out.println("çekeceðiniz miktar nedir ");
		Scanner scan = new Scanner(System.in);
		double çekilen = scan.nextDouble();
		if (çekilen > bakiye) {
			System.out.println("iþlem no no no");

		} else {
			bakiye -= çekilen;
			System.out.println("iþlem oldu yeni bakiye" + bakiye);

		}

	}

	private static void paraYatýrma() {
		System.out.println("lütfen yatýrýlacak týrarý griniz");
		Scanner scan = new Scanner(System.in);
		double yatacakTutar = scan.nextDouble();
		bakiye += yatacakTutar;
		System.out.println("para için tesekkür yedik ");
		System.out.println(bakiye);
	}

}
