package control_products;
import control_general.Product;

public class Toys extends Product {
	private String productAge; 
	private String color; 
	//private String photoName; 
	public Toys(String recAge, String productColor, String photoName, double price) {
		this.productAge = recAge; 
		this.color = productColor; 
		this.setPhotoName(photoName); 
		this.price = price;
	}
	public Toys() {
	}
	public String getProductAge() {
		return productAge;  
	}

	public String getColor() {
		return color; 
	}

}