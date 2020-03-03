package control_general;

import java.util.ArrayList;

public class Cart {
    static ArrayList<Product> cartItems = new ArrayList<Product>(); 


	public Cart() {
		// TODO Auto-generated constructor stub
	}
	
	public static void addProduct(Product aProduct)
	{
		cartItems.add(aProduct);
		
	}
	
	public static ArrayList getCartItems()
	{
		return cartItems;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
