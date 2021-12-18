package Day27;

public class C02_paramtrelicunstructer {

	public static void main(String[] args) {
		// javanın oluşturduğu default cunstructer ile obje olusturabiliyoruz ama her defasında yeniden deger 
		// ataması yapmak uzun oluyor 
		// istersek parametreli constructerar oluştrup
	// obje olusurken istediğim özellikleri atayabilirim 
	//	

		 Car1 car1=new Car1(5000, "opel", "beyaz", 2015 , true);
		 
		 //int km, String model, String renk, int yıl ,boolean satılıkmı
	
	
	Car1 car2=new Car1(5000 );
	
	System.out.println(car2.km);
	
	
	
	
	
	
	
	
	
	
	
	}

}
