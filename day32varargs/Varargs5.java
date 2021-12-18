package day32varargs;

public class Varargs5 {

	public static void main(String[] args) {
		// itiraz etmiyor

	
	
		KafanaGöreiþlem(5,1,2,1,1);
	
	
	
	
	}
	public static void KafanaGöreiþlem(int sayý1, int sayý2, int... sayýlar){
		int toplam=0;
		for (int i : sayýlar) {
			
		toplam+=i;
		
		}
		System.out.println(sayý1*toplam);
}
}
