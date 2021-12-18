package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class dosya {

	public static void main(String[] args) {
		
  
  
	try {
		FileInputStream dosya=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\fall21eng\\javaFall2021\\src\\day40\\file");
		int k=0;
	while ((k=dosya.read())!=-1) {
		System.out.print((char)k);
	}
	} catch (IOException e) {
		
	}
	
	
	
	
	}

}
