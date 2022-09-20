package miniProjeAsalSayi;

import java.io.NotActiveException;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=9;
		int remainder = number % 2;
		boolean isPrime =true;
		/*System.out.println(remainder);*/
		
		if (number==1) {
			System.out.println("Sayi asal degildir.");
			return;	
		}
		
		if (number<1) {
			System.out.println("Gecersiz sayi.");
			return;	
		}

		for (int i=2; i<number; i++) {
				remainder=number % i;
				if (remainder==0) {
					
					isPrime=false;
					break;
											
				}else {
					isPrime=true;
				}
			
		}
		
		if (isPrime) {
			System.out.println( number + " asal sayidir.");
		}else {
			System.out.println( number + " asal sayi degildir.");
		}
		
	}
	

}
