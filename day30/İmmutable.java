package day30;

import java.util.ArrayList;
import java.util.List;

public class Ýmmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// strng immutable iken list mutable dýr 
		String str="ali";
		str.toUpperCase();// ali atama yok yazýdýrma  yok havada 
		System.out.println(str); // ilk aliyi yazdýrdý atam yok 
		
		System.out.println(str.toUpperCase());
	
	System.out.println(str); //immutable olduðu için dvaranýssý budur 
	
	List<String>isimler=new ArrayList<>();
	
	System.out.println(isimler);
	
	
	isimler.add("ali");
	System.out.println(isimler);
	isimler.set(0, "zati");
	System.out.println(isimler);
	
	
	
	
	
	
	
	
	}

}
