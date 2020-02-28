
public class Electronics extends Product {
	private String size; 
	private String color; 
	//private String photoName; 
	public Electronics(String productSize, String productColor, String photoName) {
		this.size = productSize; 
		this.color = productColor; 
		this.setPhotoName(photoName); 
	}
	public Electronics() {
	}
	public String getProductSize() {
		return size;  
	}

	public String getColor() {
		return color; 
	}
}
