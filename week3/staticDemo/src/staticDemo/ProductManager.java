package staticDemo;

public class ProductManager {
	
	public void add(Product product) {
		//ProductValidator productValidator= new ProductValidator();
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Eklenmedi");
		}
		
		
		//ProductValidator validator = new ProductValidator();
		//validator.Deneme();
	}

}
