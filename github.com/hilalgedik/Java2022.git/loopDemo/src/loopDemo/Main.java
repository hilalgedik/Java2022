package loopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for
		for (int i = 1; i<10; i+=2) {
			System.out.println(i);
			
		}
		System.out.println("For döngüsü bitti");
		
		
		//while
		int i =1;	
		while (i<10) {
			
			System.out.println(i);
			i++;
		}
		System.out.println("while döngüsü bitti");
		
		//do-while
		int j=1;
		do {
	    System.out.println(j);
		j++;
			
		} 	while (j<10); 
		System.out.println("Do-while döngüsü bitti");
		
			
			
		
	}

}
