package day38;

public class K�mesHayvanlar� extends Ku�lar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	K�mesHayvanlar� kms1 =new K�mesHayvanlar�();
	kms1.beslenme();
	kms1.hareket();
	kms1.solunum();
	
	Ku�lar kms2=new K�mesHayvanlar�();
	kms2.beslenme();
	kms2.hareket();
	kms2.solunum();
	
	Ku�lar kms3=new Ku�lar();
	kms3.beslenme();
	kms3.hareket();
	kms3.solunum();
	
	An�mals kms4=new K�mesHayvanlar�();
	kms4.beslenme();
	kms4.hareket();
	kms4.solunum();
	}
	public void hareket() {
		 System.out.println("k�ms hayvanlar� haretket eder ");
	 }
	
	
	
	
	
	
	
	
}
