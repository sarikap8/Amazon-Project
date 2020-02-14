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

/** Menu
 * Entry point for project
 * 
 * @author Sarika Sonia Lauren
 *
 *
 */
public class AmazonUI extends JFrame {

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
	public AmazonUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

        Container content = getContentPane();
        content.setBackground(new Color(153, 204, 255));
        
        JMenuBar menuBar = new JMenuBar();
        getContentPane().add(menuBar, BorderLayout.NORTH);
        
        JMenu menuElectronics = new JMenu("Electronics");

        menuBar.add(menuElectronics);
        
        JMenuItem menuItemComputers = new JMenuItem("Computers");
        menuElectronics.add(menuItemComputers);
        menuItemComputers.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ElectronicsUI frame = new ElectronicsUI(); 
        		frame.setVisible(true);
        	}
        });
        JMenuItem menuItemTablets = new JMenuItem("Tablets");
        menuElectronics.add(menuItemTablets);
        
        JMenuItem menuItemPhones = new JMenuItem("Phones");
        menuElectronics.add(menuItemPhones);
        
        JMenu mnBooks = new JMenu("Books");
        menuBar.add(mnBooks);
        
        JMenuItem menuItemNonfiction = new JMenuItem("Nonfiction");
        mnBooks.add(menuItemNonfiction);
        
        JMenuItem mntmScifi = new JMenuItem("Scifi");
        mnBooks.add(mntmScifi);
        
        JMenuItem menuItemFiction = new JMenuItem("Fiction");
        mnBooks.add(menuItemFiction);
        
        JMenu mnClothing = new JMenu("Clothing");
        menuBar.add(mnClothing);
        
        JMenuItem menuItemSweatshirts = new JMenuItem("Sweatshirts");
        mnClothing.add(menuItemSweatshirts);
        
        JMenuItem menuItemShirts = new JMenuItem("Shirts");
        mnClothing.add(menuItemShirts);
        
        JMenuItem menuItemJeans = new JMenuItem("Jeans");
        mnClothing.add(menuItemJeans);
        
        JMenu mnToys = new JMenu("Toys");
        menuBar.add(mnToys);
        
        JMenuItem menuItemDolls = new JMenuItem("Dolls");
        mnToys.add(menuItemDolls);
        
        JMenuItem menuItemTrucks = new JMenuItem("Trucks");
        mnToys.add(menuItemTrucks);
        
        JMenuItem menuItemLegos = new JMenuItem("LEGOs");
        mnToys.add(menuItemLegos);
        
        JMenuItem mntmMyCart = new JMenuItem("My Cart ");
        menuBar.add(mntmMyCart);
		
		
	}
	
}
