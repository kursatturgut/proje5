package day44ıterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c03iterator {

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
		
		
		Iterator ite1=liste.iterator();
		
		
		ite1.next();
		ite1.next();
		ite1.next();
		
		System.out.println(ite1.next());
		ite1.remove();
		
		System.out.println(liste);
		
		
	}

}
