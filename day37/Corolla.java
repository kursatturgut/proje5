package day37;

public class Corolla extends Toyota {

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSay�s� = 4;
	String �retimYeri = "T�rkiye";

	public static void main(String[] args) {

		Corolla araba1 = new Corolla();
      System.out.println(araba1.�al���yorMu);
	System.out.println(araba1.tekerSay�s�);
      Toyota araba2 = new Corolla();
System.out.println(araba2.�al���yorMu);
System.out.println(araba2.tekerSay�s�);
	Araba arb3 = new Corolla();
	System.out.println(arb3.�al���yorMu);
	}

}
