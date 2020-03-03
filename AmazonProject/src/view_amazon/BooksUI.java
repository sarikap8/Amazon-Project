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
import control_products.Books;

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
public class BooksUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int bookIndex;
	private static int bookLowerIndex = 0;
	private static int bookUpperIndex = 0;

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
	static JLabel lblRating = new JLabel("Rating: ");
	static JLabel lblProductPhoto = new JLabel("");
	static JLabel lblProductName = new JLabel(" NAME: ");
	static JLabel lblAttributes = new JLabel("");

	public static void updateUI() {
		Books b = AmazonUI.productStorage.getBook(bookIndex);
		lblAttributes.setText("<html> Author: " + b.getAuthorName()
				+ "<br> </br> Page Count: " + b.getPageCount() + "<br> </br> Rating: " + b.getRating() + "</html>");
		lblProductPhoto
		.setIcon(new ImageIcon("src/pics/" + AmazonUI.productStorage.getBook(bookIndex).getPhotoName() + ".jpg"));
		lblRating.setText("PRICE: $" + b.getPrice());
		lblProductName.setText("NAME: " + b.getBookTitle().toUpperCase()); 
	}

	public BooksUI(String typeClicked) {
		//Checks what type of books should be shown
		if (typeClicked.contentEquals("fiction"))
		{
			bookLowerIndex = 0;
			bookUpperIndex = 2;
		}
		else if(typeClicked.contentEquals("nonfiction"))
		{
			bookLowerIndex = 3;
			bookUpperIndex = 5;
		}
		else if(typeClicked.contentEquals("scifi"))
		{
			bookLowerIndex = 6;
			bookUpperIndex = 8;
		}
		
		//setting the book index to start at the right place
		bookIndex = bookLowerIndex;
		
		
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
		
		
		JMenuItem menuItemFiction = new JMenuItem("Fiction");
		menuItemFiction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BooksUI frame = new BooksUI("fiction"); 
        		frame.setVisible(true);
        		AmazonUI.curr.setVisible(false);
				AmazonUI.curr = frame;
			}
		});
		menuBar.add(menuItemFiction);

		JMenuItem menuItemNonfiction = new JMenuItem("Nonfiction");
		menuItemNonfiction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BooksUI frame = new BooksUI("nonfiction"); 
        		frame.setVisible(true);
        		AmazonUI.curr.setVisible(false);
				AmazonUI.curr = frame;
			}
		});
		menuBar.add(menuItemNonfiction);

		JMenuItem menuItemScifi = new JMenuItem("Scifi");
		menuItemScifi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BooksUI frame = new BooksUI("scifi"); 
        		frame.setVisible(true);
        		AmazonUI.curr.setVisible(false);
				AmazonUI.curr = frame;
			}
		});
		menuBar.add(menuItemScifi);

		lblProductPhoto.setBounds(6, 77, 264, 334);
		
		getContentPane().add(lblProductPhoto);
		
		lblProductName.setForeground(new Color(255, 255, 255));
		lblProductName.setBackground(new Color(102, 0, 0));
		lblProductName.setOpaque(true);
		lblProductName.setBounds(10, 42, 797, 23);
		getContentPane().add(lblProductName);

		lblRating.setBackground(new Color(153, 102, 102));
		lblRating.setOpaque(true);
		lblRating.setBounds(276, 67, 531, 30);
		getContentPane().add(lblRating);

		lblAttributes.setOpaque(true);
		lblAttributes.setBackground(new Color(204, 153, 153));
		lblAttributes.setBounds(276, 104, 531, 307);
		getContentPane().add(lblAttributes);

		
		
		
		//Previous Book
		JButton button = new JButton("<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookIndex --; 
				if(bookIndex < bookLowerIndex) {
					bookIndex = bookUpperIndex; 
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
				bookIndex++; 
				if (bookIndex > bookUpperIndex) {
					bookIndex = bookLowerIndex; 
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
						JOptionPane.showMessageDialog(null, "Okay, added to cart!");
						Books b = AmazonUI.productStorage.getBook(bookIndex);
						Cart.addProduct(b);
					}
				});
				btnAddtoCart.setBounds(671, 423, 136, 41);
				getContentPane().add(btnAddtoCart);
		updateUI(); 
	}

}
