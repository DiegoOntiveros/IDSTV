package IDSTV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.SystemColor;

public class Keyboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Keyboard window = new Keyboard();
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
	public Keyboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1047, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel_2, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 204, 0));
		frame.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.SOUTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 204, 51));
		panel_4.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(0, 11, 5, 5));
		
		JLabel lblNewLabel_4 = new JLabel("              ~");
		lblNewLabel_4.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("                1");
		lblNewLabel_5.setBackground(new Color(127, 255, 0));
		panel_6.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("                2");
		lblNewLabel_6.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("                3");
		lblNewLabel_7.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_7);
		
		JLabel lblNewLabel_4_10 = new JLabel("4");
		lblNewLabel_4_10.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_4_10);
		
		JLabel lblNewLabel_5_9 = new JLabel("5");
		lblNewLabel_5_9.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_5_9);
		
		JLabel lblNewLabel_6_9 = new JLabel("6");
		lblNewLabel_6_9.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_6_9);
		
		JLabel lblNewLabel_7_9 = new JLabel("7");
		lblNewLabel_7_9.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_7_9);
		
		JLabel lblNewLabel_3_9 = new JLabel("8");
		lblNewLabel_3_9.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_4_1_9 = new JLabel("9");
		lblNewLabel_4_1_9.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_4_1_9);
		
		JLabel lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4_2 = new JLabel("q");
		lblNewLabel_4_2.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5_1 = new JLabel("w");
		lblNewLabel_5_1.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("e");
		lblNewLabel_6_1.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("r");
		lblNewLabel_7_1.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("t");
		lblNewLabel_3_1.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("y");
		lblNewLabel_4_1_1.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_3 = new JLabel("u");
		lblNewLabel_4_3.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_5_2 = new JLabel("i");
		lblNewLabel_5_2.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("o");
		lblNewLabel_6_2.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("p");
		lblNewLabel_7_2.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("{");
		lblNewLabel_3_2.setBackground(SystemColor.activeCaption);
		panel_6.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_4 = new JLabel("a");
		panel_6.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_5_3 = new JLabel("s");
		panel_6.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_6_3 = new JLabel("d");
		panel_6.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_7_3 = new JLabel("f");
		panel_6.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("g");
		panel_6.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("h");
		panel_6.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_4_5 = new JLabel("j");
		panel_6.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_5_4 = new JLabel("k");
		panel_6.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_6_4 = new JLabel("l");
		panel_6.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_7_4 = new JLabel("}");
		panel_6.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("z");
		panel_6.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("x");
		panel_6.add(lblNewLabel_4_1_4);
		
		JLabel lblNewLabel_4_6 = new JLabel("c");
		panel_6.add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_5_5 = new JLabel("v");
		panel_6.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_6_5 = new JLabel("b");
		panel_6.add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_7_5 = new JLabel("n");
		panel_6.add(lblNewLabel_7_5);
		
		JLabel lblNewLabel_3_5 = new JLabel("m");
		panel_6.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_7_6 = new JLabel("New label");
		panel_6.add(lblNewLabel_7_6);
		
		JLabel lblNewLabel_3_6 = new JLabel("New label");
		panel_6.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_4_9 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_9);
		
		JLabel lblNewLabel_5_8 = new JLabel("New label");
		panel_6.add(lblNewLabel_5_8);
		
		JLabel lblNewLabel_6_8 = new JLabel("New label");
		panel_6.add(lblNewLabel_6_8);
		
		JLabel lblNewLabel_7_8 = new JLabel("New label");
		panel_6.add(lblNewLabel_7_8);
		
		JLabel lblNewLabel_3_8 = new JLabel("New label");
		panel_6.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_4_1_8 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_1_8);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_7_3_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_7_3_1);
		
		JLabel lblNewLabel_6_4_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_6_4_1);
		
		JLabel lblNewLabel_5_5_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_5_5_1);
		
		JLabel lblNewLabel_4_1_5_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_1_5_1);
		
		JLabel lblNewLabel_7_8_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_7_8_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_6_5_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_6_5_1);
		
		JLabel lblNewLabel_6_6_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_6_6_1);
		
		JLabel lblNewLabel_4_1_2_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_1_2_1);
		
		JLabel lblNewLabel_3_8_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_3_8_1);
		
		JLabel lblNewLabel_4_9_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_9_1);
		
		JLabel lblNewLabel_4_1_8_1 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_1_8_1);
		
		JLabel lblNewLabel_7_7 = new JLabel("New label");
		panel_6.add(lblNewLabel_7_7);
		
		JLabel lblNewLabel_3_7 = new JLabel("New label");
		panel_6.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("New label");
		panel_6.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_7_2_2 = new JLabel("New label");
		panel_6.add(lblNewLabel_7_2_2);
		
		JLabel lblNewLabel_7_3_2 = new JLabel("New label");
		panel_6.add(lblNewLabel_7_3_2);
		
		JLabel lblNewLabel_6_4_2 = new JLabel("New label");
		panel_6.add(lblNewLabel_6_4_2);
		
		JLabel lblNewLabel_5_6_2 = new JLabel("New label");
		panel_6.add(lblNewLabel_5_6_2);
		
		JLabel lblNewLabel_5_5_2 = new JLabel("New label");
		panel_6.add(lblNewLabel_5_5_2);
		
		JLabel lblNewLabel_4_1_2_2 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_1_2_2);
		
		JLabel lblNewLabel_4_1_3_2 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_1_3_2);
		
		JLabel lblNewLabel_4_4_2 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_4_2);
		
		JLabel lblNewLabel_3_12 = new JLabel("New label");
		panel_6.add(lblNewLabel_3_12);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("New label");
		panel_6.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_7_2_3 = new JLabel("New label");
		panel_6.add(lblNewLabel_7_2_3);
		
		JLabel lblNewLabel_5_6_3 = new JLabel("New label");
		panel_6.add(lblNewLabel_5_6_3);
		
		JLabel lblNewLabel_6_9_3 = new JLabel("New label");
		panel_6.add(lblNewLabel_6_9_3);
		
		JLabel lblNewLabel_4_2_3 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_2_3);
		
		JLabel lblNewLabel_4_1_1_3 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_1_1_3);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("New label");
		panel_6.add(lblNewLabel_3_2_3);
		
		JLabel lblNewLabel_4_1_2_3 = new JLabel("New label");
		panel_6.add(lblNewLabel_4_1_2_3);
		
		JLabel lblNewLabel_3_8_3 = new JLabel("New label");
		panel_6.add(lblNewLabel_3_8_3);
		
		JLabel lblNewLabel_6_7_3 = new JLabel("New label");
		panel_6.add(lblNewLabel_6_7_3);
	}

}
