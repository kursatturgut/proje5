package day43;

public class c04conrete implements C02interface {

	public static void main(String[] args) {
		c04conrete obj=new 	c04conrete();
obj.kporta(); // defaultlu metoda ula�t�k obje ile 
obj.motor();
C02interface.sanzuman();// static olana s�n�fla ula�abilirim 



	}
// sadecebody olmayan� overide etti d�ierlerini etmedi 
	@Override
	public void motor() {
		
		
	}

}
