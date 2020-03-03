package view_amazon;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import control_general.Cart;
import control_general.Product;
import control_products.Toys;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
/**
 * Menu Entry point for project
 * 
 * @author Sarika Sonia Lauren
 *
 *
 */
public class ToysUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int toysIndex;
	private static int toysLowerIndex = 0;
	private static int toysUpperIndex = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AmazonUI frame = new AmazonUI();
					frame.setVisible(true);
					AmazonUI.curr.setVisible(false);
					AmazonUI.curr = frame;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	static JLabel lblPrice = new JLabel("Rating: ");
	static JLabel lblProductPhoto = new JLabel("");
	static JLabel lblProductName = new JLabel(" NAME: ");
	static JLabel lblAttributes = new JLabel("");

	public static void updateUI() {
		Toys t = AmazonUI.productStorage.getToys(toysIndex);
		lblAttributes.setText("<html> Recommended Age: " + t.getProductAge()
				+ "<br> </br> Color: " + t.getColor() +  "<br> </br> Rating: " + t.getRating() + "</html>");
		lblProductPhoto
		.setIcon(new ImageIcon("src/pics/" + AmazonUI.productStorage.getToys(toysIndex).getPhotoName() + ".jpg"));
		lblPrice.setText("PRICE: $" + t.getPrice());
		lblProductName.setText("NAME: " + t.getName()); 
	}

	public ToysUI(String typeClicked) {
		//Checks what type of books should be shown
		if (typeClicked.contentEquals("trucks"))
		{
			toysLowerIndex = 0;
			toysUpperIndex = 2;
		}
		else if(typeClicked.contentEquals("dolls"))
		{
			toysLowerIndex = 3;
			toysUpperIndex = 5;
		}
		else if(typeClicked.contentEquals("legos"))
		{
			toysLowerIndex = 6;
			toysUpperIndex = 8;
		}
		
		//setting the book index to start at the right place
		toysIndex = toysLowerIndex;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 551);

		Container content = getContentPane();
		content.setBackground(new Color(204, 204, 204));
		getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 807, 30);
		getContentPane().add(menuBar);

		JMenuItem menuItemHome = new JMenuItem("Home");
		menuItemHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AmazonUI frame = new AmazonUI(); 
        		frame.setVisible(true);
        		AmazonUI.curr.setVisible(false);
				AmazonUI.curr = frame;
			}
		});
		menuBar.add(menuItemHome);
		
		
		JMenuItem menuItemTrucks = new JMenuItem("Trucks");
		menuItemTrucks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ToysUI frame = new ToysUI("trucks"); 
        		frame.setVisible(true);
        		AmazonUI.curr.setVisible(false);
				AmazonUI.curr = frame;
			}
		});
		menuBar.add(menuItemTrucks);

		JMenuItem menuItemDolls = new JMenuItem("Dolls");
		menuItemDolls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ToysUI frame = new ToysUI("dolls"); 
        		frame.setVisible(true);
        		AmazonUI.curr.setVisible(false);
				AmazonUI.curr = frame;
			}
		});
		menuBar.add(menuItemDolls);

		JMenuItem menuItemLegos = new JMenuItem("Legos");
		menuItemLegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ToysUI frame = new ToysUI("legos"); 
        		frame.setVisible(true);
        		AmazonUI.curr.setVisible(false);
				AmazonUI.curr = frame;
			}
		});
		menuBar.add(menuItemLegos);

		lblProductPhoto.setBounds(6, 77, 264, 334);
		
		getContentPane().add(lblProductPhoto);
		
		lblProductName.setForeground(new Color(255, 255, 255));
		lblProductName.setBackground(new Color(102, 0, 0));
		lblProductName.setOpaque(true);
		lblProductName.setBounds(10, 42, 797, 23);
		getContentPane().add(lblProductName);

		lblPrice.setBackground(new Color(153, 102, 102));
		lblPrice.setOpaque(true);
		lblPrice.setBounds(276, 67, 531, 30);
		getContentPane().add(lblPrice);

		lblAttributes.setOpaque(true);
		lblAttributes.setBackground(new Color(204, 153, 153));
		lblAttributes.setBounds(276, 104, 531, 307);
		getContentPane().add(lblAttributes);

		
		
		
		//Previous Book
		JButton button = new JButton("<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toysIndex --; 
				if(toysIndex < toysLowerIndex) {
					toysIndex = toysUpperIndex; 
				}
				updateUI(); 
			}
		});
		button.setBounds(0, 423, 75, 29);
		getContentPane().add(button);

		//Next book
		JButton button_1 = new JButton(">");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toysIndex++; 
				if (toysIndex > toysUpperIndex) {
					toysIndex = toysLowerIndex; 
				}
				//Books c = AmazonUI.productStorage.getBook(bookIndex);
				updateUI();
			}
		});
		button_1.setBounds(209, 423, 75, 29);
		getContentPane().add(button_1);

		JLabel lblViewOtherProducts = new JLabel("View Other Products");
		lblViewOtherProducts.setHorizontalAlignment(JLabel.CENTER);
		lblViewOtherProducts.setBounds(77, 428, 145, 16);
		getContentPane().add(lblViewOtherProducts);
		
				JButton btnAddtoCart = new JButton("Add to cart");
				btnAddtoCart.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Product aProduct = AmazonUI.productStorage.getToys(toysIndex);
						Cart.addProduct(aProduct);
						JOptionPane.showMessageDialog(null, "Okay, added to cart!");					}
				});
				btnAddtoCart.setBounds(671, 423, 136, 41);
				getContentPane().add(btnAddtoCart);
				
				JLabel lblbg = new JLabel("New label");
				lblbg.setBounds(0, 29, 825, 500);
				lblbg.setIcon(new ImageIcon("src/pics/test5.jpg"));
				getContentPane().add(lblbg);
		updateUI(); 
	}

}
