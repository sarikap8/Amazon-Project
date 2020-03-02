package control_general;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public abstract class Product {
	public String name;
	public double price;
	public double rating;
	public double totalPrice;
	public String item;
	private String photoName; 
    ArrayList<String> cartItems = new ArrayList<String>(); 
	
	public String getName() {
		return name;		
	}
	public void setName(String myName) {
		this.name = myName; 
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double myPrice) {
		this.price = myPrice; 
	}
	public double getTotalPrice(String item){
		return totalPrice;
	}
	
	public double getRating() {
		return rating;
	}
	public String getPhotoName() {
		return photoName; 
	}
	public void setRating(double myRating) {
		this.rating = myRating; 
		//return myRating; 
	}
	public void setPhotoName(String photo) {
		this.photoName = photo; 
		//return photo; 
	}
	public void addCart(String item) {
		cartItems.add(item);
	}
	
	public void removeCart(String item) {
		cartItems.remove(item);
	}
	
	public ArrayList<String> displayCart() {
		return cartItems;
		
	}
	
	public void checkOut() {
		System.out.println("Purchase all items in cart?");
		System.out.println("Total Cost: " + totalPrice);
		//if user clicks button "Yes"
		//System.out.println("Purchase successful");
	}
}
