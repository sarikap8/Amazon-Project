package control_products;
import control_general.Product;

public class Books extends Product {
	private String authorName; 
	private int pageCount;
	

	public Books(String title, String author, int numPages, String photoName, double price, double rating) {
		this.name = title;
		this.authorName = author; 
		this.pageCount = numPages; 
		this.setPhotoName(photoName); 
		this.price = price;
		this.rating = rating;
	}
	public String getAuthorName() {
		return authorName;  

	}
	
	public int getPageCount() {
		return pageCount; 
	}
	
	
}
