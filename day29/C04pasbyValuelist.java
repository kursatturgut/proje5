package day29;

import java.util.ArrayList;
import java.util.List;

public class C04pasbyValuelist {

	public static void main(String[] args) {
		// list olustur list elemanlrýný deðiþtir metodu yazýp orada list elamnlarýný bazýlarýný deðiþtrelim
	// metod void olsun maine döndükten sonra yeniden list yazdýralým 
		
	List<String>harfler=new ArrayList<>();
	harfler.add("a");
	harfler.add("b");
	harfler.add("c");
	System.out.println(harfler);
	
	listelemenDeðiþtir(harfler);
	System.out.println(harfler);
	
	
	
	
	
	
	
	}
     private static void listelemenDeðiþtir(List<String> harfler) {
	   	// 
		harfler.set(0, "d");
	System.out.println(harfler);
	}

}
