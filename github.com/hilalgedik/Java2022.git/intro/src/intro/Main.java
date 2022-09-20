package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello Hilal ");
		System.out.println("Hello Darling");
		
		double dolarBugun = 18.09;
		double dolarDun=18.10;
		
		String okYonu="";
				
		int vade =12;
		boolean dolarDustuMu = false;
		
		if (dolarBugun<dolarDun) {
			okYonu="down.svg";
			System.out.println(okYonu);
		}else if (dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		
		else {
			okYonu="equals.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler = {"Hizli Kredi", "Maasini HalkBanktan alanlar","Mutlu Emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
