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
        getContentPane().setLayout(null);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 450, 30);
        getContentPane().add(menuBar);
        
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
        txtRating.setBounds(178, 82, 197, 16);
        txtRating.setText("Rating");
        getContentPane().add(txtRating);
        txtRating.setColumns(10);
        
        txtBatteryLife = new JTextField();
        txtBatteryLife.setBounds(178, 110, 272, 127);
        txtBatteryLife.setText("Attributes");
        getContentPane().add(txtBatteryLife);
        txtBatteryLife.setColumns(10);
       		
        JLabel lblProductPhoto = new JLabel("Product Photo ");
        lblProductPhoto.setBounds(0, 82, 145, 142);
        lblProductPhoto.setVerticalAlignment(SwingConstants.BOTTOM);
        getContentPane().add(lblProductPhoto);
        
        JLabel lblProductName = new JLabel("Product Name");
        lblProductName.setBounds(0, 47, 450, 23);
        getContentPane().add(lblProductName);
        
	}
	
}
