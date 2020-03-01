
public class Books extends Product {
	private String title;
	private String authorName; 
	private int pageCount; 
	private double price;
	

	public Books(String title, String author, int numPages, String photoName, double price, double rating) {
		this.title = title;
		this.authorName = author; 
		this.pageCount = numPages; 
		this.setPhotoName(photoName); 
		this.price = price;
		this.rating = rating;
	}

	public String getBookTitle() {
		return title;  

	}
	
	public String getAuthorName() {
		return authorName;  

	}
	
	public int getPageCount() {
		return pageCount; 
	}

	public double getPrice()
	{
		return price;
	}
	
	
}