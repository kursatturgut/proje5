package day29;

import java.util.ArrayList;
import java.util.List;

public class C04pasbyValuelist {

	public static void main(String[] args) {
		// list olustur list elemanlr�n� de�i�tir metodu yaz�p orada list elamnlar�n� baz�lar�n� de�i�trelim
	// metod void olsun maine d�nd�kten sonra yeniden list yazd�ral�m 
		
	List<String>harfler=new ArrayList<>();
	harfler.add("a");
	harfler.add("b");
	harfler.add("c");
	System.out.println(harfler);
	
	listelemenDe�i�tir(harfler);
	System.out.println(harfler);
	
	
	
	
	
	
	
	}
     private static void listelemenDe�i�tir(List<String> harfler) {
	   	// 
		harfler.set(0, "d");
	System.out.println(harfler);
	}

}
