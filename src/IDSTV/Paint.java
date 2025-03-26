package IDSTV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Paint {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint window = new Paint();
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
	public Paint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1076, 744);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel Instrumentos = new JPanel();
		Instrumentos.setBackground(new Color(240, 240, 240));
		panel.add(Instrumentos, BorderLayout.NORTH);
		Instrumentos.setLayout(new GridLayout(0, 1, 0, 10));
		
		JLabel lblNewLabel = new JLabel("Colors custom:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Instrumentos.add(lblNewLabel);
		
		JButton btnNewButton_11 = new JButton("Set background");
		btnNewButton_11.setBackground(new Color(253, 245, 230));
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		Instrumentos.add(btnNewButton_11);
		
		textField = new JTextField();
		Instrumentos.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Size:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Instrumentos.add(lblNewLabel_1);
		
		JPanel Colores = new JPanel();
		Colores.setBackground(SystemColor.control);
		panel.add(Colores, BorderLayout.SOUTH);
		Colores.setLayout(new GridLayout(6, 1, 5, 15));
		
		JButton btnNewButton = new JButton("            ");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		Colores.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		Colores.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBackground(Color.GRAY);
		Colores.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBackground(Color.DARK_GRAY);
		Colores.add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(210, 105, 30));
		Colores.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(Color.RED);
		Colores.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(Color.PINK);
		Colores.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(Color.ORANGE);
		Colores.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(Color.YELLOW);
		Colores.add(btnNewButton_6);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBackground(Color.MAGENTA);
		Colores.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(Color.GREEN);
		Colores.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBackground(Color.CYAN);
		Colores.add(btnNewButton_10);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.control);
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(5, 0));
		
		textField_1 = new JTextField();
		panel_2.add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);
		
		JButton btnNewButton_13 = new JButton("+");
		btnNewButton_13.setBackground(new Color(253, 245, 230));
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_2.add(btnNewButton_13, BorderLayout.EAST);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.setBackground(new Color(253, 245, 230));
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_2.add(btnNewButton_12, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(10, 10));
		
		JButton btnNewButton_14 = new JButton("Brush");
		btnNewButton_14.setBackground(new Color(253, 245, 230));
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_3.add(btnNewButton_14, BorderLayout.WEST);
		
		JButton btnNewButton_15 = new JButton("Erase");
		btnNewButton_15.setBackground(new Color(253, 245, 230));
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_3.add(btnNewButton_15, BorderLayout.EAST);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.control);
		FlowLayout flowLayout = (FlowLayout) panel_5.getLayout();
		flowLayout.setVgap(50);
		panel_3.add(panel_5, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.control);
		FlowLayout flowLayout_1 = (FlowLayout) panel_6.getLayout();
		flowLayout_1.setHgap(0);
		flowLayout_1.setVgap(50);
		panel_3.add(panel_6, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.control);
		panel_1.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new GridLayout(0, 1, 0, 20));
		
		JButton btnNewButton_16 = new JButton("Clean");
		btnNewButton_16.setBackground(new Color(152, 251, 152));
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_4.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("Save");
		btnNewButton_17.setBackground(new Color(152, 251, 152));
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_4.add(btnNewButton_17);
		
		JPanel Lienzo = new JPanel();
		Lienzo.setBackground(new Color(0, 0, 0));
		 Lienzo.setBorder(new EmptyBorder(5, 5, 5, 5));
		   // Lienzo.setBorder((Border) Lienzo);
		    frame.getContentPane().add(Lienzo, BorderLayout.CENTER);
		    Lienzo.setLayout(new BorderLayout(0, 0));
		    
		    JPanel panel_7 = new JPanel();
		    panel_7.setBackground(new Color(255, 255, 255));
		    Lienzo.add(panel_7, BorderLayout.CENTER);
	}

}
