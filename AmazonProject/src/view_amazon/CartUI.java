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
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JPopupMenu;
//checkout ui
public class CartUI extends JFrame {

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
	public CartUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 551);

        Container content = getContentPane();
        content.setBackground(new Color(204, 204, 204));
        
        JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane, BorderLayout.CENTER);
        
        JButton btnCheckout = new JButton("CHECKOUT");
        btnCheckout.setForeground(new Color(255, 255, 255));
        btnCheckout.setBackground(new Color(102, 0, 0));
        btnCheckout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "Thanks for shopping with us");
        	}
        });
        btnCheckout.setBounds(159, 456, 438, 29);
        layeredPane.add(btnCheckout);
        
        JLabel lblProductSummary = new JLabel("Products you bought: ");
        lblProductSummary.setBackground(new Color(204, 153, 153));
        lblProductSummary.setToolTipText("");
        lblProductSummary.setBounds(16, 36, 284, 389);
        lblProductSummary.setOpaque(true);
        layeredPane.add(lblProductSummary);
        
        JLabel lblPrices = new JLabel("Prices");
        lblPrices.setLabelFor(lblPrices);
        lblPrices.setForeground(new Color(0, 0, 0));
        layeredPane.setLayer(lblPrices, 0);
        lblPrices.setBackground(new Color(204, 102, 102));
        lblPrices.setBounds(333, 34, 448, 244);
        lblPrices.setOpaque(true);
        layeredPane.add(lblPrices);
        
        JLabel lblNewLabel = new JLabel("MY CART\n");
        lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBackground(new Color(102, 0, 0));
        lblNewLabel.setBounds(6, 6, 775, 16);
        lblNewLabel.setOpaque(true); 
        layeredPane.add(lblNewLabel);
        
        JLabel lblTotalPrice = new JLabel("Total Price: ");
        lblTotalPrice.setBackground(new Color(153, 102, 102));
        lblTotalPrice.setBounds(333, 285, 448, 140);
        layeredPane.add(lblTotalPrice);
        lblTotalPrice.setOpaque(true);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("src/pics/test2.jpg"));
        lblNewLabel_1.setBounds(607, 438, 153, 65);
        layeredPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon("src/pics/test.jpg"));
        lblNewLabel_2.setBounds(6, 435, 143, 68);
        layeredPane.add(lblNewLabel_2);
        
       
	}
}
