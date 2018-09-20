package entities;

public class Product {
	
	private String code;
	
	//superclass constructor
	public Product(String code) {
		super();
		this.code = code;
	}
	
	//gettter and setter methods for superclass (shared with each subclass)
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
