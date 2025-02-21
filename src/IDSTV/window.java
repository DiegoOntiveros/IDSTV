package IDSTV;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class window extends JFrame {

	public window() {
	
		
this.setVisible(true);
		
		this.setTitle("textos");
		this.setSize(500, 500);
		
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	 this.setResizable(true);
	 this.setMaximumSize(new Dimension (800,500));
	 this.setMinimumSize(new Dimension(500,600));
		 this.setLocationRelativeTo(null);
	        this.setLayout(null);
	        
//============================================================================================	 
		
		 JLabel textobase = new JLabel();
		 textobase.setText("Regristo de datos");
		 textobase.setHorizontalAlignment(SwingConstants.CENTER);
		 textobase.setVerticalAlignment(SwingConstants.CENTER);
		 textobase.setBounds(85, 15, 320, 50);
		 textobase.setFont (new Font("Arial", Font.BOLD,24));
		 textobase.setBackground(Color.white);
		 textobase.setOpaque(true);
		 textobase.setForeground(Color.black);
		 this.add(textobase);
		 
		 this.setVisible(true);
		 
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

		 JTextField barra_nombre = new JTextField();
		 barra_nombre.setBounds(20, 130, 250, 30);
	
		 this.add(barra_nombre);
		 this.setVisible(true);
//============================================================================================	 
		 
		 JLabel Ciudad = new JLabel();
		 Ciudad.setText("Escoja su ciudad:");
		 Ciudad.setHorizontalAlignment(SwingConstants.CENTER);
		 Ciudad.setVerticalAlignment(SwingConstants.CENTER);
		 Ciudad.setBounds(20, 170, 140,50);
		 Ciudad.setFont (new Font("Arial", Font.BOLD,15));
		 //Nombre.setBackground(Color.white);
		 Ciudad.setOpaque(true);
		 Ciudad.setForeground(Color.black);
		 this.add(Ciudad);
		 		 

		 
		 
		 
//============================================================================================	 
		 JButton boton = new JButton();
		 boton.setBounds(165, 500, 150, 50);
		 boton.setText("Regristarce");
		 boton.setForeground(Color.BLACK);
		 boton.setFont (new Font("Arial", Font.BOLD,15));
		 this.add(boton);
		 boton.setVerticalAlignment(SwingConstants.CENTER);
		 boton.setVerticalAlignment(SwingConstants.CENTER);
		 boton.setBackground(Color.white);
		 boton.setOpaque(true);
		 this.setVisible(true);
		 
		 
		 
	}
}
