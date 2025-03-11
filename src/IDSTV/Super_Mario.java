package IDSTV;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Super_Mario extends JFrame{

	public Super_Mario() {
		
		this.setTitle("Super mario:");
        this.setSize(1500, 1800);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
        this.getContentPane().setBackground(new Color(135, 206, 235)); 
        
        this.setVisible(true);
		
		
		
	}
	
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setStroke(new BasicStroke(3));
		
		//AQUI SE AGREGARON Y PUSIERON LOS CERROS O MONTANAS DEL MAPA DE MARIO DE COLOR VERDE AZUL, ROSA, Y NARANJA.
		 g2d.setColor(Color.green);
		 g2d.fillRoundRect(200, 200, 250, 800, 250, 250);
		
		 
		 g2d.setColor(Color.pink);
		 g2d.fillRoundRect(1000, 50, 250, 800, 250, 250);
		 
		 g2d.setColor(Color.yellow);
		 g2d.fillRoundRect(850, 250, 250, 800, 250, 250);
		 
		 g2d.setColor(Color.orange);
		 g2d.fillRoundRect(1050, 500, 250, 800, 250, 250);
		
		
		    
		g2d.setColor(Color.CYAN);
	    g2d.fillRoundRect(20, 500, 250, 600, 250, 250); 
	    
	    //AQUI SE AGREGARON LAS NUBES DE COLOR BLANCO.
	    g2d.setColor(Color.WHITE);
	    g2d.fillRoundRect(100, 120, 300, 50, 200, 200);
	    g2d.setColor(Color.WHITE);
	    g2d.fillRoundRect(325, 50, 300, 50, 200, 200);
	   
	    g2d.setColor(Color.WHITE);
	    g2d.fillRoundRect(1200, 100, 300, 50, 200, 200);
	    g2d.setColor(Color.WHITE);
	    g2d.fillRoundRect(550, 250, 300, 50, 200, 200);
	    
	    g2d.setColor(Color.white);
	    g2d.fillRoundRect(400, 450, 35, 50, 200, 200);
	    
	    g2d.setColor(Color.white);
	    g2d.fillRoundRect(360, 250, 35, 50, 200, 200);
	    
	    g2d.setColor(Color.white);
	    g2d.fillRoundRect(300, 370, 35, 50, 200, 200);
	    
	    g2d.setColor(Color.white);
	    g2d.fillRoundRect(80, 620, 35, 50, 200, 200);
	    
	    g2d.setColor(Color.white);
	    g2d.fillRoundRect(150, 520, 35, 50, 200, 200);
	   
	   //AQUI SE PUSIERON LOS TUBOS DE COLOR ROJO Y VERDE.
	    g2d.setColor(Color.red);
	    g2d.fillRect(850, 650, 150, 150);
	    g2d.setColor(Color.red);
	    g2d.fillRoundRect(825, 560, 200, 100, 10, 10);
	    g2d.setColor(Color.black);
	    g2d.drawRect(850, 659, 150, 150);
	    g2d.setColor(Color.black);
	    g2d.drawRect(825, 560, 200, 100);
	    
	    
	    //AQUI SE PUSIERON LOS TUBOS DE COLOR ROJO Y VERDE
	    g2d.setColor(Color.green);
	    g2d.fillRect(1350, 650, 150, 150);
	    g2d.setColor(Color.green);
	    g2d.fillRoundRect(1325, 560, 200, 100, 10, 10);
	    g2d.setColor(Color.black);
	    g2d.drawRect(1350, 659, 150, 150);
	    g2d.setColor(Color.black);
	    g2d.drawRect(1325, 560, 200, 100);
	    
	   
	    //AQUI SE PUSIERON LOS BLOQUES DE COLOR GRIS CON BORDE NEGRO.
	    g2d.setColor(Color.gray);
	    g2d.fillRect(1150, 700, 80, 80);
	    g2d.setColor(Color.black);
	    g2d.drawRect(1150, 700, 80, 800);
	    g2d.setColor(Color.gray);
	    g2d.fillRect(1150, 619, 80, 80);
	    g2d.setColor(Color.black);
	    g2d.drawRect(1150, 619, 80, 800);
	    g2d.setColor(Color.gray);
	    g2d.fillRect(1150, 538, 80, 80);
	    g2d.setColor(Color.black);
	    g2d.drawRect(1150, 538, 80, 800);
	    g2d.setColor(Color.gray);
	    g2d.fillRect(1150, 457, 80, 80);
	    g2d.setColor(Color.black);
	    g2d.drawRect(1150, 457, 80, 800);
	    g2d.setColor(Color.gray);
	    g2d.fillRect(1230, 457, 80, 80);
	    g2d.setColor(Color.black);
	    g2d.drawRect(1230, 457, 80, 80);
	    g2d.setColor(Color.gray);
	    g2d.fillRect(1310, 457, 80, 80);
	    g2d.setColor(Color.black);
	    g2d.drawRect(1310, 457, 80, 80);
	    g2d.setColor(Color.gray);
	    g2d.fillRect(1390, 457, 80, 80);
	    g2d.setColor(Color.black);
	    g2d.drawRect(1390, 457, 80, 80);
	    g2d.setColor(Color.gray);
	    g2d.fillRect(1470, 457, 80, 80);
	    g2d.setColor(Color.black);
	    g2d.drawRect(1470, 457, 80, 80);
	    
	    
	    //AQUI SE COLOCARON EL PASTO Y LA TIERRA DEL NIVEL, PARA EL COLOR CAFE SE USARON CORDENADAS YA QUE 
	    // JAVA NO TIENE COLOR CAFE POR ESCOJER.
	    g2d.setColor(Color.green);
		g2d.fillRect(0, 780, 20000, 100);
		
		g2d.setColor(new Color(205,133,63));
		g2d.fillRect(0, 800, 20000, 100);
	    
		
	    
	    
	    g2d.dispose();
		
		
		
		
		
	}

	public static void main(String[] args) {

	}

}
