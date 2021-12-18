package day44ýterators;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>liste=new ArrayList<>();
		liste.add("ali");
		liste.add("veli");
		liste.add("ayse");
		liste.add("zulal");
		liste.add("hilal");
		liste.add("ahmet");
		System.out.println(liste);
		
		
	ListIterator w=(ListIterator) liste.listIterator();
	
	while (((java.util.ListIterator<String>) w).hasNext()) {
		
	
	}
	
	
	
	
	}
}
