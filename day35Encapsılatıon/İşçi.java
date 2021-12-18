package day35Encapsýlatýon;

public class Ýþçi extends muhasebe {

protected	String statu;
protected	String meslegi;
protected	String sendikasý;	
	public Ýþçi(){
		System.out.println("iþçi");
	}
	public static void main(String[] args) {
		

	Ýþçi iþçi1=new Ýþçi();
	iþçi1.meslegi="kaynakçý";
	iþçi1.saatÜcreti=20;
	iþçi1.isim="ali";
	iþçi1.maaþ=iþçi1.maaþHesapla();
	System.out.println(iþçi1.isim+" "+iþçi1.maaþ);
	
	
	
	
	}

}
