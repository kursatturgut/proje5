package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception2 {

	public static void main(String[] args) {
		// verin array için kullanýcýdan sayý isteyin ve frilen sayýyý indexs olarak kabul 
		//edip o indexsteki eþemeemti yazdýrýn

        int arr[]= {2,3,4,5,6,7,8};

        

        try {
        	 
        	Scanner scan=new Scanner (System.in);
            
            System.out.println("lürtfen indexs");
            int index=scan.nextInt();
           
        
        	System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("indexsi fazla oldu yeniden denen");
		}catch (InputMismatchException e) {
			System.out.println("sayý olmalý ");
		}
        
        
	
       
        
        
        
	
	}

}
