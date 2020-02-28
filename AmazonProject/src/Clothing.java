
public class Clothing extends Product {
	private String clothingSize; 
	private String clothingColor; 
	private String clothingMaterial; 
	//private String photoName; 
	public Clothing(String size, String color, String material, String photoName, double price) {
		this.clothingSize = size; 
		this.clothingColor = color; 
		this.clothingMaterial = material; 
		this.setPhotoName(photoName); 
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
