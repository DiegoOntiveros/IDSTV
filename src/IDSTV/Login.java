package IDSTV;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame {
	
    public static final Color COLOR_BASE = Color.decode("#a2d2ff"); 
    public Login() {
        this.setTitle("Iniciar sesion");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setMaximumSize(new Dimension(800, 800));
        this.setMinimumSize(new Dimension(650, 800));
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(COLOR_BASE);

        JLabel textobase = new JLabel("Inicio de sesion:", SwingConstants.CENTER);
        textobase.setBounds(160, 15, 320, 50);
        textobase.setFont(new Font("Arial black", Font.BOLD, 24));
        textobase.setOpaque(true);
        textobase.setBackground(Color.decode("#ffc8dd"));
        textobase.setForeground(Color.black);
        this.add(textobase);

        JLabel Nombre = new JLabel("Ingrese su nombre completo:", SwingConstants.CENTER);
        Nombre.setBounds(160, 80, 350, 50);
        Nombre.setFont(new Font("Arial black", Font.BOLD, 20));
        Nombre.setOpaque(true);
        Nombre.setBackground(COLOR_BASE);
        Nombre.setForeground(Color.black);
        this.add(Nombre);

        JLabel Password = new JLabel("Ingrese su contraseña:", SwingConstants.CENTER);
        Password.setBounds(180, 180, 280, 50);
        Password.setFont(new Font("Arial black", Font.BOLD, 20));
        Password.setOpaque(true);
        Password.setBackground(COLOR_BASE);
        Password.setForeground(Color.black);
        this.add(Password);

        JTextField barra_nombre = new JTextField();
        barra_nombre.setBounds(200, 130, 250, 30);
        this.add(barra_nombre);

        JPasswordField barra_password = new JPasswordField();
        barra_password.setBounds(200, 240, 250, 30);
        this.add(barra_password);

        // Botón de inicio de sesión
        JButton boton = new JButton("Iniciar sesion");
        boton.setBounds(215, 550, 200, 50);
        boton.setFont(new Font("Arial black", Font.BOLD, 15));
        boton.setBackground(Color.decode("#ffd60a"));
        boton.setOpaque(true);
        this.add(boton);

        // Botón de registro
        JButton Regristo = new JButton("Regristarce");
        Regristo.setBounds(235, 650, 150, 50);
        Regristo.setFont(new Font("Arial black", Font.BOLD, 15));
        Regristo.setBackground(Color.WHITE);
        Regristo.setOpaque(true);
        this.add(Regristo);

        // Este apartado trata de verificar los datos ingresados y si estan correctos o no, arrojando ventanas de 
        // error si es que el nombre o la contrasena estan mal.
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean flag1 = false, flag2 = false;

                // Verificación del nombre
                if (barra_nombre.getText().equals("Miguel Torres")) {
                    barra_nombre.setBorder(BorderFactory.createLineBorder(Color.green, 3));
                    flag1 = true;
                } else {
                    barra_nombre.setBorder(BorderFactory.createLineBorder(Color.red, 3));
                }

                // Verificación de la contraseña
                if (new String(barra_password.getPassword()).equals("1234")) {
                    barra_password.setBorder(BorderFactory.createLineBorder(Color.green, 3));
                    flag2 = true;
                } else {
                    barra_password.setBorder(BorderFactory.createLineBorder(Color.red, 3));
                }

                // Mensajes según el estado de las verificaciones
                if (flag1 && flag2) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso :D", "Inicio de sesion", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new Tabla(); // esto lleve a una clase tabla que seria como nuestro programa.
                } else {
                    if (!flag1) {
                        JOptionPane.showMessageDialog(null, "Hubo un error en el nombre de usuario.", "Error de sesion", JOptionPane.ERROR_MESSAGE);
                    }
                    if (!flag2) {
                        JOptionPane.showMessageDialog(null, "Hubo un error en la contraseña.", "Error de sesion", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        Regristo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new window(); //esto te lleva al regristo
            }
        });

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}


