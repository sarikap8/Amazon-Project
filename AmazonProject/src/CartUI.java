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
		setBounds(100, 100, 450, 300);

        Container content = getContentPane();
        content.setBackground(new Color(153, 204, 255));
        
        JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane, BorderLayout.CENTER);
        
        JButton btnCheckout = new JButton("CHECKOUT");
        btnCheckout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "Thanks for shopping with us");
        	}
        });
        btnCheckout.setBounds(6, 243, 438, 29);
        layeredPane.add(btnCheckout);
        
        JLabel lblProductSummary = new JLabel("Products you bought: ");
        lblProductSummary.setToolTipText("");
        lblProductSummary.setBounds(6, 6, 249, 229);
        layeredPane.add(lblProductSummary);
        
        JLabel lblPrices = new JLabel("Prices");
        lblPrices.setForeground(Color.BLACK);
        layeredPane.setLayer(lblPrices, 0);
        lblPrices.setBackground(Color.WHITE);
        lblPrices.setBounds(260, 6, 184, 229);
        layeredPane.add(lblPrices);
        
       
	}
}
