package control_products;
import control_general.Product;

public class Toys extends Product {
	private String productAge; 
	private String color; 
	//private String photoName; 
	public Toys(String name, String recAge, String productColor, String photoName, double price, double rating) {
		this.setName(name);
		this.productAge = recAge; 
		this.color = productColor; 
		this.setPhotoName(photoName); 
		this.setPrice(price);
		this.setRating(rating);
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