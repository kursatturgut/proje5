package day35Encapsılatıon;

public class muhasebe extends Personel {

	protected int saatÜcreti;
	protected String statu;
	protected int maaş;
	protected muhasebe(){
		System.out.println("muhasip");
	}
	
	public static void main(String[] args) {
		
  muhasebe çalışan1=new muhasebe();
  çalışan1.isim="ali";
  System.out.println(çalışan1.isim);
  çalışan1.maaş=1200;

	}
public int maaşHesapla() {
	int maaş=8*25*saatÜcreti;
	return maaş;
}
}
