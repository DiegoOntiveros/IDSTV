package IDSTV;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Regristo_de_datos {

		// TODO Auto-generated constructor stub
		
		private JFrame frame2;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						porfaquefuncione window = new porfaquefuncione();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 765, 780);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 255, 64));
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			
			JLabel lblNewLabel = new JLabel("Regristo de usuario:");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
			panel.add(lblNewLabel, BorderLayout.NORTH);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(Color.GREEN);
			panel.add(panel_1, BorderLayout.CENTER);
			panel_1.setLayout(new GridLayout(2, 2, 15, 15));
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(Color.MAGENTA);
			panel_1.add(panel_2);
			panel_2.setLayout(new BorderLayout(0, 0));
			
			JLabel lblNewLabel_1 = new JLabel("Datos generales:");
			lblNewLabel_1.setForeground(Color.BLACK);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
			panel_2.add(lblNewLabel_1, BorderLayout.NORTH);
			
			JPanel panel_6 = new JPanel();
			panel_2.add(panel_6, BorderLayout.CENTER);
			panel_6.setLayout(new BorderLayout(0, 0));
			
			JPanel panel_8 = new JPanel();
			panel_8.setBackground(Color.ORANGE);
			panel_6.add(panel_8, BorderLayout.WEST);
			panel_8.setLayout(new GridLayout(3, 3, 0, 0));
			
			JPanel panel_9 = new JPanel();
			panel_9.setBackground(Color.MAGENTA);
			panel_6.add(panel_9, BorderLayout.CENTER);
			GridBagLayout gbl_panel_9 = new GridBagLayout();
			gbl_panel_9.columnWidths = new int[]{145, 145, 145, 145, 0};
			gbl_panel_9.rowHeights = new int[]{27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 0, 27, 0};
			gbl_panel_9.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_9.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel_9.setLayout(gbl_panel_9);
			
			JLabel lblNewLabel_7 = new JLabel("      Nombre:");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
			GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
			gbc_lblNewLabel_7.fill = GridBagConstraints.BOTH;
			gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_7.gridx = 1;
			gbc_lblNewLabel_7.gridy = 1;
			panel_9.add(lblNewLabel_7, gbc_lblNewLabel_7);
			
			textField_1 = new JTextField();
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.fill = GridBagConstraints.BOTH;
			gbc_textField_1.insets = new Insets(0, 0, 5, 5);
			gbc_textField_1.gridx = 2;
			gbc_textField_1.gridy = 1;
			panel_9.add(textField_1, gbc_textField_1);
			textField_1.setColumns(10);
			
			JLabel lblNewLabel_8 = new JLabel("Apellido paterno:");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
			GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
			gbc_lblNewLabel_8.fill = GridBagConstraints.BOTH;
			gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_8.gridx = 1;
			gbc_lblNewLabel_8.gridy = 3;
			panel_9.add(lblNewLabel_8, gbc_lblNewLabel_8);
			
			textField_2 = new JTextField();
			GridBagConstraints gbc_textField_2 = new GridBagConstraints();
			gbc_textField_2.fill = GridBagConstraints.BOTH;
			gbc_textField_2.insets = new Insets(0, 0, 5, 5);
			gbc_textField_2.gridx = 2;
			gbc_textField_2.gridy = 3;
			panel_9.add(textField_2, gbc_textField_2);
			textField_2.setColumns(10);
			
			JLabel lblNewLabel_9 = new JLabel("Apellido Materno");
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
			GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
			gbc_lblNewLabel_9.fill = GridBagConstraints.BOTH;
			gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_9.gridx = 1;
			gbc_lblNewLabel_9.gridy = 5;
			panel_9.add(lblNewLabel_9, gbc_lblNewLabel_9);
			
			textField_3 = new JTextField();
			GridBagConstraints gbc_textField_3 = new GridBagConstraints();
			gbc_textField_3.fill = GridBagConstraints.BOTH;
			gbc_textField_3.insets = new Insets(0, 0, 5, 5);
			gbc_textField_3.gridx = 2;
			gbc_textField_3.gridy = 5;
			panel_9.add(textField_3, gbc_textField_3);
			textField_3.setColumns(10);
			
			JLabel lblNewLabel_10 = new JLabel("Fecha de nacimiento:");
			lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
			GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
			gbc_lblNewLabel_10.fill = GridBagConstraints.BOTH;
			gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_10.gridx = 1;
			gbc_lblNewLabel_10.gridy = 7;
			panel_9.add(lblNewLabel_10, gbc_lblNewLabel_10);
			
			textField_4 = new JTextField();
			GridBagConstraints gbc_textField_4 = new GridBagConstraints();
			gbc_textField_4.fill = GridBagConstraints.BOTH;
			gbc_textField_4.insets = new Insets(0, 0, 5, 5);
			gbc_textField_4.gridx = 2;
			gbc_textField_4.gridy = 7;
			panel_9.add(textField_4, gbc_textField_4);
			textField_4.setColumns(10);
			
			JLabel lblNewLabel_6 = new JLabel("Sexo:");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
			GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
			gbc_lblNewLabel_6.fill = GridBagConstraints.BOTH;
			gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_6.gridx = 1;
			gbc_lblNewLabel_6.gridy = 9;
			panel_9.add(lblNewLabel_6, gbc_lblNewLabel_6);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Mujer");
			rdbtnNewRadioButton.setBackground(Color.MAGENTA);
			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
			GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
			gbc_rdbtnNewRadioButton.fill = GridBagConstraints.BOTH;
			gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnNewRadioButton.gridx = 1;
			gbc_rdbtnNewRadioButton.gridy = 10;
			panel_9.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Hombre");
			rdbtnNewRadioButton_1.setBackground(Color.MAGENTA);
			rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
			gbc_rdbtnNewRadioButton_1.fill = GridBagConstraints.BOTH;
			gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnNewRadioButton_1.gridx = 1;
			gbc_rdbtnNewRadioButton_1.gridy = 11;
			panel_9.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
			
			JLabel lblNewLabel_5 = new JLabel("Nacionalidad:");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
			GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
			gbc_lblNewLabel_5.fill = GridBagConstraints.BOTH;
			gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_5.gridx = 1;
			gbc_lblNewLabel_5.gridy = 12;
			panel_9.add(lblNewLabel_5, gbc_lblNewLabel_5);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBackground(Color.WHITE);
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.fill = GridBagConstraints.BOTH;
			gbc_comboBox.insets = new Insets(0, 0, 5, 5);
			gbc_comboBox.gridx = 2;
			gbc_comboBox.gridy = 12;
			panel_9.add(comboBox, gbc_comboBox);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(Color.PINK);
			panel_1.add(panel_3);
			panel_3.setLayout(new BorderLayout(0, 0));
			
			JLabel lblNewLabel_2 = new JLabel("Perfil de usuario:");
			lblNewLabel_2.setForeground(Color.BLACK);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
			panel_3.add(lblNewLabel_2, BorderLayout.NORTH);
			
			JPanel panel_13 = new JPanel();
			panel_13.setBackground(Color.PINK);
			panel_3.add(panel_13, BorderLayout.CENTER);
			GridBagLayout gbl_panel_13 = new GridBagLayout();
			gbl_panel_13.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel_13.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel_13.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_13.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel_13.setLayout(gbl_panel_13);
			
			JLabel lblNewLabel_11 = new JLabel("");
			lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\DYNABOOK\\Favorites\\Desktop\\IDSTV\\src\\foto.png"));
			GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
			gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_11.gridx = 6;
			gbc_lblNewLabel_11.gridy = 2;
			panel_13.add(lblNewLabel_11, gbc_lblNewLabel_11);
			
			JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar imagen");
			chckbxNewCheckBox.setBackground(Color.PINK);
			chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
			GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
			gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxNewCheckBox.gridx = 6;
			gbc_chckbxNewCheckBox.gridy = 4;
			panel_13.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
			
			JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha de nacimiento");
			chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			chckbxNewCheckBox_1.setBackground(Color.PINK);
			GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
			gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 5);
			gbc_chckbxNewCheckBox_1.gridx = 6;
			gbc_chckbxNewCheckBox_1.gridy = 5;
			panel_13.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBackground(Color.CYAN);
			panel_1.add(panel_4);
			panel_4.setLayout(new BorderLayout(0, 0));
			
			JLabel lblNewLabel_3 = new JLabel("Datos opcionales:");
			lblNewLabel_3.setForeground(new Color(0, 0, 0));
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
			panel_4.add(lblNewLabel_3, BorderLayout.NORTH);
			
			JPanel panel_7 = new JPanel();
			panel_4.add(panel_7, BorderLayout.CENTER);
			panel_7.setLayout(new BorderLayout(0, 0));
			
			JPanel panel_11 = new JPanel();
			panel_11.setBackground(Color.CYAN);
			panel_7.add(panel_11);
			panel_11.setLayout(new BorderLayout(0, 0));
			
			JLabel lblNewLabel_4 = new JLabel("Descripcion:              Preferencias:   ");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
			panel_11.add(lblNewLabel_4, BorderLayout.NORTH);
			
			JPanel panel_12 = new JPanel();
			panel_12.setBackground(Color.CYAN);
			panel_11.add(panel_12, BorderLayout.CENTER);
			panel_12.setLayout(new GridLayout(2, 2, 0, 0));
			
			JScrollPane scrollPane = new JScrollPane();
			panel_12.add(scrollPane);
			
			JTextArea textArea = new JTextArea();
			scrollPane.setViewportView(textArea);
			
			JLabel label_1 = new JLabel("");
			panel_12.add(label_1);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			panel_12.add(scrollPane_1);
			
			JTextArea textArea_1 = new JTextArea();
			scrollPane_1.setViewportView(textArea_1);
			
			JLabel label_2 = new JLabel("");
			panel_12.add(label_2);
			
			JLabel label_3 = new JLabel("");
			panel_12.add(label_3);
			
			JPanel panel_5 = new JPanel();
			panel_5.setBackground(Color.YELLOW);
			panel_1.add(panel_5);
			panel_5.setLayout(new BorderLayout(0, 0));
			
			JPanel panel_10 = new JPanel();
			panel_10.setBackground(Color.YELLOW);
			panel_5.add(panel_10, BorderLayout.CENTER);
			GridBagLayout gbl_panel_10 = new GridBagLayout();
			gbl_panel_10.columnWidths = new int[]{368, 0};
			gbl_panel_10.rowHeights = new int[]{117, 117, 117, 0};
			gbl_panel_10.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_panel_10.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel_10.setLayout(gbl_panel_10);
			
			JButton btnNewButton = new JButton("Nuevo");
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
			gbc_btnNewButton.gridx = 0;
			gbc_btnNewButton.gridy = 0;
			panel_10.add(btnNewButton, gbc_btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Guardar");
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
			gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
			gbc_btnNewButton_1.gridx = 0;
			gbc_btnNewButton_1.gridy = 1;
			panel_10.add(btnNewButton_1, gbc_btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Salir");
			btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
			gbc_btnNewButton_2.gridx = 0;
			gbc_btnNewButton_2.gridy = 2;
			panel_10.add(btnNewButton_2, gbc_btnNewButton_2);
		
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub

	}

}
