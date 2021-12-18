package day44ıterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class itera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		@SuppressWarnings("rawtypes")
		Iterator ite1 =liste.iterator();
		
		for (int i = 0; i < liste.size(); i++) {
			
			System.out.println(ite1.hasNext()+"    "+ite1.next());
			
			
		}
		System.out.println(ite1.hasNext());
	//	System.out.println(ite1.next());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
