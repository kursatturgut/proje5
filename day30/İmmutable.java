package day30;

import java.util.ArrayList;
import java.util.List;

public class �mmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// strng immutable iken list mutable d�r 
		String str="ali";
		str.toUpperCase();// ali atama yok yaz�d�rma  yok havada 
		System.out.println(str); // ilk aliyi yazd�rd� atam yok 
		
		System.out.println(str.toUpperCase());
	
	System.out.println(str); //immutable oldu�u i�in dvaran�ss� budur 
	
	List<String>isimler=new ArrayList<>();
	
	System.out.println(isimler);
	
	
	isimler.add("ali");
	System.out.println(isimler);
	isimler.set(0, "zati");
	System.out.println(isimler);
	
	
	
	
	
	
	
	
	}

}
