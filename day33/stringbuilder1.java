package day33;

public class stringbuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb =new StringBuilder();
		sb.length();
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	
	StringBuilder sb1= new StringBuilder("java candýr");
	System.out.println(sb1.capacity());
	
	StringBuilder sb3 =new StringBuilder();
	sb3.append("ssddd");
	System.out.println(sb3);
	System.out.println(sb3.length());
	System.out.println(sb3.capacity());
	
	sb.append("java");
	System.out.println(sb);
	sb.append(" candýr");
	System.out.println(sb);
	
	sb.append("heyweeewwww", 3,8 );
	
	System.out.println(sb);
	
	
	
	
	
	}

}
