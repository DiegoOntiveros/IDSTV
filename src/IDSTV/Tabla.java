package IDSTV;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Tabla extends JFrame {

	public Tabla() {
		
this.setVisible(true);
		
		this.setTitle("textos");
		this.setSize(500, 500);
		
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	 this.setResizable(true);
	 this.setMaximumSize(new Dimension (1000,500));
	 this.setMinimumSize(new Dimension(1000,600));
		 this.setLocationRelativeTo(null);
	        this.setLayout(null);
	        
	        
//============================================================================================	 
		
		 JLabel textobase = new JLabel();
		 textobase.setText("Tabla de datos");
		 textobase.setHorizontalAlignment(SwingConstants.CENTER);
		 textobase.setVerticalAlignment(SwingConstants.CENTER);
		 textobase.setBounds(85, 15, 320, 50);
		 textobase.setFont (new Font("Arial", Font.BOLD,24));
		 textobase.setBackground(Color.white);
		 textobase.setOpaque(true);
		 textobase.setForeground(Color.black);
		 this.add(textobase);
		 
		 this.setVisible(true);
//============================================================================================	 

		 
		 JLabel Nombre = new JLabel();
		 Nombre.setText("Ingrese su nombre completo:");
		 Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		 Nombre.setVerticalAlignment(SwingConstants.CENTER);
		 Nombre.setBounds(20, 80, 210,50);
		 Nombre.setFont (new Font("Arial", Font.BOLD,14));
		 //Nombre.setBackground(Color.white);
		 Nombre.setOpaque(true);
		 Nombre.setForeground(Color.black);
		 this.add(Nombre);
		 		 
		 this.setVisible(true);
		 
		 
//============================================================================================	 
		 String[] columnas = { "ID", "Nombre", "Edad" };
	        Object[][] datos = {
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 4, "Ana Martínez", 28 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 4, "Ana Martínez", 28 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 }, { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 4, "Ana Martínez", 28 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 } ,
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 4, "Ana Martínez", 28 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 }, { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 4, "Ana Martínez", 28 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	            { 3, "Carlos García", 35 },
	            { 1, "Juan Pérez", 25 },
	            { 2, "María López", 30 },
	        };
	        
		 JTable tabla = new  JTable(datos, columnas);
	        JScrollPane scrollTabla = new JScrollPane(tabla);
	        scrollTabla.setBounds(20, 130, 800, 350);
		 
		 
	
		 this.add(scrollTabla);
		 this.setVisible(true);
		 
		
		 this.revalidate();
		 this.repaint();
		 
		 JButton boton = new JButton();
		 boton.setBounds(165, 500, 150, 50);
		 boton.setText("Descargar");
		 boton.setForeground(Color.BLACK);
		 boton.setFont (new Font("Arial", Font.BOLD,15));
		 this.add(boton);
		 boton.setVerticalAlignment(SwingConstants.CENTER);
		 boton.setVerticalAlignment(SwingConstants.CENTER);
		 boton.setBackground(Color.white);
		 boton.setOpaque(true);
		 this.setVisible(true);
		 
		 JButton anadir = new JButton();
		 anadir.setBounds(720, 20, 100, 100);
		 anadir.setText("Anadir");
		 anadir.setForeground(Color.BLACK);
		 anadir.setFont (new Font("Arial", Font.BOLD,15));
		 this.add(anadir);
		 anadir.setVerticalAlignment(SwingConstants.CENTER);
		 anadir.setVerticalAlignment(SwingConstants.CENTER);
		 anadir.setBackground(Color.white);
		 anadir.setOpaque(true);
		 this.setVisible(true);
	//============================================================================================	 
		 
		
		 
		 
		 
		 		 
		 
//============================================================================================	 
		
		 
		 
		
		
		
	}

	
	
}
