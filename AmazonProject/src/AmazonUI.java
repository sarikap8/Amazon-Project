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
	public static AmazonStorage productStorage; 

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
		productStorage = new AmazonStorage();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 831, 551);

        Container content = getContentPane();
        content.setBackground(new Color(204, 204, 204));
        getContentPane().setLayout(null);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 817, 22);
        getContentPane().add(menuBar);
        
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
        
        txtSearchForA = new JTextField();
        txtSearchForA.setBounds(511, 98, 259, 32);
        getContentPane().add(txtSearchForA);
        txtSearchForA.setText("Type Product Name here: List Below");
        txtSearchForA.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("#1 Best Seller right now");
        lblNewLabel.setBounds(20, 290, 189, 214);
        getContentPane().add(lblNewLabel);
        lblNewLabel.setOpaque(true);
        lblNewLabel.setBackground(new Color(153, 102, 102));
        
        JLabel lblLogo = new JLabel("");
        lblLogo.setBounds(7, 61, 486, 219);
        getContentPane().add(lblLogo);
        lblLogo.setIcon(new ImageIcon("src/Unknown.jpeg"));
        
        JButton btnSearch = new JButton("Go!");
        btnSearch.setBounds(653, 143, 117, 29);
        getContentPane().add(btnSearch);
        btnSearch.setForeground(new Color(102, 0, 0));
        btnSearch.setBackground(new Color(102, 0, 0));
        
        JLabel lblNewLabel_1 = new JLabel("<html>Products:<br> </br>Electronics: Tablet, Computer, Phone<br>\n</br>Clothing: Sweatshirt, Jeans, Shirt<br>\n</br>Toys: Dolls, Trucks, LEGOs<br>\n</br>Books: Scifi, Fiction, Nonfiction</html>");
        lblNewLabel_1.setBounds(462, 290, 345, 214);
        getContentPane().add(lblNewLabel_1);
        lblNewLabel_1.setBackground(new Color(204, 102, 102));
        lblNewLabel_1.setOpaque(true);
        
        JLabel lblNewLabel_2 = new JLabel("WELCOME TO AMAZON ");
        lblNewLabel_2.setBounds(0, 35, 817, 16);
        getContentPane().add(lblNewLabel_2);
        lblNewLabel_2.setHorizontalAlignment(JLabel.CENTER);
        lblNewLabel_2.setOpaque(true);
        lblNewLabel_2.setBackground(new Color(102, 0, 0));
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        
        JLabel lblSearch = new JLabel("SEARCH: ");
        lblSearch.setBounds(700, 61, 70, 16);
        lblSearch.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(lblSearch);
        lblSearch.setOpaque(true);
        lblSearch.setBackground(new Color(204, 153, 153));
        
        JLabel lblBestSeller = new JLabel("#2 Best Seller right now");
        lblBestSeller.setOpaque(true);
        lblBestSeller.setBackground(new Color(204, 153, 204));
        lblBestSeller.setBounds(232, 290, 201, 214);
        getContentPane().add(lblBestSeller);
        btnSearch.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Search.searchAlgo(txtSearchForA.getText()); 
        	}
        });
		
		
	}
}
