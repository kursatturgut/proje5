package day33;

public class StringBuilderEquls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	StringBuilder sb1 = new StringBuilder("java");
	StringBuilder sb2 = new StringBuilder("java");
	
	System.out.println(sb1==sb2);
	
	System.out.println(sb1.equals(sb2));
	
	System.out.println(sb1.compareTo(sb2)); // fark 0 gibi
	
	// ilk harflerden baþlayaraak builderlarý karsýlaþtrýrý tüm karakterler ayný ise farký sýfýr veriri 
	// builderlarý == ve equls karsýlastramaz 
	// compare to karþýlaþtrýrý
	// equls == gibi çalýþýr 
	
	if (sb1.compareTo(sb2)==0) {
		
	}
	
	String a=sb1.toString();
	System.out.println(sb1);
	
	
	System.out.println(a.equals(sb2));
	System.out.println(sb2.indexOf("v"));
	
	
	
	}

}
