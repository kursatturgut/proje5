package Day28;

public class ConsrocterCall1 {
	int x = 3 ; 
	int y = 5 ;
	
	ConsrocterCall1(){
		x+=1 ;
		System.out.println("-x"+x);
	}
	ConsrocterCall1(int i){
	 this();
	 this.y = i ; 
	 x+=y ;
		System.out.println("-x"+x);
	}
	ConsrocterCall1(int i , int i2){
		this(3);
		this.x-=4 ;
		System.out.println("-x"+x);
	}
	
	public static void main(String[] args) {
		
		ConsrocterCall1 obje1=new ConsrocterCall1(4,3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
