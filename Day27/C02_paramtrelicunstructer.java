package Day27;

public class C02_paramtrelicunstructer {

	public static void main(String[] args) {
		// javan�n olu�turdu�u default cunstructer ile obje olusturabiliyoruz ama her defas�nda yeniden deger 
		// atamas� yapmak uzun oluyor 
		// istersek parametreli constructerar olu�trup
	// obje olusurken istedi�im �zellikleri atayabilirim 
	//	

		 Car1 car1=new Car1(5000, "opel", "beyaz", 2015 , true);
		 
		 //int km, String model, String renk, int y�l ,boolean sat�l�km�
	
	
	Car1 car2=new Car1(5000 );
	
	System.out.println(car2.km);
	
	
	
	
	
	
	
	
	
	
	
	}

}
