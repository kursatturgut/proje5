package day33;

public class insrtjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	StringBuilder sb=new StringBuilder("java öðrendik");
	
	sb.insert(4 , " çok iyi");
	System.out.println(sb);
	
	
	sb.insert(8, " harika");
	System.out.println(sb);
	
	sb.insert(4, " hadi");
	System.out.println(sb);
	sb.insert(5, "çok iyiiym", 0, 4); // stringden alýp buildere koydu
	
	System.out.println(sb);
	
	sb.replace(4, 12, " ali");
	System.out.println(sb);  // silip ali yazdý
	
	sb.reverse();
	System.out.println(sb);
	
	
	
	}

}
