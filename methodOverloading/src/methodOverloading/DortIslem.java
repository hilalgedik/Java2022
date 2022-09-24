package methodOverloading;

public class DortIslem {

	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	//iki methodun imza parametreleri farklı olduğu için aynı isimle overrite edilebilir
	public int topla(int sayi1, int sayi2,int sayi3) {
		return sayi1 + sayi2+sayi3;
	}
	
}
