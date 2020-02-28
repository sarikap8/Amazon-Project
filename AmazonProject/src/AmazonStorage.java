import java.util.ArrayList;

public class AmazonStorage {
	// ArrayList<Product> productList = new ArrayList<Product>();
	ArrayList<Books> bookList = new ArrayList<Books>();
	ArrayList<Product> electronicsList = new ArrayList<Product>();
	ArrayList<Product> clothingList = new ArrayList<Product>();
	ArrayList<Product> toysList = new ArrayList<Product>();

	String[] bookNamesArray = { "Harry Potter", "Percy Jackson", "Hunger Games" };
	String[] bookPublisherArray = { "one", "two", "three" };
	String[] bookAuthorArray = { "JK Rowling", "Rick Riordan", "Suzanne Collins" };
	int[] bookPageCountArray = { 666, 777, 888 };
	String[] bookPhotoNameArray = { "Potter",
			"PercyJ", "HungerGames" };
	double[] bookRatingArray = { 5.0, 4.9, 4.8 };

	AmazonStorage() {
		for (int i = 0; i < 3; i++) {
			Books b = new Books(bookAuthorArray[i], bookPublisherArray[i], bookPageCountArray[i],
					bookPhotoNameArray[i]);
			b.setName(bookNamesArray[i]);
			b.setRating(bookRatingArray[i]);
			bookList.add(b);
		}
	}

	public Books getBook(int i) {
		return bookList.get(i);
	}
}
