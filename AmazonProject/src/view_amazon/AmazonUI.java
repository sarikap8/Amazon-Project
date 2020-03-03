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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

import control_general.AmazonStorage;
import control_general.Search;

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
	public String typeClicked;
	public static JFrame curr = new JFrame();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AmazonUI frame = new AmazonUI();
					frame.setVisible(true);
					curr.setVisible(false);
					curr = frame;
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
		curr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        		curr.setVisible(false);
				curr = frame;
        	}
        });
        menuBar.add(mntmHome);
        
        JMenu menuElectronics = new JMenu("Electronics");

        menuBar.add(menuElectronics);
        
        JMenuItem menuItemComputers = new JMenuItem("Computers");
        menuElectronics.add(menuItemComputers);
        menuItemComputers.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ElectronicsUI frame = new ElectronicsUI("computers"); 
        		frame.setVisible(true);
        		curr.setVisible(false);
				curr = frame;
        	}
        });
        JMenuItem menuItemTablets = new JMenuItem("Tablets");
        menuItemTablets.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ElectronicsUI frame = new ElectronicsUI("tablets"); 
        		frame.setVisible(true);
        		curr.setVisible(false);
				curr = frame;
        	}
        });
        menuElectronics.add(menuItemTablets);
        
        JMenuItem menuItemPhones = new JMenuItem("Phones");
        menuItemPhones.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ElectronicsUI frame = new ElectronicsUI("phones"); 
        		frame.setVisible(true);
        		curr.setVisible(false);
				curr = frame;
        	}
        });
        menuElectronics.add(menuItemPhones);
        
        JMenu mnBooks = new JMenu("Books");
        menuBar.add(mnBooks);
        
        JMenuItem menuItemNonfiction = new JMenuItem("Nonfiction");
        menuItemNonfiction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		BooksUI frame = new BooksUI("nonfiction"); 
        		frame.setVisible(true);
        		curr.setVisible(false);
				curr = frame;
        	}
        });
        mnBooks.add(menuItemNonfiction);
        
        JMenuItem mntmScifi = new JMenuItem("Scifi");
        mntmScifi.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		BooksUI frame = new BooksUI("scifi"); 
        		frame.setVisible(true);
        		curr.setVisible(false);
				curr = frame;
        	}
        });
        mnBooks.add(mntmScifi);
        
        JMenuItem menuItemFiction = new JMenuItem("Fiction");
        menuItemFiction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		BooksUI frame = new BooksUI("fiction"); 
        		frame.setVisible(true);
        		curr.setVisible(false);
				curr = frame;
        	}
        });
        mnBooks.add(menuItemFiction);
        
        JMenu mnClothing = new JMenu("Clothing");
        menuBar.add(mnClothing);
        
        JMenuItem menuItemSweatshirts = new JMenuItem("Sweaters");
        menuItemSweatshirts.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ClothingUI frame = new ClothingUI("sweaters"); 
        		frame.setVisible(true);
        		curr.setVisible(false);
				curr = frame;
        	}
        });
        mnClothing.add(menuItemSweatshirts);
        
        JMenuItem menuItemShirts = new JMenuItem("Shirts");
        menuItemShirts.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ClothingUI frame = new ClothingUI("shirts"); 
        		frame.setVisible(true);
        		curr.setVisible(false);
				curr = frame;
        	}
        });
        mnClothing.add(menuItemShirts);
        
        JMenuItem menuItemJeans = new JMenuItem("Jeans");
        menuItemJeans.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ClothingUI frame = new ClothingUI("jeans"); 
        		frame.setVisible(true);
        		curr.setVisible(false);
				curr = frame;
        	}
        });
        mnClothing.add(menuItemJeans);
        
        JMenu mnToys = new JMenu("Toys");
        menuBar.add(mnToys);
        
        JMenuItem menuItemDolls = new JMenuItem("Dolls");
        menuItemDolls.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ToysUI frame = new ToysUI("dolls"); 
        		frame.setVisible(true);
        		curr.setVisible(false);
				curr = frame;
        	}
        });
        mnToys.add(menuItemDolls);
        
        JMenuItem menuItemTrucks = new JMenuItem("Trucks");
        menuItemTrucks.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ToysUI frame = new ToysUI("trucks"); 
        		frame.setVisible(true);
        		curr.setVisible(false);
				curr = frame;
        	}
        });
        mnToys.add(menuItemTrucks);
        
        JMenuItem menuItemLegos = new JMenuItem("LEGOs");
        menuItemLegos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ToysUI frame = new ToysUI("legos"); 
        		frame.setVisible(true);
        		curr.setVisible(false);
				curr = frame;
        	}
        });
        mnToys.add(menuItemLegos);
        
        JMenuItem mntmMyCart = new JMenuItem("My Cart ");
        mntmMyCart.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CartUI frame = new CartUI(); 
        		frame.setVisible(true);
        		//curr.setVisible(false);
				//curr = frame;
        	}
        });
        menuBar.add(mntmMyCart);
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 831, 551);
        getContentPane().add(layeredPane);
        
        txtSearchForA = new JTextField();
        txtSearchForA.setBounds(502, 190, 259, 32);
        layeredPane.add(txtSearchForA);
        txtSearchForA.setText("Type Product Name here: List Below");
        txtSearchForA.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("<html> <p>#1 Best Seller right now: LEGO Ultimate Kit</p>");
        lblNewLabel.setBounds(29, 277, 189, 214);
        layeredPane.add(lblNewLabel);
        lblNewLabel.setOpaque(true);
        lblNewLabel.setBackground(new Color(153, 102, 102));
        
        JButton btnSearch = new JButton("Go!");
        btnSearch.setBounds(582, 238, 117, 29);
        layeredPane.add(btnSearch);
        btnSearch.setForeground(new Color(255, 255, 255));
        btnSearch.setBackground(new Color(102, 0, 0));
        
        JLabel lblNewLabel_1 = new JLabel("<html>Products:<br> </br>Electronics: Tablet, Computer, Phone<br>\n</br>Clothing: Sweatshirt, Jeans, Shirt<br>\n</br>Toys: Dolls, Trucks, LEGOs<br>\n</br>Books: Scifi, Fiction, Nonfiction</html>");
        lblNewLabel_1.setBounds(449, 277, 345, 214);
        layeredPane.add(lblNewLabel_1);
        lblNewLabel_1.setBackground(new Color(204, 102, 102));
        lblNewLabel_1.setOpaque(true);
        
        JLabel lblNewLabel_2 = new JLabel("WELCOME TO AMAZON ");
        lblNewLabel_2.setBounds(0, 0, 817, 16);
        layeredPane.add(lblNewLabel_2);
        lblNewLabel_2.setHorizontalAlignment(JLabel.CENTER);
        lblNewLabel_2.setOpaque(true);
        lblNewLabel_2.setBackground(new Color(102, 0, 0));
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        
        JLabel lblBestSeller = new JLabel("<html><p>#2 Best Seller right now: Limited Edition Rag Doll</p>");
        lblBestSeller.setBounds(238, 277, 201, 214);
        layeredPane.add(lblBestSeller);
        lblBestSeller.setOpaque(true);
        lblBestSeller.setBackground(new Color(204, 153, 204));
        
        JLabel lblSearch = new JLabel("SEARCH: ");
        lblSearch.setBounds(608, 164, 70, 16);
        layeredPane.add(lblSearch);
        lblSearch.setHorizontalAlignment(JLabel.CENTER);
        lblSearch.setOpaque(true);
        lblSearch.setBackground(new Color(204, 153, 153));
        
        JLabel lblBackground = new JLabel("New label");
        layeredPane.setLayer(lblBackground, -1);
        lblBackground.setBounds(0, 0, 831, 551);
        layeredPane.add(lblBackground);
        lblBackground.setIcon(new ImageIcon("src/pics/backdropfinal.jpg"));
        btnSearch.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Search.searchAlgo(txtSearchForA.getText()); 
        	}
        });
		
		
	}
}
