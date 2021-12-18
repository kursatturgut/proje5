package day33;

public class builderDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	StringBuilder sb =new StringBuilder("java candýr can"); 
	sb.deleteCharAt(12);
	System.out.println(sb);
	sb.delete(11, 13);
	System.out.println(sb);
	sb.delete(2, sb.length());
	System.out.println(sb);
	
	sb.capacity();
	System.out.println(sb.capacity());
	
	
	
	}

}
