package methods;

import java.security.PublicKey;

public class Main {

	public static void main(String[] args) {
sayiBulmaca();
		
	 

	}
	public static void sayiBulmaca() {
		
		int[] sayilar = new int[]{1,2,5,7,9,0};
		int aranacak=5;
		boolean varMi=true;
		
		for(int sayi:sayilar) {
			if (sayi==aranacak) {
				varMi=true;
				
				break;
			}
		}
		
		if (varMi) {
		mesajVer(aranacak);
		}else {
			System.out.println(aranacak + " dizi elemani degildir.");
		}
	}
	
	public static void mesajVer(int aranacak) {
		System.out.println("Sayi Mevcuttur: " +aranacak );
	}
	

}
