package IDSTV;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora_hecha_con_layuot extends JFrame {

    public Calculadora_hecha_con_layuot() {

        this.setTitle("Calculadora");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setMinimumSize(new Dimension(500, 500));
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        // Panel superior para mostrar el resultado
        JPanel barra = new JPanel(new BorderLayout());
        barra.setBackground(Color.WHITE);

        JLabel resultado = new JLabel("15.00");
        resultado.setBackground(Color.WHITE);
        resultado.setOpaque(true);
        resultado.setHorizontalAlignment(JLabel.RIGHT);
        resultado.setPreferredSize(new Dimension(500, 50));
        barra.add(resultado, BorderLayout.CENTER);

        this.add(barra, BorderLayout.NORTH);

        // Panel central para los botones
        JPanel botonesPanel = new JPanel(new BorderLayout());

        // Panel para los números
        JPanel numeros = new JPanel(new GridLayout(4, 3, 5, 5));
        String[] textosNumeros = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",  };
        for (String texto : textosNumeros) {
            JButton boton = new JButton(texto);
            numeros.add(boton);
        }
        botonesPanel.add(numeros, BorderLayout.CENTER);

        // Panel para las operaciones
        JPanel operaciones = new JPanel(new GridLayout(6, 1, 5, 5));
        String[] textosOperaciones = { "+", "-", "x", "/", "CE", "C",".", "=" };
        for (String texto : textosOperaciones) {
            JButton boton = new JButton(texto);
            operaciones.add(boton);
        }
        botonesPanel.add(operaciones, BorderLayout.EAST);

        this.add(botonesPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculadora_hecha_con_layuot();
    }
}
 

