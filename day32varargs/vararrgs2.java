package day32varargs;

public class vararrgs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		KafanaG�retopla(5,8,7,9,12);
	
	
	
}
	public static void KafanaG�retopla(int say�1, int... say�lar){
		int toplam=0;
		for (int i : say�lar) {
			
		toplam+=i;
		
		}
		System.out.println(say�1*toplam);
}
}