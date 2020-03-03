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

import control_products.Electronics;

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
public class ElectronicsUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int electronicsIndex;
	private static int electronicsLowerIndex = 0;
	private static int electronicsUpperIndex = 0;

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
	static JLabel lblPrice = new JLabel("Price: ");
	static JLabel lblProductPhoto = new JLabel("");
	static JLabel lblProductName = new JLabel(" NAME: ");
	static JLabel lblAttributes = new JLabel("");

	public static void updateUI() {
		Electronics e = AmazonUI.productStorage.getElectronics(electronicsIndex);
		lblAttributes.setText("<html> Storage: " + e.getProductSize()
				+ "<br> </br> Color: " + e.getColor() + 
				"<br> </br> Screen Size: " + e.getScreenSize() + "<br> </br>Rating: " + e.getRating() + "</html>");
		lblProductPhoto
		.setIcon(new ImageIcon("src/pics/" + AmazonUI.productStorage.getElectronics(electronicsIndex).getPhotoName() + ".jpg"));
		lblPrice.setText("PRICE: $" + e.getPrice());
		lblProductName.setText("NAME: " + e.getName()); 
	}

	public ElectronicsUI(String typeClicked) {
		//Checks what type of books should be shown
		if (typeClicked.contentEquals("computers"))
		{
			electronicsLowerIndex = 0;
			electronicsUpperIndex = 2;
		}
		else if(typeClicked.contentEquals("phones"))
		{
			electronicsLowerIndex = 3;
			electronicsUpperIndex = 5;
		}
		else if(typeClicked.contentEquals("tablets"))
		{
			electronicsLowerIndex = 6;
			electronicsUpperIndex = 8;
		}
		
		//setting the book index to start at the right place
		electronicsIndex = electronicsLowerIndex;
		
		
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
		
		
		JMenuItem menuItemComputers = new JMenuItem("Computers");
		menuItemComputers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ElectronicsUI frame = new ElectronicsUI("computers"); 
        		frame.setVisible(true);
        		AmazonUI.curr.setVisible(false);
				AmazonUI.curr = frame;
			}
		});
		menuBar.add(menuItemComputers);

		JMenuItem menuItemPhones = new JMenuItem("Phones");
		menuItemPhones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ElectronicsUI frame = new ElectronicsUI("phones"); 
        		frame.setVisible(true);
        		AmazonUI.curr.setVisible(false);
				AmazonUI.curr = frame;
			}
		});
		menuBar.add(menuItemPhones);

		JMenuItem menuItemTablets = new JMenuItem("Tablets");
		menuItemTablets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ElectronicsUI frame = new ElectronicsUI("tablets"); 
        		frame.setVisible(true);
        		AmazonUI.curr.setVisible(false);
				AmazonUI.curr = frame;
			}
		});
		menuBar.add(menuItemTablets);

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
				electronicsIndex --; 
				if(electronicsIndex < electronicsLowerIndex) {
					electronicsIndex = electronicsUpperIndex; 
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
				electronicsIndex++; 
				if (electronicsIndex > electronicsUpperIndex) {
					electronicsIndex = electronicsLowerIndex; 
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
					}
				});
				btnAddtoCart.setBounds(671, 423, 136, 41);
				getContentPane().add(btnAddtoCart);
		updateUI(); 
	}

}
