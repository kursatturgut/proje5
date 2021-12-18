package day32varargs;

public class Varargs6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// vararg basa ayazýlýrsa diðer int e sayý kalmaz hata verir  tum sayýlarý vavarg alýr diððerine sayý kalmaz 
// baska data trü olursa olabilir mi  onu sonradan kabul edermi   etmez varargs sonra olmalý 

		topla(5,8,7,9);	
	
	
	
	
	}
	public static void topla(int... sayýlar){
		int toplam=0;
		for (int i : sayýlar) {
			
		toplam+=i;
		
		}
		System.out.println();
		
	}
}
