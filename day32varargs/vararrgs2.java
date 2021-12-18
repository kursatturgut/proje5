package day32varargs;

public class vararrgs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		KafanaGöretopla(5,8,7,9,12);
	
	
	
}
	public static void KafanaGöretopla(int sayý1, int... sayýlar){
		int toplam=0;
		for (int i : sayýlar) {
			
		toplam+=i;
		
		}
		System.out.println(sayý1*toplam);
}
}