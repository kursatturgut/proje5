package day33;

public class zaman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Soru : For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani kontrol edip 
		// StringBuilder ve String class’larinin performanslarini karsilastiralim.   
		// Ipucu: long TimeSb = System.nanoTime(); kullanalim
	
	
	String str="merhaba";
	StringBuilder sb= new StringBuilder ("merhaba");
	sb.trimToSize();
	long Time1 = System.nanoTime();
	
  for (int i = 0; i < 10000; i++) {
	str+=" ";
	
}
  long Time2 = System.nanoTime();
	
	long StringSure=Time2-Time1;
	
	long Time3 = System.nanoTime();
	
	  for (int i = 0; i < 10000; i++) {
		sb.append(" ");
		
	}
	  long Time4 = System.nanoTime();
		
		long StringBulderSure1=Time4-Time3;
		
		if (StringSure<StringBulderSure1) {
			System.out.println("a");
		} else {
System.out.println("b");
		}
	System.out.println(StringSure/StringBulderSure1);
	
	
	
	}

}
