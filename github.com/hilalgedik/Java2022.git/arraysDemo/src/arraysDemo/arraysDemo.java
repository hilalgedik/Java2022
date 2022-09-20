package arraysDemo;

import java.util.Iterator;

public class arraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ogrenciler = new String[3];
		ogrenciler[0]="Ali";
		ogrenciler[1]="Hasan";
		ogrenciler[2]="Ayse";
		
		for (int i = 0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
			
		}
		System.out.println("--------------");
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
			
		}
	}

}
