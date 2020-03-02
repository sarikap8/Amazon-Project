package control_general;
import javax.swing.JOptionPane;

import view_amazon.AmazonUI;
import view_amazon.BooksUI;
import view_amazon.ClothingUI;
import view_amazon.ElectronicsUI;
import view_amazon.ToysUI;

public class Search {
public static void searchAlgo(String test) {
	test = test.toLowerCase(); 
	switch(test) {
	case "pant": 
		ClothingUI frame = new ClothingUI("jeans");
		frame.setVisible(true);
		AmazonUI.curr.setVisible(false);
		AmazonUI.curr = frame;
		break; 
	case "shirt": 
		ClothingUI frame1 = new ClothingUI("shirts");
		frame1.setVisible(true);
		AmazonUI.curr.setVisible(false);
		AmazonUI.curr = frame1;
		break; 
	case "sweaters": 
		ClothingUI frame2 = new ClothingUI("sweaters");
		frame2.setVisible(true);
		AmazonUI.curr.setVisible(false);
		AmazonUI.curr = frame2;
		break; 
	case "dolls": 
		ToysUI frame3 = new ToysUI("dolls");
		frame3.setVisible(true);
		AmazonUI.curr.setVisible(false);
		AmazonUI.curr = frame3;
		break; 
	case "trucks": 
		ToysUI frame4 = new ToysUI("trucks");
		frame4.setVisible(true);
		AmazonUI.curr.setVisible(false);
		AmazonUI.curr = frame4;
		break; 
	case "legos": 
		ToysUI frame5 = new ToysUI("legos");
		frame5.setVisible(true);
		AmazonUI.curr.setVisible(false);
		AmazonUI.curr = frame5;
		break; 
	case "laptop": 
		ElectronicsUI frame6 = new ElectronicsUI("computers");
		frame6.setVisible(true);
		AmazonUI.curr.setVisible(false);
		AmazonUI.curr = frame6;
		break; 
	case "phone": 
		ElectronicsUI frame7 = new ElectronicsUI("phones");
		frame7.setVisible(true);
		AmazonUI.curr.setVisible(false);
		AmazonUI.curr = frame7;
		break; 
	case "tablet": 
		ElectronicsUI frame8 = new ElectronicsUI("tablets");
		frame8.setVisible(true);
		AmazonUI.curr.setVisible(false);
		AmazonUI.curr = frame8;
		break; 
	case "nonfiction": 
		BooksUI frame9 = new BooksUI("nonfiction");
		frame9.setVisible(true);
		AmazonUI.curr.setVisible(false);
		AmazonUI.curr = frame9;
		break; 
	case "fiction": 
		BooksUI frame10 = new BooksUI("fiction");
		frame10.setVisible(true);
		AmazonUI.curr.setVisible(false);
		AmazonUI.curr = frame10;
		break; 
	case "scifi": 
		BooksUI frame11 = new BooksUI("Scifi");
		frame11.setVisible(true);
		AmazonUI.curr.setVisible(false);
		AmazonUI.curr = frame11;
		break; 
	default: 
		JOptionPane.showMessageDialog(null, "Try searching again term not found");
		break; 
	}
}

}
