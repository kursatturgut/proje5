package day38;

public class KümesHayvanlarý extends Kuþlar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	KümesHayvanlarý kms1 =new KümesHayvanlarý();
	kms1.beslenme();
	kms1.hareket();
	kms1.solunum();
	
	Kuþlar kms2=new KümesHayvanlarý();
	kms2.beslenme();
	kms2.hareket();
	kms2.solunum();
	
	Kuþlar kms3=new Kuþlar();
	kms3.beslenme();
	kms3.hareket();
	kms3.solunum();
	
	Anýmals kms4=new KümesHayvanlarý();
	kms4.beslenme();
	kms4.hareket();
	kms4.solunum();
	}
	public void hareket() {
		 System.out.println("küms hayvanlarý haretket eder ");
	 }
	
	
	
	
	
	
	
	
}
