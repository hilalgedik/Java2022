package sayiBulma;

public class SayiBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			System.out.println(aranacak + " dizi elemanidir.");
		}else {
			System.out.println(aranacak + " dizi elemani degildir.");
		}

	}

}
