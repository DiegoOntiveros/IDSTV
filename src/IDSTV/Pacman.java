package IDSTV;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import IDSTV.Paint.Triangulo;

public class Pacman extends JFrame{
	
	
//_______________________________________________________________________		
//cordenadas:
			
		public int x = 50;
		public int y = 50;
		public List<player> paredes = new ArrayList<>();


	public Pacman() {
		// TODO Auto-generated constructor stub
//_______________________________________________________________________		
//PANELES:
		
		this.setTitle("Pacman");
		this.setSize(580, 480);
		this.setVisible(true);
		
		JPanel panel_norte = new JPanel();
		panel_norte.setBackground(Color.blue);
		this.add(panel_norte, BorderLayout.NORTH);
		panel_norte.setVisible(true);
		
		JPanel panel_south = new JPanel();
		panel_south.setBackground(Color.MAGENTA);
		this.add(panel_south, BorderLayout.SOUTH);
		panel_south.setVisible(true);
		
        paredes.add(new player(120, 50, 60, 70, Color.ORANGE));
//_______________________________________________________________________		
//PANEL DEL MOVIEMIENTO DEL PACMAN:
		 JPanel panel_center = new dibujo();
		 panel_center.setBackground(Color.black);
	    this.add(panel_center, BorderLayout.CENTER);
	    
	    
		 this.setFocusable(true);
	        this.addKeyListener(new KeyAdapter() {	
	        	
	        	 @Override
               
	            public void keyPressed(KeyEvent e){
	        		 int pacmanSize = 50;
	        		 int newX = x; 
	                 int newY = y;
	                if (e.getKeyChar() == 'd' ) {
	                    newX += 10;
	                }
	                if (e.getKeyChar() == 'a') {
	                	newX -= 10;
	                }
	                if (e.getKeyChar() == 'w') {
	                	newY -= 10;
	                }
	                if (e.getKeyChar() == 's') {
	                	newY += 10;
	                }
	                if (newX > getWidth()) {
	                    newX = -pacmanSize;
	                }
	                if (newX + pacmanSize < 0) {
	                    newX = getWidth();
	                }
	                if (!checkCollision(newX, newY)) {
	                    x = newX;
	                    y = newY;
	                }
                    panel_center.repaint();

	            }
	        });

	        this.setVisible(true);
	}
	// Método para verificar colisiones
    public boolean checkCollision(int newX, int newY) {
        int pacmanSize = 50; // Tamaño del Pacman
        for (player wall : paredes) {
            if (newX < wall.x + wall.w &&
                newX + pacmanSize > wall.x &&
                newY < wall.y + wall.h &&
                newY + pacmanSize > wall.y) {
                return true; 
            }
        }
        return false;
    }
//_______________________________________________________________________		
//GRAFICOS:
	class dibujo extends JPanel{
        @Override
		public void paint(Graphics g) {
    		super.paint(g); 
            Graphics2D g2d = (Graphics2D) g;

            g2d.setColor(Color.YELLOW);
            g2d.setStroke(new BasicStroke(3));
            g2d.fillOval(x, y, 50, 50); // Círculo relleno amarillo
            g2d.setColor(Color.YELLOW);
            g2d.drawOval(x, y, 50, 50);  // Círculo BORDE amarillo
            
            g2d.setColor(Color.orange);
            g2d.fillRect(120, 50, 60, 70);
                    
    		}
	}
	class player{
		int x,y,w,h;
		Color c;
		
		public player(int x, int y, int w, int h, Color c) {
			
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			this.c = c;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Pacman();
	}
}
