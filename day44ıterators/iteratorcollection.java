package day44�terators;

import java.util.ArrayList;
import java.util.List;

public class iteratorcollection {

	public static void main(String[] args) {
		
		List<Integer>liste=new ArrayList<>();
		liste.add(2);
		liste.add(1);
		liste.add(25);
		liste.add(28);
		liste.add(20);
		liste.add(23);
		liste.add(21);
		liste.add(24);
System.out.println(liste);
// indeks kullanmadan tum elmanlara �� ekle 
for (Integer w : liste) {
	System.err.print(w+3+"  ");
// de�i�iklikler lokal kald� kal�c� de�il atama yok ekeldik localde gecerli	
}
System.out.println();
System.out.println(liste);




	}

}
