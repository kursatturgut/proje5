package Day27;

public class Car1 {
	
	
	
	
	
	
	int yil=2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	
	public Car1() {
		
	}
	
	public Car1(int km, String model, String renk, int yýl, boolean satýlýkMý) {
		// atama yapacagýmýz tum özellikleri parametre olarak yolladýk
	}

	

	public Car1(int i) {
		km=i;
		
		
	}

	public void hiz(int hiz) {
		System.out.println("araba saatte " + hiz + " km yapar");
	}
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}

}