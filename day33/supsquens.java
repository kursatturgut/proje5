package day33;

public class supsquens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	StringBuilder sb =new StringBuilder("jav aögrenmek güzel");
	
	sb.substring(13);  // 8 i yazdýrýrr 
	
	System.out.println(sb.substring(13)); // stringede çevirir
	
	System.out.println(sb.subSequence(3, 7));
	
	System.out.println(sb);
	
	System.out.println(sb.substring(0).charAt(0)); // sitringe cevrdim ve metodunu kullandým 
	
	System.out.println(sb);
	
	}

}
