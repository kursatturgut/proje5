package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception2 {

	public static void main(String[] args) {
		// verin array i�in kullan�c�dan say� isteyin ve frilen say�y� indexs olarak kabul 
		//edip o indexsteki e�emeemti yazd�r�n

        int arr[]= {2,3,4,5,6,7,8};

        

        try {
        	 
        	Scanner scan=new Scanner (System.in);
            
            System.out.println("l�rtfen indexs");
            int index=scan.nextInt();
           
        
        	System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("indexsi fazla oldu yeniden denen");
		}catch (InputMismatchException e) {
			System.out.println("say� olmal� ");
		}
        
        
	
       
        
        
        
	
	}

}
