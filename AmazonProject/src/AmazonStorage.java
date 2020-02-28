import java.util.ArrayList;
public class AmazonStorage {
	// ArrayList<Product> productList = new ArrayList<Product>();
	ArrayList<Books> bookList = new ArrayList<Books>();
	ArrayList<Product> electronicsList = new ArrayList<Product>();
	ArrayList<Product> clothingList = new ArrayList<Product>();
	ArrayList<Product> toysList = new ArrayList<Product>();
//all the stuff to make a book object that will go in an arraylist of type Product
	String[] bookNamesArray = { "Harry Potter", "Percy Jackson", "Hunger Games" };
	String[] bookPublisherArray = { "one", "two", "three" };
	String[] bookAuthorArray = { "JK Rowling", "Rick Riordan", "Suzanne Collins" };
	int[] bookPageCountArray = { 666, 777, 888 };
	String[] bookPhotoNameArray = { "Potter",
			"PercyJ", "HungerGames" };
	double[] bookRatingArray = { 5.0, 4.9, 4.8 };
	double[] bookPriceArray = {19.99, 20.99, 21.99}; 
	
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
	AmazonStorage() {
		for (int i = 0; i < 3; i++) {
			Books b = new Books(bookAuthorArray[i], bookPublisherArray[i], bookPageCountArray[i],
					bookPhotoNameArray[i], bookPriceArray[i]);
			b.setName(bookNamesArray[i]);
			b.setRating(bookRatingArray[i]);
			bookList.add(b);
		}
	}
	public Books getBook(int i) {
		return bookList.get(i);
	}
}