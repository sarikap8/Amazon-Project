import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Product {
	public String name;
	public double price;
	public double rating;
	public double totalPrice;
	public String item;
    LinkedList<String> cartItems = new LinkedList<String>(); 

	
	
	public String getName() {
		return name;		
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getTotalPrice(String item){
		return totalPrice;
		
	}
	
	public double getRating() {
		return rating;
	}
	
	public void addCart(String item) {
		cartItems.add(item);
	}
	
	public void removeCart(String item) {
		cartItems.remove(item);
	}
	
	public void checkOut() {
		System.out.println("Purchase all items in cart?");
		System.out.println("Total Cost: " + totalPrice);
		System.out.println("Purchase succesful");
	}

}
