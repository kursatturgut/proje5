package day42apstractcalssses;

public class absustabaþý extends Absiþçi {

	public static void main(String[] args) {
	
		absustabaþý ust1=new absustabaþý();
		ust1.statu();
		ust1.maaþ();
		ust1.mesai();
		ust1.concretemethod();
		ust1.abstratmethod();
	}

	@Override
	public void mesai() {
		
		System.out.println("ustabaþýnýnmesaisi 20 sattir arý bitene kadar çalýþ");
	}

	@Override
	public void maaþ() {
		System.out.println("imza maaþ muhasebe "); 
		
	}

	@Override
	public void statu() {
		System.out.println("þirkete alýna herkes personelimizdir imza ....personel");
		
	}

	@Override
	public void abstratmethod() {
		
		
	}

}
