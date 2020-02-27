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

/** Menu
 * Entry point for project
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
	public ElectronicsUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

        Container content = getContentPane();
        content.setBackground(new Color(204, 204, 204));
        getContentPane().setLayout(null);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 450, 30);
        getContentPane().add(menuBar);
        
        JMenuItem menuItemTablets = new JMenuItem("Tablets");
        menuBar.add(menuItemTablets);
        
        JMenuItem menuItemPhones = new JMenuItem("Phones");
        menuBar.add(menuItemPhones);
        
        JMenuItem menuItemComputers = new JMenuItem("Computers");
        menuBar.add(menuItemComputers);
        
        JButton btnAddtoCart = new JButton("Add to cart");
        menuBar.add(btnAddtoCart);
        
        JLabel lblProductPhoto = new JLabel("Product Photo ");
        lblProductPhoto.setBounds(6, 77, 145, 174);
        getContentPane().add(lblProductPhoto);
        
        JLabel lblProductName = new JLabel(" NAME: ");
        lblProductName.setForeground(new Color(255, 255, 255));
        lblProductName.setBackground(new Color(102, 0, 0));
        lblProductName.setOpaque(true);
        lblProductName.setBounds(10, 42, 434, 23);
        getContentPane().add(lblProductName);
        
        JLabel lblRating = new JLabel("Rating: ");
        lblRating.setBackground(new Color(153, 102, 102));
        lblRating.setOpaque(true);
        lblRating.setBounds(163, 67, 272, 30);
        getContentPane().add(lblRating);
        
        JLabel lblAttributes = new JLabel("<html> Battery Life: <br> </br> Screen Size: <br> </br> Storage: <br> </br>");
        lblAttributes.setOpaque(true);
        lblAttributes.setBackground(new Color(204, 153, 153));
        lblAttributes.setBounds(163, 104, 272, 127);
        getContentPane().add(lblAttributes);
        
        JButton button = new JButton("<");
        button.setBounds(157, 243, 75, 29);
        getContentPane().add(button);
        
        JButton button_1 = new JButton(">");
        button_1.setBounds(375, 243, 75, 29);
        getContentPane().add(button_1);
        
        JLabel lblViewOtherProducts = new JLabel("View Other Products");
        lblViewOtherProducts.setHorizontalAlignment(JLabel.CENTER);
        lblViewOtherProducts.setBounds(234, 248, 145, 16);
        getContentPane().add(lblViewOtherProducts);
		
		
	}
	
}
