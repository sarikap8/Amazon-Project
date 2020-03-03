package control_products;
import control_general.Product;

public class Clothing extends Product {
	private String clothingSize; 
	private String clothingColor; 
	private String clothingMaterial; 
	//private String photoName; 
	public Clothing(String name, String size, String color, String material, String photoName, double price, double rating) {
		this.clothingSize = size; 
		this.clothingColor = color; 
		this.clothingMaterial = material; 
		this.setName(name);
		this.setPhotoName(photoName); 
		this.setPrice(price);
		this.setRating(rating); 
	}
	
	public String getClothingSize() {
		return clothingSize;  
	}
	
	public String getClothingColor() {
		return clothingColor; 
	}
	
	public String getClothingMaterial() {
		return clothingMaterial; 
	}
}
