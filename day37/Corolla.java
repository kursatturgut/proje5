package day37;

public class Corolla extends Toyota {

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayýsý = 4;
	String üretimYeri = "Türkiye";

	public static void main(String[] args) {

		Corolla araba1 = new Corolla();
      System.out.println(araba1.çalýþýyorMu);
	System.out.println(araba1.tekerSayýsý);
      Toyota araba2 = new Corolla();
System.out.println(araba2.çalýþýyorMu);
System.out.println(araba2.tekerSayýsý);
	Araba arb3 = new Corolla();
	System.out.println(arb3.çalýþýyorMu);
	}

}
