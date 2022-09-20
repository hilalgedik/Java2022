package sesliHarfler;

public class sesliHarfler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char harf = 'A';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("Ince sesli");
		}

	}

}
