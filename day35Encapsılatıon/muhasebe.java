package day35Encaps�lat�on;

public class muhasebe extends Personel {

	protected int saat�creti;
	protected String statu;
	protected int maa�;
	protected muhasebe(){
		System.out.println("muhasip");
	}
	
	public static void main(String[] args) {
		
  muhasebe �al��an1=new muhasebe();
  �al��an1.isim="ali";
  System.out.println(�al��an1.isim);
  �al��an1.maa�=1200;

	}
public int maa�Hesapla() {
	int maa�=8*25*saat�creti;
	return maa�;
}
}
