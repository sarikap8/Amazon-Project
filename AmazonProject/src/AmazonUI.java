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
        content.setBackground(new Color(204, 204, 204));
        
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
        txtSearchForA.setText("Type Product Name here: List Below");
        txtSearchForA.setBounds(194, 50, 250, 26);
        layeredPane.add(txtSearchForA);
        txtSearchForA.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("#1 Best Seller right now");
        lblNewLabel.setOpaque(true);
        lblNewLabel.setBackground(new Color(153, 102, 102));
        lblNewLabel.setBounds(16, 108, 166, 137);
        layeredPane.add(lblNewLabel);
        
        JLabel lblLogo = new JLabel("");
        lblLogo.setIcon(new ImageIcon("src/Unknown.jpeg"));
        lblLogo.setBounds(16, 34, 166, 62);
        layeredPane.add(lblLogo);
        
        JButton btnSearch = new JButton("Go!");
        btnSearch.setForeground(new Color(102, 0, 0));
        btnSearch.setBackground(new Color(102, 0, 0));
        btnSearch.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Search.searchAlgo(txtSearchForA.getText()); 
        	}
        });
        btnSearch.setBounds(252, 78, 117, 29);
        layeredPane.add(btnSearch);
        
        JLabel lblNewLabel_1 = new JLabel("<html>Products:<br> </br>Electronics: Tablet, Computer, Phone<br>\n</br>Clothing: Sweatshirt, Jeans, Shirt<br>\n</br>Toys: Dolls, Trucks, LEGOs<br>\n</br>Books: Scifi, Fiction, Nonfiction</html>");
        lblNewLabel_1.setBackground(new Color(204, 102, 102));
        lblNewLabel_1.setBounds(194, 108, 250, 137);
        lblNewLabel_1.setOpaque(true);
        layeredPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("WELCOME TO AMAZON ");
        lblNewLabel_2.setHorizontalAlignment(JLabel.CENTER);
        lblNewLabel_2.setOpaque(true);
        lblNewLabel_2.setBackground(new Color(102, 0, 0));
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setBounds(6, 6, 438, 16);
        layeredPane.add(lblNewLabel_2);
        
        JLabel lblSearch = new JLabel("SEARCH: ");
        lblSearch.setOpaque(true);
        lblSearch.setBackground(new Color(204, 153, 153));
        lblSearch.setBounds(287, 34, 61, 16);
        layeredPane.add(lblSearch);
		
		
	}
}
