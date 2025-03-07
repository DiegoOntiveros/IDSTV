package IDSTV;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class dibujo extends JFrame {

	public dibujo() {
		
		this.setTitle("Calculadora");
        this.setSize(1000, 700);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
	}

	public void paint(Graphics g) {
		
		super.paint(g);
		
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setStroke(new BasicStroke(3));
			
			g2d.drawRect(100, 100, 200, 200);
			
			
			g2d.setColor(Color.pink);
			g2d.drawOval(100, 320, 120, 100);
			
			
			g2d.setColor(Color.green);
			g2d.fillRect(400, 300, 100, 80);
			
			
			g2d.setColor(Color.orange);
			g2d.setFont(new Font("Arial",Font.BOLD,60));
			g2d.drawString("Hello word", 250, 400);
			
			
			g2d.setColor(Color.CYAN);
			g2d.drawLine(100, 0, 500, 500);
			
			g2d.setColor(Color.CYAN);
			g2d.drawLine(100, 250, 530, 250);
			
			g2d.setColor(Color.YELLOW);
			g2d.drawOval(0, 300, 340, 260);
			
			g2d.setColor(Color.MAGENTA);
	        g.drawArc(100, 300, 150, 150, 0, 180);
	        
	        BufferedImage image;
			try {
				image = ImageIO.read(new File("src/foto.png"));
		        g2d.drawImage(image, 500, 150, null);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
