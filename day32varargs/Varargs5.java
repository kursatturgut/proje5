package day32varargs;

public class Varargs5 {

	public static void main(String[] args) {
		// itiraz etmiyor

	
	
		KafanaG�rei�lem(5,1,2,1,1);
	
	
	
	
	}
	public static void KafanaG�rei�lem(int say�1, int say�2, int... say�lar){
		int toplam=0;
		for (int i : say�lar) {
			
		toplam+=i;
		
		}
		System.out.println(say�1*toplam);
}
}
