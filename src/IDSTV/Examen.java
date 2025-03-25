package IDSTV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import java.awt.Component;

public class Examen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen window = new Examen();
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
	public Examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 862, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 191, 255));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Factura del sat 2025/2026");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(224, 255, 255));
		panel_3.add(panel_5, BorderLayout.NORTH);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{454, 0, 139, 0};
		gbl_panel_5.rowHeights = new int[]{32, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel lblDatosDelCliente = new JLabel("Datos del cliente:");
		lblDatosDelCliente.setFont(new Font("Verdana", Font.BOLD, 25));
		GridBagConstraints gbc_lblDatosDelCliente = new GridBagConstraints();
		gbc_lblDatosDelCliente.insets = new Insets(0, 0, 0, 5);
		gbc_lblDatosDelCliente.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblDatosDelCliente.gridx = 0;
		gbc_lblDatosDelCliente.gridy = 0;
		panel_5.add(lblDatosDelCliente, gbc_lblDatosDelCliente);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_6, BorderLayout.CENTER);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JLabel lblNewLabel_1 = new JLabel("Documentos:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		panel_6.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 2;
		panel_6.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nombres:\r\n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 9;
		gbc_lblNewLabel_4.gridy = 2;
		panel_6.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 12;
		gbc_textField_2.gridy = 2;
		panel_6.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Direccion:\r\n");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 3;
		panel_6.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 3;
		panel_6.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 9;
		gbc_lblNewLabel_3.gridy = 3;
		panel_6.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 12;
		gbc_textField_3.gridy = 3;
		panel_6.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Datos de factura:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 5;
		panel_6.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("N* Factura:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 2;
		gbc_lblNewLabel_6.gridy = 7;
		panel_6.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("1\r\n");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 4;
		gbc_lblNewLabel_7.gridy = 7;
		panel_6.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Fecha:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 9;
		gbc_lblNewLabel_8.gridy = 7;
		panel_6.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("10/5/2024");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 12;
		gbc_lblNewLabel_9.gridy = 7;
		panel_6.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(224, 255, 255));
		panel_4.add(panel_7, BorderLayout.NORTH);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("Ver listado de facturas:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel_7.add(lblNewLabel_10, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_7.add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("Eleminar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_7.add(btnNewButton_1, BorderLayout.EAST);
		
		JPanel panel_8 = new JPanel();
		panel_4.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_8.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Producto", "Cantidad ", "Valor ", "Sub total"
			}
		));
		table.getColumnModel().getColumn(0).setMinWidth(18);
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 3, 0, 0));
		
		JLabel lblNewLabel_11 = new JLabel("Subtotal: 6708");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_2.add(lblNewLabel_11);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_2.add(panel_9);
		panel_9.setLayout(new BoxLayout(panel_9, BoxLayout.X_AXIS));
		
		JButton btnNewButton_2 = new JButton("Finalizar factura");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_9.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Limpiar");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_9.add(btnNewButton_3);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_2.add(panel_10);
		GridBagLayout gbl_panel_10 = new GridBagLayout();
		gbl_panel_10.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_10.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_10.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_10.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_10.setLayout(gbl_panel_10);
		
		JLabel lblNewLabel_12 = new JLabel("%Descuento\r\n");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 1;
		gbc_lblNewLabel_12.gridy = 2;
		panel_10.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 2;
		panel_10.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 3;
		gbc_chckbxNewCheckBox.gridy = 2;
		panel_10.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JLabel lblNewLabel_13 = new JLabel("IVA 18%: 345,67\r\n");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 1;
		gbc_lblNewLabel_13.gridy = 4;
		panel_10.add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Total factura:  7657");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_14.gridx = 1;
		gbc_lblNewLabel_14.gridy = 5;
		panel_10.add(lblNewLabel_14, gbc_lblNewLabel_14);
	}

}
