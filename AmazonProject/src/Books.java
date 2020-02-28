
public class Books extends Product {
	private String authorName; 
	private int pageCount; 
	private String publisherName; 
	//private String photoName; 
	public Books(String author, String publisher, int numPages, String photoName, double price) {
		this.authorName = author; 
		this.publisherName = publisher; 
		this.pageCount = numPages; 
		this.setPhotoName(photoName); 
	}
	public Books() {
	}
	public String getAuthorName() {
		return authorName;  
	}
	public String getPublisherName() {
		return publisherName; 
	}
	public int getPageCount() {
		return pageCount; 
	}

}
