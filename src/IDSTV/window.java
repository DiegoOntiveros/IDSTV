package IDSTV;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class window extends JFrame {
public static  final Color COLOR_BASE = new Color(221,201, 163);
	public window() {

		
this.setVisible(true);
		
		this.setTitle("Regristo datos para el ine");
		this.setSize(500, 500);
		
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	 this.setResizable(true);
	 this.setMaximumSize(new Dimension (800,800));
	 this.setMinimumSize(new Dimension(650,800));
		 this.setLocationRelativeTo(null);
	        this.setLayout(null);
	     this.getContentPane().setBackground(COLOR_BASE);
	       
//============================================================================================	 
		
		 JLabel textobase = new JLabel();
		 textobase.setText("Regristo de datos");
		 textobase.setHorizontalAlignment(SwingConstants.CENTER);
		 textobase.setVerticalAlignment(SwingConstants.CENTER);
		 textobase.setBounds(20, 15, 320, 50);
		 textobase.setFont (new Font("Arial black", Font.BOLD,24));
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
		 Nombre.setBounds(10, 80, 350,50);
		 Nombre.setFont (new Font("Arial black", Font.BOLD,20));
		 Nombre.setBackground(COLOR_BASE);
		 Nombre.setOpaque(true);
		 Nombre.setForeground(Color.black);
		 this.add(Nombre);
		 		 
		 this.setVisible(true);
		 
		 JLabel Password = new JLabel();
		 Password.setText("Ingrese su contraseña:");
		 Password.setHorizontalAlignment(SwingConstants.CENTER);
		 Password.setVerticalAlignment(SwingConstants.CENTER);
		 Password.setBounds(10, 180, 280,50);
		 Password.setFont (new Font("Arial black", Font.BOLD,20));
		 Password.setBackground(COLOR_BASE);
		 Password.setOpaque(true);
		 Password.setForeground(Color.black);
		 this.add(Password);
		 		 
		 this.setVisible(true);
		 
		 
//============================================================================================	 
		 //BARRAS DE PONER TEXTO Y PONER CONTRASENA:
		 
		 
		 
		 
		 JTextField barra_nombre = new JTextField();
		 barra_nombre.setBounds(20, 130, 250, 30);
	
		 this.add(barra_nombre);
		 this.setVisible(true);
		 
		 // BARRA PARA CONTRASENA, Y QUE NOS PERMITE NO VER LA CONTRASENA EN LA PANTALLA
		 JPasswordField barra_password = new JPasswordField();
		 barra_password.setBounds(20, 240, 250, 30);
	
		 this.add(barra_password);
		 this.setVisible(true);
		 
		
		 
//============================================================================================	 
		 
		 JLabel Ciudad = new JLabel();
		 Ciudad.setText("Escoja su ciudad:");
		 Ciudad.setHorizontalAlignment(SwingConstants.CENTER);
		 Ciudad.setVerticalAlignment(SwingConstants.CENTER);
		 Ciudad.setBounds(15, 300, 220,50);
		 Ciudad.setFont (new Font("Arial black", Font.BOLD,20));
		 Ciudad.setBackground(COLOR_BASE);
		 Ciudad.setOpaque(true);
		 Ciudad.setForeground(Color.black);
		 this.add(Ciudad);
		 this.setVisible(false);
		 
		 
		 //opcion para poder escojer una ciudad:
		 
		 String[] ciudades = {"Cabo san lucas","La paz","San jose","Ciudad constitucion"};

		 JComboBox lista = new JComboBox(ciudades);
		 lista.setBounds(20,360, 150,80);
		 this.add(lista);
		 
//============================================================================================	 	 
		 //opciones de genero por boton 
		 
		 JLabel Genero = new JLabel();
		 Genero.setText("Escoja su Genero:");
		 Genero.setHorizontalAlignment(SwingConstants.CENTER);
		 Genero.setVerticalAlignment(SwingConstants.CENTER);
		 Genero.setBounds(10, 350, 250,280);
		 Genero.setFont (new Font("Arial black", Font.BOLD,20));
		 Genero.setBackground(COLOR_BASE);
		 Genero.setOpaque(true);
		 Genero.setForeground(Color.black);
		 this.add(Genero);
		 this.setVisible(false);

		 //opcion 1
		 JRadioButton opcion_genero = new JRadioButton("Hombre",false);
		 opcion_genero.setBounds(20, 510, 170,40);
		 this.add(opcion_genero);
		 opcion_genero.setBackground(COLOR_BASE);
		 this.setVisible(false);
		 opcion_genero.setFont (new Font("Arial", Font.ITALIC,15));

		 // opcion 2
		 JRadioButton opcion_genero2 = new JRadioButton("Mujer",false);
		 opcion_genero2.setBounds(20, 550, 170,40);
		 this.add(opcion_genero2);
		 opcion_genero2.setBackground(COLOR_BASE);
		 this.setVisible(true);
		 opcion_genero2.setFont (new Font("Arial", Font.ITALIC,15));

		// opcion 3
		 JRadioButton opcion_genero3 = new JRadioButton("No definido",false);
		 opcion_genero3.setBounds(20, 590, 170,40);
		 this.add(opcion_genero3);
		 opcion_genero3.setBackground(COLOR_BASE);
		 opcion_genero3.setFont (new Font("Arial", Font.ITALIC,15));

		 

		 this.setVisible(false);

		 ButtonGroup opciones = new ButtonGroup();
		 opciones.add(opcion_genero);
		 opciones.add(opcion_genero2);
		 opciones.add(opcion_genero3);
		
		 
//============================================================================================	 
		 //boton de regristo:
		 
		 JButton boton = new JButton();
		 boton.setBounds(50, 680, 150, 50);
		 boton.setText("Regristarce");
		 boton.setForeground(Color.BLACK);
		 boton.setFont (new Font("Arial", Font.BOLD,15));
		 this.add(boton);
		 boton.setVerticalAlignment(SwingConstants.CENTER);
		 boton.setVerticalAlignment(SwingConstants.CENTER);
		 boton.setBackground(Color.white);
		 boton.setOpaque(true);
		 this.setVisible(true);
		 
		 //icono del ine tamano:
		 JLabel logo = new JLabel();
	        logo.setBounds(300, 250, 250, 250); 
	        this.add(logo);
	        
	     //poner la imagen el tamano y la calidad de esta:
	        
	     ImageIcon imagenIcon = new ImageIcon("src/logo.png"); 
	     Image imagen = imagenIcon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
	     logo.setIcon(new ImageIcon(imagen));

	     
	     boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(barra_nombre.getText().equals("")) {	
					barra_nombre.setBorder(BorderFactory.createLineBorder(Color.red,3));
				}else {
					barra_nombre.setBorder(BorderFactory.createLineBorder(Color.green,3));
				}
			
				if (new String(barra_password.getPassword()).equals("")) {
					
					barra_password.setBorder(BorderFactory.createLineBorder(Color.red,3));
					
					
				}else {
					
					barra_password.setBorder(BorderFactory.createLineBorder(Color.green,3));

					
				}
			}
	     });
	     
	     
	     
	      this.setVisible(true);
		 
		 
	}

	
	
}
