package abstractClasses;

public abstract class GameCalculator {
	
	public abstract void hesapla();
	//metod abstrract oldugunda tüm extendler bunu kullanmak ve override etmek zorunda
	//abstract sınıflar tek başına kullanılamaz
	

	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	
}
