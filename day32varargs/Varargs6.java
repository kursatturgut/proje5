package day32varargs;

public class Varargs6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// vararg basa ayaz�l�rsa di�er int e say� kalmaz hata verir  tum say�lar� vavarg al�r di��erine say� kalmaz 
// baska data tr� olursa olabilir mi  onu sonradan kabul edermi   etmez varargs sonra olmal� 

		topla(5,8,7,9);	
	
	
	
	
	}
	public static void topla(int... say�lar){
		int toplam=0;
		for (int i : say�lar) {
			
		toplam+=i;
		
		}
		System.out.println();
		
	}
}
