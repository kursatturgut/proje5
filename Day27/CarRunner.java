package Day27;

import Day26foreach.Car;

public class CarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// d�nk� car clas�ndan obje olustural�m
	
	Car1 cart =new Car1 ();
	System.out.println(cart.km);
	
	cart.km=75;
	cart.model="corolla";
	cart.renk="siyah";
	System.out.println(cart.km);
	
	
	Car1 cart2=new Car1();  // yeni obje olusturdugumuz i�in �zell�kler ilk hale d�nd� yeni atama laz�m 
	System.out.println(cart2.km);
	
	Car1 car3 =new Car1();  // bir obje daha olusturduk 
			car3.km =400;
			System.out.println(car3.km);
	
	
	
	
	
	
	
	
	
	}

}
