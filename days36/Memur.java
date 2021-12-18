package days36;

import day35Encapsýlatýon.muhasebe;

public class Memur extends muhasebe {

	Memur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Memur memur1=new Memur();
	memur1.isim="hasan";
	memur1.saatÜcreti=16;
	memur1.maaþ=memur1.maaþHesapla();
	System.out.println(memur1.isim+"   "+memur1.maaþ);
	
	
	
	
	
	
	
	
	
	
	
	}

}
