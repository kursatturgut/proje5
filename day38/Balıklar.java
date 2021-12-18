package day38;

public class Balýklar extends Anýmals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Balýklar balýk1 =new Balýklar();
		balýk1.beslenme();
		balýk1.hareket();
		balýk1.solunum();
		
		
	}
	@Override
	 public void hareket() {
		 System.out.println("tüm balýklar yüzerek haretket eder ");
	 }
	 
	 
	 public void solunum() {
		 System.out.println("tüm balýklar solungaclarýyla nefes alýr ");
	 }
	
	
	
	
	
	
	
	
	
	
	

}
