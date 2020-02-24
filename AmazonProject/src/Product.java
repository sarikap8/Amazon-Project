import java.util.ArrayList;

public abstract class Product {
	private String name;
	private double price;
	private double rating;
	cartItems = new String[]{""};
	
	public String getName() {
		return name;		
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void addCart(String item) {
		ArrayList<String> cartItems = new ArrayList<String>();
		cartItems.add(item);
	}
	
	public void checkOut() {
		System.out.println("Purchase all items in cart?");
		System.out.println(cartItems);
	}

}
