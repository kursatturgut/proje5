package day43;

public class c04conrete implements C02interface {

	public static void main(String[] args) {
		c04conrete obj=new 	c04conrete();
obj.kporta(); // defaultlu metoda ulaþtýk obje ile 
obj.motor();
C02interface.sanzuman();// static olana sýnýfla ulaþabilirim 



	}
// sadecebody olmayaný overide etti dðierlerini etmedi 
	@Override
	public void motor() {
		
		
	}

}
