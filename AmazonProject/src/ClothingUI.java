import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
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
public class ClothingUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int bookIndex;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AmazonUI frame = new AmazonUI();
					frame.setVisible(true);
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
	static JLabel lblProductPhoto = new JLabel("Product Photo ");
	static JLabel lblProductName = new JLabel(" NAME: ");
	static JLabel lblAttributes = new JLabel("");

	
	public ClothingUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 831, 551);

		Container content = getContentPane();
		content.setBackground(new Color(204, 204, 204));
		getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 807, 30);
		getContentPane().add(menuBar);

		JMenuItem menuItemFiction = new JMenuItem("Shirts");
		menuBar.add(menuItemFiction);

		JMenuItem menuItemNonfiction = new JMenuItem("Jeans");
		menuBar.add(menuItemNonfiction);

		JMenuItem menuItemScifi = new JMenuItem("Sweatshirts");
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

		JButton button = new JButton("<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
			}
		});
		button.setBounds(0, 423, 75, 29);
		getContentPane().add(button);

		JButton button_1 = new JButton(">");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_1.setBounds(209, 423, 75, 29);
		getContentPane().add(button_1);

		JLabel lblViewOtherProducts = new JLabel("View Other Products");
		lblViewOtherProducts.setHorizontalAlignment(JLabel.CENTER);
		lblViewOtherProducts.setBounds(77, 428, 145, 16);
		getContentPane().add(lblViewOtherProducts);
		
				JButton btnAddtoCart = new JButton("Add to cart");
				btnAddtoCart.setBounds(671, 423, 136, 41);
				getContentPane().add(btnAddtoCart);
	}

}
