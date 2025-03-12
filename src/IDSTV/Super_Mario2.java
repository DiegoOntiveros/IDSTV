package IDSTV;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Super_Mario2 extends JFrame {

	public Super_Mario2() {
		
		 this.setSize(1280, 720);

	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        this.setResizable(true);
	        this.setLocationRelativeTo(null);
	        this.setLayout(null);
	        
	        this.setVisible(true);
	}
	
	public void paint(Graphics g) {
		
		
       
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setStroke(new BasicStroke(3));
		
		g2d.setColor(Color.decode("#3a86ff")); 
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        
      //Se usa un for para cear el suelo y repetirlo:  
        for (int x = 0; x <= 1300; x += 60) {
			
			g2d.setColor(Color.decode("#f0c72c"));
			g2d.fillRect(x, 650, 60, 60);
			g2d.setColor(Color.BLACK);
			g2d.drawRect(x, 650, 60, 60);
		}
      //Se agrega la decoracion de cuadors y tubos
	 g2d.setColor(Color.red);
	 g2d.fillRect(850, 530, 150, 120);
	 g2d.setColor(Color.red);
	 g2d.fillRoundRect(825, 430, 200, 100, 10, 10);
	 g2d.setColor(Color.black);
	 g2d.drawRect(850, 530, 150, 120);
	 g2d.setColor(Color.black);
	 g2d.drawRect(825, 430, 200, 100);
	
	 //Cuadros:
	 
	 g2d.setColor(Color.black);
	 g2d.fillRect(250, 250, 320, 400);
	 g2d.setColor(Color.decode("#fee440"));
	 g2d.fillRect(250, 260, 300, 390);
	 
	 g2d.setColor(Color.gray);
	 g2d.fillRoundRect(255, 270, 30, 30, 200, 200);
	 g2d.setColor(Color.black);
	 g2d.drawOval(255, 270, 30, 30);
		
	g2d.setColor(Color.gray);
	g2d.fillRoundRect(510, 270, 30, 30, 200, 200);
	g2d.setColor(Color.black);
	g2d.drawOval(510, 270, 30, 30);
		
	
	g2d.setColor(Color.gray);
	g2d.fillRoundRect(510, 610, 30, 30, 200, 200);
	g2d.setColor(Color.black);
	g2d.drawOval(510, 610, 30, 30);
		
	//Bloque de color Rosa:
	 g2d.setColor(Color.black);
	 g2d.fillRect(150, 450, 200, 200);
	 g2d.setColor(Color.decode("#ffb3c6"));
	 g2d.fillRect(150, 460, 190, 190);
		 
	 g2d.setColor(Color.gray);
	 g2d.fillRoundRect(155, 470, 30, 30, 200, 200);
	 g2d.setColor(Color.black);
	 g2d.drawOval(155, 470, 30, 30);
			 
	 g2d.setColor(Color.gray);
	 g2d.fillRoundRect(300, 470, 30, 30, 200, 200);
	 g2d.setColor(Color.black);
	 g2d.drawOval(300, 470, 30, 30);
			
	 g2d.setColor(Color.gray);
	 g2d.fillRoundRect(300, 610, 30, 30, 200, 200);
	 g2d.setColor(Color.black);
	 g2d.drawOval(300, 610, 30, 30);
			
	 g2d.setColor(Color.gray);
	 g2d.fillRoundRect(155, 610, 30, 30, 200, 200);
	 g2d.setColor(Color.black);
	 g2d.drawOval(155, 610, 30, 30);
			
	//Cuadro  Verde:
			
	g2d.setColor(Color.decode("#70e000"));
	g2d.fillRect(1100, 450, 200, 200);
	g2d.setColor(Color.black);
	g2d.drawRect(1100, 450, 200, 200);
	
	g2d.setColor(Color.gray);
	 g2d.fillRoundRect(1115, 610, 30, 30, 200, 200);
	 g2d.setColor(Color.black);
	 g2d.drawOval(1115, 610, 30, 30);
	 
	 g2d.setColor(Color.gray);
	 g2d.fillRoundRect(1115, 460, 30, 30, 200, 200);
	 g2d.setColor(Color.black);
	 g2d.drawOval(1115, 460, 30, 30);
			 
		//NUBES:
	g2d.setColor(Color.WHITE);
	g2d.fillRoundRect(100, 120, 300, 50, 200, 200);
	g2d.setColor(Color.WHITE);
	g2d.fillRoundRect(325, 50, 300, 50, 200, 200);
			
        }
		
		
		


	public static void main(String[] args) {
		new Super_Mario2();
	}

}
