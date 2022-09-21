package arkadasSayilar;

public class ArkadasSayilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=220;
		int number2=284;
		int remainder1=number1 % 1;
		int remainder2=number2 % 1;
		boolean isFriendNumber = true;
		int toplam1=0;
		int toplam2=0;
		
		for(int i=1; i<number1; i++) {
			remainder1=number1%i;
			if (remainder1==0) {
				toplam1=toplam1+i;
			}		
		}
		if (toplam1==number2) {
			isFriendNumber=true;
		}else {
			isFriendNumber=false;
		}
		
		for(int j=1; j<number2; j++) {
			remainder2=number2%j;
			if (remainder2==0) {
				toplam2=toplam2+j;
			}
		}
		if (toplam2==number1) {
			isFriendNumber=true;
		}else {
			isFriendNumber=false;
		}

		if (isFriendNumber==true) {
			System.out.println(number1+ "  ve " + number2 +" arkadas sayilardir.");
		}else {
			System.out.println(number1+ "  ve " + number2 +" arkadas sayilar degildir.");
		}
			
	}

}
