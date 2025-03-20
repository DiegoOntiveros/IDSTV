package IDSTV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Memorama {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memorama window = new Memorama();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Memorama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 801, 752);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#FFB6C1"));
		frame.getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		//panel.setBorder(new LineBorder(Color.decode("#FFE4E1"), 6));

		
		JLabel lblNewLabel_1 = new JLabel("Aciertos:");
		lblNewLabel_1.setBackground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setBorder(new LineBorder(Color.decode("#FFE4E1"), 6));

		
		
		JLabel lblNewLabel_3 = new JLabel("Tiempo: 0\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setBorder(new LineBorder(Color.decode("#FFE4E1"), 6));

		
		JLabel lblNewLabel_4 = new JLabel("Movimientos: 0");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setBorder(new LineBorder(Color.decode("#FFE4E1"), 6));

		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#FFB6C1"));
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setBorder(new LineBorder(Color.decode("#FFE4E1"), 6));

		
		JLabel lblNewLabel = new JLabel("Memorama 3000");
		lblNewLabel.setFont(new Font("Magneto", Font.ITALIC, 25));
		panel_2.add(lblNewLabel); 
		//lblNewLabel.setBorder(new LineBorder(Color.decode("#d7dbdb"), 6));

		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.decode("#FFFAF0"));
		panel_1.add(panel_3, BorderLayout.CENTER);
		
		panel_3.setLayout(new GridLayout(4, 3, 10, 7));
		panel_3.setBorder(new LineBorder(Color.decode("#FFFAF0"), 10));
				
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\DYNABOOK\\Favorites\\Desktop\\IDSTV\\src\\IDSTV\\pngegg.png"));
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_12 = new JButton("New button");
		panel_3.add(btnNewButton_12);
		
		JButton btnNewButton_9 = new JButton("New button");
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_6 = new JButton("New button");
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton = new JButton("New button");
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("New button");
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("New button");
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_11 = new JButton("New button");
		panel_3.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("New button");
		panel_3.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("New button");
		panel_3.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("New button");
		panel_3.add(btnNewButton_15);
	}

}
