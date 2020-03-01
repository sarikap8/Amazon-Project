import javax.swing.JOptionPane;

public class Search {
public static void searchAlgo(String test) {
	test = test.toLowerCase(); 
	switch(test) {
	case "pant": 
		ClothingUI frame = new ClothingUI();
		frame.setVisible(true);
		break; 
	case "shirt": 
		ClothingUI frame1 = new ClothingUI();
		frame1.setVisible(true);
		break; 
	case "sweatshirt": 
		ClothingUI frame2 = new ClothingUI();
		frame2.setVisible(true);
		break; 
	case "dolls": 
		ToysUI frame3 = new ToysUI();
		frame3.setVisible(true);
		break; 
	case "trucks": 
		ToysUI frame4 = new ToysUI();
		frame4.setVisible(true);
		break; 
	case "legos": 
		ToysUI frame5 = new ToysUI();
		frame5.setVisible(true);
		break; 
	case "laptop": 
		ElectronicsUI frame6 = new ElectronicsUI();
		frame6.setVisible(true);
		break; 
	case "phone": 
		ElectronicsUI frame7 = new ElectronicsUI();
		frame7.setVisible(true);
		break; 
	case "tablet": 
		ElectronicsUI frame8 = new ElectronicsUI();
		frame8.setVisible(true);
		break; 
	case "nonfiction": 
		BooksUI frame9 = new BooksUI("nonfiction");
		frame9.setVisible(true);
		break; 
	case "fiction": 
		BooksUI frame10 = new BooksUI("fiction");
		frame10.setVisible(true);
		break; 
	case "scifi": 
		BooksUI frame11 = new BooksUI("Scifi");
		frame11.setVisible(true);
		break; 
	default: 
		JOptionPane.showMessageDialog(null, "Try searching again term not found");
		break; 
	}
}

}
