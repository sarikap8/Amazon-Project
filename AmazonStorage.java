import java.util.ArrayList;
public class AmazonStorage {
	// ArrayList<Product> productList = new ArrayList<Product>();
	ArrayList<Books> bookList = new ArrayList<Books>();
	ArrayList<Electronics> electronicsList = new ArrayList<Electronics>();
	ArrayList<Clothing> clothingList = new ArrayList<Clothing>();
	ArrayList<Toys> toysList = new ArrayList<Toys>();
	
	//constructor initializes and makes a bunch of books, clothes, toys, electronics, etc. 
	AmazonStorage() 
	{
		
		setUpBooks();
		setUpClothing();
		setUpElectronics();
		setUpToys();
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
	
	
	
	public void setUpClothing()
	{
		//Sweaters
		addClothing("Large", "Pink", "Cotton", "Pink", 31.50);
		addClothing("Medium", "Blue", "Cotton", "Blue",  21.99);
		addClothing("Small", "Black", "Cotton", "Black", 25.99);
		
		//Jeans
		addClothing("Large","Blue", "Jean", "BlueJeans", 10.15);
		addClothing("Medium", "Black", "Jean", "BlackJeans", 21.99);
		addClothing("Small", "White", "Jean", "WhiteJeans", 16.99);
		
		//Shirts
		addClothing("Large", "Pink", "Cotton", "PinkShirt", 32.99);
		addClothing("Medium", "Blue", "Cotton", "BlueShirt", 15.999);
		addClothing("Small", "Black", "Cotton", "BlackShirt", 13.99);
	}
	
	
	public void addClothing(String size, String color, String material, String photoName, double price)
	{
		Clothing clothing = new Clothing(size, color, material, photoName, price);
		clothingList.add(clothing);
	}
	
	public Clothing getClothing(int i) {
		return clothingList.get(i);
	}
	public void setUpElectronics()
	{
		//computers
		addElectronics("128 GB", "Black", "computer1", 250.99);
		addElectronics("256 GB", "Black", "computer2", 589.99);
		addElectronics("512 GB", "Black", "computer3", 1000.99);
		
		//phones
		addElectronics("64 GB", "Black", "phone1", 100.50);
		addElectronics("128 GB", "Black", "phone2", 200.00);
		addElectronics("64 GB", "White", "phone3", 130.95);
		
		//tablets
		addElectronics("64 GB", "Black", "ipad1", 350.45);
		addElectronics("128 GB", "Black", "ipad2", 200.00);
		addElectronics("256 GB", "Black", "ipad3", 450.99);
	}
	
	
	public void addElectronics(String productSize, String productColor, String photoName, double price)
	{
		Electronics electronics = new Electronics(productSize, productColor, photoName, price);
		electronicsList.add(electronics);
	}
	
	public Electronics getElectronics(int i) {
		return electronicsList.get(i);
	}
	public void setUpToys()
	{
		//trucks
		addToys("4", "Red", "trucks1", 2.99);
		addToys("3", "Red", "trucks2", 3.99);
		addToys("6", "Yellow", "trucks3", 4.99);
		
		//dolls
		addToys("5", "None", "dolls1", 12.50);
		addToys("5", "None", "dolls2", 14.00);
		addToys("5", "None", "dolls3", 11.95);
		
		//legos
		addToys("6", "Yellow", "legos1", 2.45);
		addToys("6", "Yellow", "legos2", 2.00);
		addToys("5", "Yellow", "legos3", 1.99);
	}
	
	
	public void addToys(String recAge, String productColor, String photoName, double price)
	{
		Toys toys = new Toys(recAge, productColor, photoName, price);
		toysList.add(toys);
	}
	
	public Toys getToys(int i) {
		return toysList.get(i);
	}
	
	
}