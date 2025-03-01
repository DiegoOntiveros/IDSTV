package IDSTV;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login_layuots  extends JFrame{

	public Login_layuots() {
		
		 //Agregar icono en jframe:
        Image image = Toolkit.getDefaultToolkit().getImage("src/icono.png");
        this.setIconImage(image);
		
		this.setTitle("Login");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setMinimumSize(new Dimension(700, 700));
        this.setMaximumSize(new Dimension(800,800));

        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
		
        //Layouts:
        
        JPanel barra = new JPanel(new BorderLayout());
        barra.setBackground(Color.WHITE);

        JLabel resultado = new JLabel("INTERES:");
        resultado.setBackground(Color.WHITE);
        resultado.setOpaque(true);
        resultado.setHorizontalAlignment(JLabel.LEFT);
        resultado.setPreferredSize(new Dimension(500, 500));
        barra.add(resultado, BorderLayout.CENTER);
        this.add(barra, BorderLayout.CENTER);
        
        
     

//=========================================================
       //panel 1 en donde van los datos generales:
        
       JPanel paneel_1 = new JPanel(new BorderLayout());
       paneel_1.setBackground(Color.green);
       //tamano del panel
       paneel_1.setPreferredSize(new Dimension(350,600));
       this.setVisible(true);
       
       
       
       
//==========================================================
       
       //panel 2 donde se ponen los datos de interes o metodo:
       JPanel panel_2 = new JPanel(new BorderLayout());
       panel_2.setBackground(Color.PINK);
       panel_2.setOpaque(true);
       panel_2.setPreferredSize(new Dimension(150,300));
       
       // este panel se pone en el panel uno para que haci oueda estar asta el ultima parte dela pantalla
       paneel_1.add(panel_2,BorderLayout.PAGE_END);
       
      //despues esto se le da al nuestro jpanel base para que puedan ser vistos. 
       barra.add(paneel_1,BorderLayout.SOUTH);
       this.setVisible(true);
       


 //=========================================================    
        this.setVisible(true);
	}

}
