package day35Encapsýlatýon;

public class Personel {
	
	protected String isim;
	protected String soyad;
	protected boolean çalýþýyorMu;
	protected String telNo;
	protected int yaþ;
	
	Personel(){
		System.out.println("personel");
	}
	//eger variable'lara access modifier yazmazsak java access modifier olarak default
	// access modifier atar boyle olursa sadece o package altindaki child classlar
	//Personel clas'ini inherit edebilir
	//baska package'lardaki child claslarin da personeli inherit edebilmesi icin
	//variable ve methodlarin access modifier'larini protected yapariz
	//public yapsak da inherit edilebilir ama biz herkesin erismesini degil
	//sadece child clas'larin erismesini istedigimizden protected tercih ederiz
	
	

}
