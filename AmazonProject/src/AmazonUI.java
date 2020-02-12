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

/** Menu<br>
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
        java.awt.Image image = new ImageIcon("APCompSci.jpeg").getImage();
        this.setIconImage(new ImageIcon("./AP_Exam/chandu.txt").getImage());
        
        // Content Panel to add Label and Image
        //https://docs.oracle.com/javase/tutorial/uiswing/components/rootpane.html
        Container content = getContentPane();
        content.setBackground(new Color(153, 204, 255));
        
        JMenuBar menuBar = new JMenuBar();
        getContentPane().add(menuBar, BorderLayout.NORTH);
        
        JMenuItem menuItemElectronics = new JMenuItem("Electronics");
        menuBar.add(menuItemElectronics);
        
        JMenuItem menuItemToys = new JMenuItem("Toys");
        menuBar.add(menuItemToys);
        
        JMenuItem menuItemBooks = new JMenuItem("Books");
        menuBar.add(menuItemBooks);
        
        JMenuItem menuItemClothing = new JMenuItem("Clothing");
        menuBar.add(menuItemClothing);
        
        JMenuItem mntmMyCart = new JMenuItem("My Cart ");
        menuBar.add(mntmMyCart);
		
		
	}
	
}
