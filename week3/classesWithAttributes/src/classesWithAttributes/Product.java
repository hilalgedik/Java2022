package classesWithAttributes;

public class Product {
	//parametreli ctorlar sınıf newlendiğinde mutlaka bu parametrelerin bulunması gerektiğini bildirir. bu parametreler eksikse sınıf newlenmez
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
	System.out.println("Yapici blok calisti");
	_id=id;
	_name=name;
	_description=description;
	_price=price;
	_stockAmount=stockAmount;
	_renk=renk;
	}
	
	public Product() {
		
	}
	
	//attribute or field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;
	

	public int getId() {
		return _id;
	}
	public void setId(int id) {
	   _id=id;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
	   _name=name;
	}
	public String getDescription() {
		return _description;
	}
	public void setDescription(String description) {
		_description=description;
	}
	public double getPrice() {
		return _price;
	}
	public void setPrice(double price) {
		_price=price;
	}
	public int get_stockAmount() {
		return _stockAmount;
	}
	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}
	public String getRenk() {
		return _renk;
	}
	public void setRenk(String renk) {
		_renk = renk;
	}
	public String getKod() {
		return this._name.substring(0,1) + _id;
	}

	
}
