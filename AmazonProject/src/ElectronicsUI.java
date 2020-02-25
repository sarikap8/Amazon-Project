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
	private JTextField txtRating;
	private JTextField txtBatteryLife;


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
        content.setBackground(new Color(153, 204, 255));
        
        JMenuBar menuBar = new JMenuBar();
        getContentPane().add(menuBar, BorderLayout.NORTH);
        
        JMenuItem menuItemPhones = new JMenuItem("Phones");
        menuBar.add(menuItemPhones);
        
        JMenuItem menuItemTablets = new JMenuItem("Tablets");
        menuBar.add(menuItemTablets);
        
        JMenuItem menuItemComputers = new JMenuItem("Computers");
        menuBar.add(menuItemComputers);
        
        JButton btnAddtoCart = new JButton("Add to cart");
        menuBar.add(btnAddtoCart);
        JButton button = new JButton("<");
        menuBar.add(button);
        
        JButton button_1 = new JButton(">");
        menuBar.add(button_1);
        
        txtRating = new JTextField();
        txtRating.setText("Rating");
        getContentPane().add(txtRating, BorderLayout.SOUTH);
        txtRating.setColumns(10);
        
        txtBatteryLife = new JTextField();
        txtBatteryLife.setText("Attributes");
        getContentPane().add(txtBatteryLife, BorderLayout.EAST);
        txtBatteryLife.setColumns(10);
        
        JLabel lblProductName = new JLabel("Product Name");
        getContentPane().add(lblProductName, BorderLayout.WEST);
        
        JLabel lblProductPhoto = new JLabel("Product Photo ");
        lblProductPhoto.setVerticalAlignment(SwingConstants.BOTTOM);
        getContentPane().add(lblProductPhoto, BorderLayout.CENTER);
		
		
	}
	
}
