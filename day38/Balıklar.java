package day38;

public class Bal�klar extends An�mals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bal�klar bal�k1 =new Bal�klar();
		bal�k1.beslenme();
		bal�k1.hareket();
		bal�k1.solunum();
		
		
	}
	@Override
	 public void hareket() {
		 System.out.println("t�m bal�klar y�zerek haretket eder ");
	 }
	 
	 
	 public void solunum() {
		 System.out.println("t�m bal�klar solungaclar�yla nefes al�r ");
	 }
	
	
	
	
	
	
	
	
	
	
	

}
