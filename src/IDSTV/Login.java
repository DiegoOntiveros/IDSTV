package IDSTV;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login  extends JFrame{
	public static  final Color COLOR_BASE = new Color(221,201, 163);


	public Login() {


		this.setTitle("Iniciar sesion");
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
		textobase.setText("Inicie sesion:");
		textobase.setHorizontalAlignment(SwingConstants.CENTER);
		textobase.setVerticalAlignment(SwingConstants.CENTER);
		textobase.setBounds(20, 15, 320, 50);
		textobase.setFont (new Font("Arial black", Font.BOLD,24));
		textobase.setBackground(Color.white);
		textobase.setOpaque(true);
		textobase.setForeground(Color.black);
		this.add(textobase);

		this.setVisible(true);

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

		//BARRAS DE PONER TEXTO Y PONER CONTRASENA:

		JTextField barra_nombre = new JTextField();
		barra_nombre.setBounds(20, 130, 250, 30);

		this.add(barra_nombre);
		this.setVisible(true);

		// BARRA PARA CONTRASENA, Y QUE NOS PERMITE NO VER LA CONTRASENA EN LA PANTALLA
		JPasswordField barra_password = new JPasswordField();
		barra_password.setBounds(20, 240, 250, 30);

		this.add(barra_password);


		//boton de regristo:

		JButton boton = new JButton();
		boton.setBounds(50, 580, 200, 50);
		boton.setText("Iniciar sesion");
		boton.setForeground(Color.BLACK);
		boton.setFont (new Font("Arial black", Font.BOLD,15));
		this.add(boton);
		boton.setVerticalAlignment(SwingConstants.CENTER);
		boton.setVerticalAlignment(SwingConstants.CENTER);
		boton.setBackground(Color.WHITE);
		boton.setOpaque(true);

		JButton Regristo = new JButton();
		Regristo.setBounds(50, 680, 150, 50);
		Regristo.setText("Regristo");
		Regristo.setForeground(Color.BLACK);
		Regristo.setFont (new Font("Arial black", Font.BOLD,15));
		this.add(Regristo);
		Regristo.setVerticalAlignment(SwingConstants.CENTER);
		Regristo.setVerticalAlignment(SwingConstants.CENTER);
		Regristo.setBackground(Color.WHITE);
		Regristo.setOpaque(true);
		this.setVisible(true);

		Regristo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				new window();
			}
		});

		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean flag1 = false, flag2 = true;

				if(barra_nombre.getText().equals("Miguel Torres")) {	
					barra_nombre.setBorder(BorderFactory.createLineBorder(Color.red,3));
				}else {
					barra_nombre.setBorder(BorderFactory.createLineBorder(Color.green,3));
					flag1=true;
				}

				if (new String(barra_password.getPassword()).equals("1234")) {

					barra_password.setBorder(BorderFactory.createLineBorder(Color.red,3));
				}else {

					barra_password.setBorder(BorderFactory.createLineBorder(Color.green,3));
					flag2= false;	
				}
				if(flag1 && flag2) {

					JOptionPane.showMessageDialog(null,"Error al iniciar sesion verifique sus datos", "Error de sesion",JOptionPane.ERROR_MESSAGE);
				}else	
					JOptionPane.showMessageDialog(null,"inicio de sesion exitoso :D", "Inicio de sesion",JOptionPane.INFORMATION_MESSAGE);

			}
		});
		this.setVisible(true);
	
	}

    public static void main(String[] args) {
        new Login();
    }
    
 
}


	






