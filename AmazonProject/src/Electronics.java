
public class Electronics extends Product {
	private String size; 
	private String color; 
	//private String photoName; 
	
	public Electronics(String productSize, String productColor, String photoName, double price) {
		this.size = productSize; 
		this.color = productColor; 
		this.setPhotoName(photoName); 
		this.price = price;
	}

	
	public String getProductSize() {
		return size;  
	}

	public String getColor() {
		return color; 
	}
}
