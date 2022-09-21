package mukemmelSayi;

public class MukemmelSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=6;
		int remainder = number % 1;
		int total=0;
		
		for(int i=1; i<number; i++ ){
			
			remainder=number % i;
			if (remainder==0) {
				total=total+i;
			}
			
		}
		if (total==number) {
			System.out.println(number + " mukemmel sayidir.");
		}else {
			System.out.println(number + " mukemmel sayi degildir.");
		}

	}

}
