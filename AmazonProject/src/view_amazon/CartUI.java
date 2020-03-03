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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control_general.Cart;
import control_general.Product;
import control_products.Books;
import control_products.Electronics;

import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JPopupMenu;
import javax.swing.JList;
import javax.swing.JTextArea;
//checkout ui
public class CartUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField addedTotal;


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
	public CartUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

        Container content = getContentPane();
        content.setBackground(new Color(204, 204, 204));
        
        JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane, BorderLayout.CENTER);
        
        
        JLabel lblProductSummary = new JLabel("Products you bought: ");
        lblProductSummary.setBackground(new Color(204, 153, 153));
        lblProductSummary.setToolTipText("");
        lblProductSummary.setBounds(16, 36, 234, 35);
        lblProductSummary.setOpaque(true);
        layeredPane.add(lblProductSummary);
        
        JLabel lblNewLabel = new JLabel("MY CART\n");
        lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBackground(new Color(102, 0, 0));
        lblNewLabel.setBounds(6, 6, 438, 16);
        lblNewLabel.setOpaque(true); 
        layeredPane.add(lblNewLabel);
        
        JLabel lblTotalPrice = new JLabel("Total Price: ");
        lblTotalPrice.setBackground(new Color(153, 102, 102));
        lblTotalPrice.setBounds(257, 190, 171, 16);
        layeredPane.add(lblTotalPrice);
        lblTotalPrice.setOpaque(true);
        
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBounds(26, 82, 221, 152);
        
        ArrayList<Product> cartItem = Cart.getCartItems();
        
        int listSize = cartItem.size();
        double totalPrice=0;
        for(int i = 0; i <listSize; i++)
        {
        	Product currentProduct = (Product) cartItem.get(i);
        	textArea.append(currentProduct.getPhotoName());
        	textArea.append("\t");
        	double productPrice = currentProduct.getPrice();
        	totalPrice +=productPrice;

        	textArea.append(String.valueOf(productPrice));
        	textArea.append("\n");

        }
        layeredPane.add(textArea);
        
        addedTotal = new JTextField(String.valueOf(totalPrice));
        addedTotal.setEditable(false);
        addedTotal.setBounds(257, 217, 167, 20);
        layeredPane.add(addedTotal);
        addedTotal.setColumns(10);
        
        JButton btnCheckout = new JButton("CHECKOUT");
        btnCheckout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "Thanks for shopping with us");
        		textArea.setText(null);
        		addedTotal.setText(null);
        	}
        });
        btnCheckout.setBounds(6, 243, 438, 29);
        layeredPane.add(btnCheckout);

       
	}
}
