package control_products;
import control_general.Product;

public class Electronics extends Product {
	private String size; 
	private String color; 
	private String screenSize; 
	//private String photoName; 
	
	public Electronics(String name, String productSize, String productColor, String screenSize, String photoName,  double price, double rating) {
		this.size = productSize; 
		this.color = productColor; 
		this.screenSize = screenSize;
		this.setName(name);
		this.setPhotoName(photoName); 
		this.setPrice(price);
		this.setRating(rating); 
	}

	
	public String getProductSize() {
		return size;  
	}

	public String getColor() {
		return color; 
	}
	
	public String getScreenSize() {
		return screenSize; 
	}
}
