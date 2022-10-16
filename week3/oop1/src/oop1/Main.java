package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object orriented programming//nesne yönelimli programlama
		//class isimleri büyük harfle başlar! PascalCase
		//field isimleri camelCase
		
		
		String mesaj= "Vade orani:" ;
		        //set value
		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("xxx.jpg");
		 
		        //get value
		//System.out.println(product1.name);
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("xxx.jpg");
	
		 
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("xxx.jpg");
	
		
		Product[] products= {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
			
		}
		System.out.println("</ul>");
		 
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setPhone("0522222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("hilal");
		individualCustomer.setLastName("gedik");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Gedik Meyvecilik A.Ş");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("88888888888");
		corporateCustomer.setCustomerNumber("123456");
		
		Customer[] customers = {individualCustomer,corporateCustomer};

	}

}
