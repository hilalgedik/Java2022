package staticDemo;

import javax.sound.midi.VoiceStatus;

public class ProductValidator {
	//javada classlar static olamaz
	
	public ProductValidator() {
		System.out.println("Yapici blok calisti");
	}
	
	static {
		System.out.println("Static Yapici blok calisti");
	}
	
	public static boolean isValid(Product product) {
		//static metodlar sınıf adını yazıp direk çağırılabilir yani new lemek gerekmez fakat sınıfla birlikte oluşur ve daima bellekte yer tutar.
		if ((product.price>0)&& !product.name.isEmpty()){
			
			return true;
			
		}else {
			return false;
		}
	}
	
	public void Deneme() {
		
	}
	
	public static class BaskaBirClass {
		public static void Sil() {
			//inner class, classlar içinde gruplama işlemleri için
		}
	}

}
