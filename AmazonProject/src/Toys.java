
public class Toys extends Product {
	private String productAge; 
	private String color; 
	//private String photoName; 
	public Toys(String recAge, String productColor, String photoName) {
		this.productAge = recAge; 
		this.color = productColor; 
		this.setPhotoName(photoName); 
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