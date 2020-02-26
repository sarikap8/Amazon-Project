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
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JButton;
//hello
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
	private JTextField txtSearchForA;


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
        
        JMenuItem mntmHome = new JMenuItem("Home");
        mntmHome.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AmazonUI frame = new AmazonUI(); 
        		frame.setVisible(true);
        	}
        });
        menuBar.add(mntmHome);
        
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
        menuItemTablets.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ElectronicsUI frame = new ElectronicsUI(); 
        		frame.setVisible(true);
        	}
        });
        menuElectronics.add(menuItemTablets);
        
        JMenuItem menuItemPhones = new JMenuItem("Phones");
        menuItemPhones.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ElectronicsUI frame = new ElectronicsUI(); 
        		frame.setVisible(true);
        	}
        });
        menuElectronics.add(menuItemPhones);
        
        JMenu mnBooks = new JMenu("Books");
        menuBar.add(mnBooks);
        
        JMenuItem menuItemNonfiction = new JMenuItem("Nonfiction");
        menuItemNonfiction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		BooksUI frame = new BooksUI(); 
        		frame.setVisible(true);
        	}
        });
        mnBooks.add(menuItemNonfiction);
        
        JMenuItem mntmScifi = new JMenuItem("Scifi");
        mntmScifi.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		BooksUI frame = new BooksUI(); 
        		frame.setVisible(true);
        	}
        });
        mnBooks.add(mntmScifi);
        
        JMenuItem menuItemFiction = new JMenuItem("Fiction");
        menuItemFiction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		BooksUI frame = new BooksUI(); 
        		frame.setVisible(true);
        	}
        });
        mnBooks.add(menuItemFiction);
        
        JMenu mnClothing = new JMenu("Clothing");
        menuBar.add(mnClothing);
        
        JMenuItem menuItemSweatshirts = new JMenuItem("Sweatshirts");
        menuItemSweatshirts.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ClothingUI frame = new ClothingUI(); 
        		frame.setVisible(true);
        	}
        });
        mnClothing.add(menuItemSweatshirts);
        
        JMenuItem menuItemShirts = new JMenuItem("Shirts");
        menuItemShirts.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ClothingUI frame = new ClothingUI(); 
        		frame.setVisible(true);
        	}
        });
        mnClothing.add(menuItemShirts);
        
        JMenuItem menuItemJeans = new JMenuItem("Jeans");
        menuItemJeans.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ClothingUI frame = new ClothingUI(); 
        		frame.setVisible(true);
        	}
        });
        mnClothing.add(menuItemJeans);
        
        JMenu mnToys = new JMenu("Toys");
        menuBar.add(mnToys);
        
        JMenuItem menuItemDolls = new JMenuItem("Dolls");
        menuItemDolls.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ToysUI frame = new ToysUI(); 
        		frame.setVisible(true);
        	}
        });
        mnToys.add(menuItemDolls);
        
        JMenuItem menuItemTrucks = new JMenuItem("Trucks");
        menuItemTrucks.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ToysUI frame = new ToysUI(); 
        		frame.setVisible(true);
        	}
        });
        mnToys.add(menuItemTrucks);
        
        JMenuItem menuItemLegos = new JMenuItem("LEGOs");
        menuItemLegos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ToysUI frame = new ToysUI(); 
        		frame.setVisible(true);
        	}
        });
        mnToys.add(menuItemLegos);
        
        JMenuItem mntmMyCart = new JMenuItem("My Cart ");
        mntmMyCart.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CartUI frame = new CartUI(); 
        		frame.setVisible(true);
        	}
        });
        menuBar.add(mntmMyCart);
        
        JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane, BorderLayout.CENTER);
        
        txtSearchForA = new JTextField();
        txtSearchForA.setText("Search for a Product Category");
        txtSearchForA.setBounds(17, 17, 267, 26);
        layeredPane.add(txtSearchForA);
        txtSearchForA.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("#1 Best Seller right now");
        lblNewLabel.setBounds(17, 64, 218, 162);
        layeredPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setBounds(247, 64, 177, 162);
        layeredPane.add(lblNewLabel_1);
        
        JButton btnSearch = new JButton("Go To Above Product");
        btnSearch.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Search.searchAlgo(txtSearchForA.getText()); 
        	}
        });
        btnSearch.setBounds(17, 42, 117, 29);
        layeredPane.add(btnSearch);
		
		
	}
}
