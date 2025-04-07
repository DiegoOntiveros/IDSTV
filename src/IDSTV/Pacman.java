package IDSTV;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pacman extends JFrame{
	
//_______________________________________________________________________		
//cordenadas:
			
		public int x = 50;
		public int y = 50;

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

//_______________________________________________________________________		
//PANEL DEL MOVIEMIENTO DEL PACMAN:
		 dibujo panel_center = new dibujo();
		 panel_center.setBackground(Color.black);
	    this.add(panel_center, BorderLayout.CENTER);
	        
		 this.setFocusable(true);
	        this.addKeyListener(new KeyAdapter() {
	            @Override
	            public void keyPressed(KeyEvent e) {
	                if (e.getKeyChar() == 'd') {
	                    x += 10;
	                    panel_center.repaint();
	                }
	                if (e.getKeyChar() == 'a') {
	                    x -= 10;
	                    panel_center.repaint();
	                }
	                if (e.getKeyChar() == 'w') {
	                    y -= 10;
	                    panel_center.repaint();
	                }
	                if (e.getKeyChar() == 's') {
	                    y += 10;
	                    panel_center.repaint();
	                }
	            }
	        });

	        this.setVisible(true);
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

                    
    		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Pacman();
	}
}
