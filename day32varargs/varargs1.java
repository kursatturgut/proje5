package day32varargs;

public class varargs1 {

	public static void main(String[] args) {
		// 

		
	topla(5,8,7,9);	
		
		
		
		
		
		
		
		
		
		
		}
public static void topla(int... sayýlar){
	int toplam=0;
	for (int i : sayýlar) {
		
	toplam+=i;
	
	}
	System.out.println(toplam);
	
}




}
