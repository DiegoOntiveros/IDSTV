package IDSTV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.foreign.AddressLayout;

import javax.swing.JButton;
import java.awt.Font;

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
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 0, 0));
		panel.add(panel_7, BorderLayout.SOUTH);
		
		JPanel panel_11 = new JPanel();
		panel.add(panel_11, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_11.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(SystemColor.desktop);
		panel_1.add(panel_8, BorderLayout.NORTH);
		
		JPanel panel_13 = new JPanel();
		panel_1.add(panel_13, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_13.add(lblNewLabel);
		
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
		panel_5.setBackground(SystemColor.scrollbar);
		panel_4.add(panel_5, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("Space");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_5.add(lblNewLabel_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 204, 51));
		panel_4.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(0, 11, 5, 5));
		
		JLabel lblNewLabel_4 = new JLabel("              ~");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(222, 184, 135));
		panel_6.add(lblNewLabel_4);
		
		JLabel numero_1 = new JLabel("               1");
		numero_1.setForeground(new Color(0, 0, 0));
		numero_1.setOpaque(true);
		numero_1.setBackground(new Color(222, 184, 135));
		panel_6.add(numero_1);
		
		JLabel numero_2 = new JLabel("               2");
		numero_2.setBackground(new Color(222, 184, 135));
		numero_2.setOpaque(true);
		panel_6.add(numero_2);
		
		JLabel numero_3 = new JLabel("                3");
		numero_3.setOpaque(true);
		numero_3.setBackground(new Color(222, 184, 135));
		panel_6.add(numero_3);
		
		JLabel numero_4 = new JLabel("                4\r\n");
		numero_4.setOpaque(true);
		numero_4.setBackground(new Color(222, 184, 135));
		panel_6.add(numero_4);
		
		JLabel lblNewLabel_5_9 = new JLabel("                5");
		lblNewLabel_5_9.setOpaque(true);
		lblNewLabel_5_9.setBackground(new Color(222, 184, 135));
		panel_6.add(lblNewLabel_5_9);
		
		JLabel lblNewLabel_6_9 = new JLabel("                6");
		lblNewLabel_6_9.setOpaque(true);
		lblNewLabel_6_9.setBackground(new Color(222, 184, 135));
		panel_6.add(lblNewLabel_6_9);
		
		JLabel lblNewLabel_7_9 = new JLabel("                7");
		lblNewLabel_7_9.setOpaque(true);
		lblNewLabel_7_9.setBackground(new Color(222, 184, 135));
		panel_6.add(lblNewLabel_7_9);
		
		JLabel lblNewLabel_3_9 = new JLabel("                8");
		lblNewLabel_3_9.setBackground(new Color(222, 184, 135));
		lblNewLabel_3_9.setOpaque(true);
		panel_6.add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_4_1_9 = new JLabel("                9");
		lblNewLabel_4_1_9.setOpaque(true);
		lblNewLabel_4_1_9.setBackground(new Color(222, 184, 135));
		panel_6.add(lblNewLabel_4_1_9);
		
		JLabel lblNewLabel_3 = new JLabel("                0");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(222, 184, 135));
		panel_6.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4_2 = new JLabel("               q");
		lblNewLabel_4_2.setOpaque(true);
		lblNewLabel_4_2.setBackground(SystemColor.control);
		KeyListener  tecla = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyChar() == 'q') {
		            lblNewLabel_4_2.setBackground(SystemColor.control);
		        }	
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyChar() == 'q') {
		            lblNewLabel_4_2.setBackground(SystemColor.LIGHT_GRAY);
		        }
			}
		};
		lblNewLabel_4_2.addKeyListener(tecla);
		lblNewLabel_4_2.setFocusable(true);
		panel_6.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5_1 = new JLabel("               w");
		lblNewLabel_5_1.setOpaque(true);
		lblNewLabel_5_1.setBackground(SystemColor.control);
		
		panel_6.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("               e");
		lblNewLabel_6_1.setOpaque(true);
		lblNewLabel_6_1.setBackground(SystemColor.control);
		panel_6.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("               r");
		lblNewLabel_7_1.setOpaque(true);
		lblNewLabel_7_1.setBackground(SystemColor.control);
		panel_6.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("               t");
		lblNewLabel_3_1.setOpaque(true);
		lblNewLabel_3_1.setBackground(SystemColor.control);
		panel_6.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("              y");
		lblNewLabel_4_1_1.setOpaque(true);
		lblNewLabel_4_1_1.setBackground(SystemColor.control);
		panel_6.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_3 = new JLabel("               u");
		lblNewLabel_4_3.setOpaque(true);
		lblNewLabel_4_3.setBackground(SystemColor.control);
		panel_6.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_5_2 = new JLabel("               i");
		lblNewLabel_5_2.setOpaque(true);
		lblNewLabel_5_2.setBackground(SystemColor.control);
		panel_6.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("               o");
		lblNewLabel_6_2.setOpaque(true);
		lblNewLabel_6_2.setBackground(SystemColor.control);
		panel_6.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("               p");
		lblNewLabel_7_2.setOpaque(true);
		lblNewLabel_7_2.setBackground(SystemColor.control);
		panel_6.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("               {");
		lblNewLabel_3_2.setOpaque(true);
		lblNewLabel_3_2.setBackground(new Color(255, 182, 193));
		panel_6.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_4 = new JLabel("               a");
		lblNewLabel_4_4.setBackground(SystemColor.control);
		lblNewLabel_4_4.setOpaque(true);
		panel_6.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_5_3 = new JLabel("               s");
		lblNewLabel_5_3.setBackground(SystemColor.control);
		lblNewLabel_5_3.setOpaque(true);
		panel_6.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_6_3 = new JLabel("               d");
		lblNewLabel_6_3.setBackground(SystemColor.control);
		lblNewLabel_6_3.setOpaque(true);
		panel_6.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_7_3 = new JLabel("               f");
		lblNewLabel_7_3.setBackground(SystemColor.control);
		lblNewLabel_7_3.setOpaque(true);
		panel_6.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("               g");
		lblNewLabel_3_3.setBackground(SystemColor.control);
		lblNewLabel_3_3.setOpaque(true);
		panel_6.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("               h");
		lblNewLabel_4_1_3.setBackground(SystemColor.control);
		lblNewLabel_4_1_3.setOpaque(true);
		panel_6.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_4_5 = new JLabel("               j");
		lblNewLabel_4_5.setBackground(SystemColor.control);
		lblNewLabel_4_5.setOpaque(true);
		panel_6.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_5_4 = new JLabel("               k");
		lblNewLabel_5_4.setBackground(SystemColor.control);
		lblNewLabel_5_4.setOpaque(true);
		panel_6.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_6_4 = new JLabel("               l");
		lblNewLabel_6_4.setBackground(SystemColor.control);
		lblNewLabel_6_4.setOpaque(true);
		panel_6.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_7_4 = new JLabel("               }");
		lblNewLabel_7_4.setBackground(new Color(255, 182, 193));
		lblNewLabel_7_4.setOpaque(true);
		panel_6.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("               z");
		lblNewLabel_3_4.setBackground(SystemColor.control);
		lblNewLabel_3_4.setOpaque(true);
		panel_6.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("               x");
		lblNewLabel_4_1_4.setBackground(SystemColor.control);
		lblNewLabel_4_1_4.setOpaque(true);
		panel_6.add(lblNewLabel_4_1_4);
		
		JLabel lblNewLabel_4_6 = new JLabel("               c");
		lblNewLabel_4_6.setBackground(SystemColor.control);
		lblNewLabel_4_6.setOpaque(true);
		panel_6.add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_5_5 = new JLabel("               v");
		lblNewLabel_5_5.setBackground(SystemColor.control);
		lblNewLabel_5_5.setOpaque(true);
		panel_6.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_6_5 = new JLabel("               b");
		lblNewLabel_6_5.setBackground(SystemColor.control);
		lblNewLabel_6_5.setOpaque(true);
		panel_6.add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_7_5 = new JLabel("               n");
		lblNewLabel_7_5.setBackground(SystemColor.control);
		lblNewLabel_7_5.setOpaque(true);
		panel_6.add(lblNewLabel_7_5);
		
		JLabel lblNewLabel_3_5 = new JLabel("               m");
		lblNewLabel_3_5.setBackground(SystemColor.control);
		lblNewLabel_3_5.setOpaque(true);
		panel_6.add(lblNewLabel_3_5);
	}

}
