package IDSTV;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class casa  extends JFrame{

	public casa() {
		
		this.setTitle("Casa:");
        this.setSize(1000, 1500);

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
			
			
			
			g2d.setColor(Color.green);
			g2d.fillRect(0, 780, 20000, 100);
			

			g2d.setColor(Color.orange);
			g2d.fillRect(0, 600, 1000, 50);
			
			g2d.setColor(Color.orange);
	        g2d.fillRect(0,520, 50, 260);
	        
	        g2d.setColor(Color.orange);
	        g2d.fillRect(80,520, 50, 260);
	        
	        g2d.setColor(Color.orange);
	        g2d.fillRect(160,520, 50, 260);
	        
	        g2d.setColor(Color.orange);
	        g2d.fillRect(240,520, 50, 260);
	        
	        g2d.setColor(Color.orange);
	        g2d.fillRect(700,520, 50, 260);
	        
	        g2d.setColor(Color.orange);
	        g2d.fillRect(780,520, 50, 260);
			
	        g2d.setColor(Color.orange);
	        g2d.fillRect(860,520, 50, 260);
	        
	        g2d.setColor(Color.orange);
	        g2d.fillRect(940,520, 50, 260);
	        
			g2d.setColor(Color.gray);
			g2d.fillRect(250, 730, 500, 50);
			

	        
			
			g2d.setColor(Color.yellow);
			g2d.fillRect(280, 230, 450, 500);
			
			g2d.setColor(Color.red);
			int[] xPoints = {200, 500, 820 };
	        int[] yPoints = {300, 50, 300};
	        int nPoints = 3; 
	        g2d.drawPolygon(xPoints, yPoints, nPoints);
	        g2d.fillPolygon(xPoints, yPoints, nPoints);
	    
	        g2d.setColor(Color.cyan);
	        g2d.fillRect(550, 330, 170, 180);
			
	        g2d.setColor(Color.darkGray);
	        g2d.fillRect(300, 350, 180, 380);
	        

	        g.setColor(Color.gray);
	        g.fillOval(440, 550, 30, 30);
	        
			
	       
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
