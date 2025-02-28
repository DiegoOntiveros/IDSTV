package IDSTV;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame {

    public Calculadora() {

        this.setTitle("Calculadora");
        this.setSize(500, 500);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(true);
        this.setMaximumSize(new Dimension(650, 650));
        this.setMinimumSize(new Dimension(650, 520));
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
        // ============================================================
        // PANEL DE LA CALCULADORA:
        JTextField barra = new JTextField();
        barra.setBounds(20, 10, 600, 150);
        this.add(barra);

        // ============================================================
        //	BOTONES DE LA CALCULADORA
        JButton numero1 = new JButton();
        numero1.setBounds(20, 200, 120, 80);
        numero1.setText("1");
        numero1.setForeground(Color.WHITE);
        numero1.setFont(new Font("Arial", Font.BOLD, 15));
        numero1.setVerticalAlignment(SwingConstants.CENTER);
        numero1.setVerticalAlignment(SwingConstants.CENTER);
        numero1.setBackground(Color.black);
        numero1.setOpaque(true);
        this.add(numero1);

        JButton numero2 = new JButton();
        numero2.setBounds(140, 200, 130, 80);
        numero2.setText("2");
        numero2.setForeground(Color.white);
        numero2.setFont(new Font("Arial", Font.BOLD, 15));
        numero2.setVerticalAlignment(SwingConstants.CENTER);
        numero2.setVerticalAlignment(SwingConstants.CENTER);
        numero2.setBackground(Color.black);
        numero2.setOpaque(true);

        this.add(numero2);
        
        JButton numero3 = new JButton();
        numero3.setBounds(270, 200, 120, 80);
        numero3.setText("3");
        numero3.setForeground(Color.white);
        numero3.setFont(new Font("Arial", Font.BOLD, 15));
        numero3.setVerticalAlignment(SwingConstants.CENTER);
        numero3.setVerticalAlignment(SwingConstants.CENTER);
        numero3.setBackground(Color.black);
        numero3.setOpaque(true);

        this.add(numero3);
        
        JButton numero4 = new JButton();
        numero4.setBounds(390, 200, 120, 80);
        numero4.setText("4");
        numero4.setForeground(Color.white);
        numero4.setFont(new Font("Arial", Font.BOLD, 15));
        numero4.setVerticalAlignment(SwingConstants.CENTER);
        numero4.setVerticalAlignment(SwingConstants.CENTER);
        numero4.setBackground(Color.black);
        numero4.setOpaque(true);

        this.add(numero4);
        
        JButton AD = new JButton();
        AD.setBounds(510, 200, 110, 60);
        AD.setText("CE");
        AD.setForeground(Color.white);
        AD.setFont(new Font("Arial", Font.BOLD, 15));
        AD.setVerticalAlignment(SwingConstants.CENTER);
        AD.setVerticalAlignment(SwingConstants.CENTER);
        AD.setBackground(Color.GRAY);
        AD.setOpaque(true);

        this.add(AD);
        
        
        JButton NUMERO5 = new JButton();
        NUMERO5.setBounds(20, 280, 120, 80);
        NUMERO5.setText("5");
        NUMERO5.setForeground(Color.white);
        NUMERO5.setFont(new Font("Arial", Font.BOLD, 15));
        NUMERO5.setVerticalAlignment(SwingConstants.CENTER);
        NUMERO5.setVerticalAlignment(SwingConstants.CENTER);
        NUMERO5.setBackground(Color.black);
        NUMERO5.setOpaque(true);

        this.add(NUMERO5);
        
        
        JButton NUMERO6 = new JButton();
        NUMERO6.setBounds(140, 280, 130, 80);
        NUMERO6.setText("6");
        NUMERO6.setForeground(Color.white);
        NUMERO6.setFont(new Font("Arial", Font.BOLD, 15));
        NUMERO6.setVerticalAlignment(SwingConstants.CENTER);
        NUMERO6.setVerticalAlignment(SwingConstants.CENTER);
        NUMERO6.setBackground(Color.black);
        NUMERO6.setOpaque(true);

        this.add(NUMERO6);
        
        JButton NUMERO7 = new JButton();
        NUMERO7.setBounds(270, 280, 120, 80);
        NUMERO7.setText("7");
        NUMERO7.setForeground(Color.white);
        NUMERO7.setFont(new Font("Arial", Font.BOLD, 15));
        NUMERO7.setVerticalAlignment(SwingConstants.CENTER);
        NUMERO7.setVerticalAlignment(SwingConstants.CENTER);
        NUMERO7.setBackground(Color.black);
        NUMERO7.setOpaque(true);

        this.add(NUMERO7);
        
        JButton menos = new JButton();
        menos.setBounds(510, 260, 110, 70);
        menos.setText("-");
        menos.setForeground(Color.white);
        menos.setFont(new Font("Arial", Font.BOLD, 15));
        menos.setVerticalAlignment(SwingConstants.CENTER);
        menos.setVerticalAlignment(SwingConstants.CENTER);
        menos.setBackground(Color.orange);
        menos.setOpaque(true);

        this.add(menos);
        
        JButton mas = new JButton();
        mas.setBounds(510, 320, 110, 70);
        mas.setText("+");
        mas.setForeground(Color.white);
        mas.setFont(new Font("Arial", Font.BOLD, 15));
        mas.setVerticalAlignment(SwingConstants.CENTER);
        mas.setVerticalAlignment(SwingConstants.CENTER);
        mas.setBackground(Color.orange);
        mas.setOpaque(true);

        this.add(mas);
        
        JButton igual = new JButton();
        igual.setBounds(510, 390, 110, 70);
        igual.setText("=");
        igual.setForeground(Color.white);
        igual.setFont(new Font("Arial", Font.BOLD, 15));
        igual.setVerticalAlignment(SwingConstants.CENTER);
        igual.setVerticalAlignment(SwingConstants.CENTER);
        igual.setBackground(Color.green);
        igual.setOpaque(true);

        this.add(igual);
        
        JButton NUMERO8 = new JButton();
        NUMERO8.setBounds(390, 280, 120, 80);
        NUMERO8.setText("8");
        NUMERO8.setForeground(Color.white);
        NUMERO8.setFont(new Font("Arial", Font.BOLD, 15));
        NUMERO8.setVerticalAlignment(SwingConstants.CENTER);
        NUMERO8.setVerticalAlignment(SwingConstants.CENTER);
        NUMERO8.setBackground(Color.black);
        NUMERO8.setOpaque(true);

        this.add(NUMERO8);
        
        JButton NUMERO9 = new JButton();
        NUMERO9.setBounds(20, 350, 120, 110);
        NUMERO9.setText("9");
        NUMERO9.setForeground(Color.white);
        NUMERO9.setFont(new Font("Arial", Font.BOLD, 15));
        NUMERO9.setVerticalAlignment(SwingConstants.CENTER);
        NUMERO9.setVerticalAlignment(SwingConstants.CENTER);
        NUMERO9.setBackground(Color.black);
        NUMERO9.setOpaque(true);

        this.add(NUMERO9);
        
        
        JButton NUMERO0 = new JButton();
        NUMERO0.setBounds(140, 350, 130, 110);
        NUMERO0.setText("0");
        NUMERO0.setForeground(Color.white);
        NUMERO0.setFont(new Font("Arial", Font.BOLD, 15));
        NUMERO0.setVerticalAlignment(SwingConstants.CENTER);
        NUMERO0.setVerticalAlignment(SwingConstants.CENTER);
        NUMERO0.setBackground(Color.black);
        NUMERO0.setOpaque(true);

        this.add(NUMERO0);
        
        JButton multi = new JButton();
        multi.setBounds(270, 360, 120, 100);
        multi.setText("X");
        multi.setForeground(Color.white);
        multi.setFont(new Font("Arial", Font.BOLD, 15));
        multi.setVerticalAlignment(SwingConstants.CENTER);
        multi.setVerticalAlignment(SwingConstants.CENTER);
        multi.setBackground(Color.orange);
        multi.setOpaque(true);

        this.add(multi);
        
        JButton division = new JButton();
        division.setBounds(390, 360, 120, 100);
        division.setText("/");
        division.setForeground(Color.white);
        division.setFont(new Font("Arial", Font.BOLD, 15));
        division.setVerticalAlignment(SwingConstants.CENTER);
        division.setVerticalAlignment(SwingConstants.CENTER);
        division.setBackground(Color.orange);
        division.setOpaque(true);

        this.add(division);
        
        
        this.setVisible(true);
      // ============================================================

    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
