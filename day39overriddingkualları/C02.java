package day39overriddingkuallar�;

public class C02 extends C01 {

	public static void main(String[] args) {
C02 obj1=new C02();
obj1.staticMethod();
obj1.privatemethod();

C01 obj2=new C02();

		
		
		
	}

	public static void staticMethod() {
		System.out.println("child class static metod cal��t�");
	}
 
	private void privatemethod() {
		System.out.println("child clas private �al��t� ");
	}
	/*
	public final void finalmethod() {
		System.out.println("parents final �al��t� ");
	}
	*/
}
