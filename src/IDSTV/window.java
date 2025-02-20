package IDSTV;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.security.PrivateKey;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class window extends JFrame {

	public window() {
		
		
this.setVisible(true);
		
		this.setTitle("textos");
		this.setSize(500, 500);
		
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	 this.setResizable(true);
	 this.setMaximumSize(new Dimension (5000,200));
	 this.setMinimumSize(new Dimension(5000,300));
		 this.setLocationRelativeTo(null);
		 


	}
}