import java.util.ArrayList;
public class AmazonStorage {
	// ArrayList<Product> productList = new ArrayList<Product>();
	ArrayList<Books> bookList = new ArrayList<Books>();
	ArrayList<Product> electronicsList = new ArrayList<Product>();
	ArrayList<Product> clothingList = new ArrayList<Product>();
	ArrayList<Product> toysList = new ArrayList<Product>();
	
	
	//same but for electronics
	String[] eNamesArray = { "Harry Potter", "Percy Jackson", "TestName" };
	double[] ePriceArray = {19.99, 20.99, 21.99}; 
	double[] eStorageArray = {4.0, 5.0, 6.0}; 
	int[] eScreenSizeArray = { 666, 777, 888 };
	double[] eBatteryLifeArray = {5.5, 6, 12}; //this is in hours 
	String[] ePhotoNameArray = { "shirt",
			"tommy-hilfiger-pink-cotton-sweatshirt-289356-3331ba2c2b5e37dc788b89b71d6310f535378f44", "Unknown" };
	double[] eRatingArray = { 5.0, 4.9, 4.8 };
	
	//again for clothing
	String[] clothingNamesArray = { "Harry Potter", "Percy Jackson", "TestName" };
	double[] clothingPriceArray = {19.99, 20.99, 21.99}; 
	String[] clothingSizeArray = { "one", "two", "three" };
	String[] clothingMaterialArray = { "JK Rowling", "Rick Riordan", "TestAuthor" };
	int[] clothingColorArray = { 666, 777, 888 };
	String[] clothingPhotoNameArray = { "shirt",
			"tommy-hilfiger-pink-cotton-sweatshirt-289356-3331ba2c2b5e37dc788b89b71d6310f535378f44", "Unknown" };
	double[] clothingRatingArray = { 5.0, 4.9, 4.8 };
	
	//last time for toys 
	String[] toyNamesArray = { "Harry Potter", "Percy Jackson", "TestName" };
	double[] toyPriceArray = {19.99, 20.99, 21.99}; 
	String[] toyAgeRangeArray = { "1-3", "2-7", "9-13" };
	String[] toyColorArray = { "JK Rowling", "Rick Riordan", "TestAuthor" };
	int[] toySizeArray = { 666, 777, 888 }; //in inches i guess
	String[] toyPhotoNameArray = { "shirt",
			"tommy-hilfiger-pink-cotton-sweatshirt-289356-3331ba2c2b5e37dc788b89b71d6310f535378f44", "Unknown" };
	double[] toyRatingArray = { 5.0, 4.9, 4.8 };
	
	//constructor initializes and makes a bunch of books, clothes, toys, electronics, etc. 
	AmazonStorage() 
	{
		
		setUpBooks();
	}
	
	
	
	public void setUpBooks()
	{
		//fiction books
		addBook("Harry Potter and the Sorcerer's Stone", "JKRowling", 701, "HarryPotter1", 31.50, 8);
		addBook("Harry Potter and the Chamber of Secrets", "JKRowling", 670, "HarryPotter2", 21.99, 9);
		addBook("Harry Potter and the Prisoner of Azkaban", "JKRowling", 780, "HarryPotter3", 25.99, 8);
		
		//non-fiction books
		addBook("The Silent Spring", "Rachel Carson", 300, "SilentSpring", 15.99, 7);
		addBook("Educated", "Tara Westover", 220, "Educated", 21.99, 8);
		addBook("Outliers", "Malcolm Gladwell", 350, "Outliers", 16.99, 8);
		
		//sci-fi books
		addBook("Fahrenheit 451", "Ray Bradbury", 500, "Fahrenheit", 32.99, 9);
		addBook("Snow Crash", "Neil Stephenson", 400, "SnowCrash", 15.999, 7);
		addBook("1984", "George Orwell", 330, "1984", 13.99, 9);
	}
	
	
	public void addBook(String title, String author, int numPages, String photoName, double price, int rating)
	{
		Books book = new Books(title, author, numPages, photoName, price, rating);
		bookList.add(book);
	}
	
	public Books getBook(int i) {
		return bookList.get(i);
	}
}