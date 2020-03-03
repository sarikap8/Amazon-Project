package control_general;
import java.util.ArrayList;
import java.util.Random; 

import control_products.Books;
import control_products.Clothing;
import control_products.Electronics;
import control_products.Toys;
public class AmazonStorage {
	// ArrayList<Product> productList = new ArrayList<Product>();
	ArrayList<Books> bookList = new ArrayList<Books>();
	ArrayList<Electronics> electronicsList = new ArrayList<Electronics>();
	ArrayList<Clothing> clothingList = new ArrayList<Clothing>();
	ArrayList<Toys> toysList = new ArrayList<Toys>();
	
	//constructor initializes and makes a bunch of books, clothes, toys, electronics, etc. 
	public AmazonStorage() 
	{
		setUpBooks();
		setUpClothing();
		setUpElectronics();
		setUpToys();
	}
	
	
	//will be used in setUpBooks()
	public void addBook(String title, String author, int numPages, String photoName, double price, int rating)
	{
		Books book = new Books(title, author, numPages, photoName, price, rating);
		bookList.add(book);
	}
	
	public Books getBook(int i) {
		return bookList.get(i);
	}
	
	
	public void setUpBooks()
	{
		//fiction books
		addBook("Harry Potter and the Sorcerer's Stone", "JKRowling", 701, "HarryPotter1", 31.50, 8);
		addBook("Harry Potter and the Chamber of Secrets", "JKRowling", 670, "HarryPotter2", 21.99, 9);
		addBook("Harry Potter and the Prisoner of Azkaban", "JKRowling", 780, "HarryPotter3", 25.99, 8);
		
		//non-fiction books
		addBook("The Silent Spring", "Rachel Carson", 300, "SilentSpring", 15.99, 7);
		addBook("Educated", "Tara Westover", 220, "Educated", 21.99, 5);
		addBook("Outliers", "Malcolm Gladwell", 350, "Outliers", 16.99, 8);
		
		//sci-fi books
		addBook("Fahrenheit 451", "Ray Bradbury", 500, "Fahrenheit", 32.99, 9);
		addBook("Snow Crash", "Neil Stephenson", 400, "SnowCrash", 15.999, 7);
		addBook("1984", "George Orwell", 330, "1984", 13.99, 9);
	}
	
	//used in setUpClothing()
	public void addClothing(String name, String size, String color, String material, String photoName, double price, int rating)
	{
		Clothing clothing = new Clothing(name, size, color, material, photoName, price, rating);
		clothingList.add(clothing);
	}
	//makes a clothing object
	public Clothing getClothing(int i) {
		return clothingList.get(i);
	}
	
	public void setUpClothing()
	{
		//Sweaters
		addClothing("Pink Sweater", "Large", "Pink", "Cotton", "Pink", 31.50, 4);
		addClothing("Blue Sweater", "Medium", "Blue", "Cotton", "Blue",  21.99, 3);
		addClothing("Black Sweater", "Small", "Black", "Cotton", "Black", 25.99, 7);
		
		//Jeans
		addClothing("Blue Jeans", "Large","Blue", "Jean", "BlueJeans", 10.15, 8);
		addClothing("Black Jeans", "Medium", "Black", "Jean", "BlackJeans", 21.99, 9);
		addClothing("White Jeans", "Small", "White", "Jean", "WhiteJeans", 16.99, 5);
		
		//Shirts
		addClothing("Pink Shirt", "Large", "Pink", "Cotton", "PinkShirt", 32.99, 1);
		addClothing("Blue Shirt", "Medium", "Blue", "Cotton", "BlueShirt", 15.999, 10);
		addClothing("Black Shirt", "Small", "Black", "Cotton", "BlackShirt", 13.99, 3);
	}
	
	
	public void addElectronics(String name, String productSize, String productColor, String screenSize, String photoName, double price, double rating)
	{
		Electronics electronics = new Electronics(name, productSize, productColor, screenSize, photoName, price, rating);
		electronicsList.add(electronics);
	}
	
	public Electronics getElectronics(int i) {
		return electronicsList.get(i);
	}
	
	public void setUpElectronics()
	{
		//computers
		addElectronics("DELL Computer", "128 GB", "Black", "15 inches", "computer1", 250.99, 8);
		addElectronics("Lenovo Computer", "256 GB", "Black", "16 inches", "computer2", 589.99, 3);
		addElectronics("Black MacBook", "512 GB", "Black", "11 inches", "computer3", 1000.99, 10);
		
		//phones
		addElectronics("Black iPhone", "64 GB", "Black", "4 inches", "phone1", 100.50, 6);
		addElectronics("Black iPod", "128 GB", "Black", "5.3 inches", "phone2", 200.00, 7);
		addElectronics("White iPhone", "64 GB", "White", "4 inches","phone3", 130.95, 9);
		
		//tablets
		addElectronics("Black iPad", "64 GB", "Black", "7 inches", "ipad1", 350.45, 10);
		addElectronics("Black tablet", "128 GB", "Black", "6 inches", "ipad2", 200.00, 8);
		addElectronics("Black Samsung Note", "256 GB", "Black", "8 inches", "ipad3", 450.99, 9);
	}
	
	public void addToys(String name, String recAge, String productColor, String photoName, double price, double rating)
	{
		Toys toys = new Toys(name, recAge, productColor, photoName, price, rating);
		toysList.add(toys);
	}
	
	public Toys getToys(int i) {
		return toysList.get(i);
	}

	public void setUpToys()
	{
		//trucks
		addToys("Red Firetruck", "4-7", "Red", "trucks1", 2.99, 6);
		addToys("Red Civilian Truck", "3", "Red", "trucks2", 3.99, 4);
		addToys("Yellow Emergency Truck", "6", "Yellow", "trucks3", 4.99, 8);
		
		//dolls
		addToys("Rag Doll (Basic)", "5-6", "None", "dolls1", 12.50, 9);
		addToys("Rag Doll (Deluxe)", "5-8", "None", "dolls2", 14.00, 10);
		addToys("Rag Doll (Limited Edition),", "9+", "None", "dolls3", 11.95, 5);
		
		//legos
		addToys("Ultimate LEGO set", "9-12", "Yellow", "legos1", 2.45, 9);
		addToys("Beginner's LEGO set", "6-7", "Yellow", "legos2", 2.00, 6);
		addToys("Toddler LEGO Set", "2-3", "Yellow", "legos3", 1.99, 5);
	}
	
	

	
	
}