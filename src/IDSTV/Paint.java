package IDSTV;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.sound.midi.Track;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


public class  Paint   implements MouseListener, MouseMotionListener {
	 


	private JTextField textField;
	private JTextField textField_1;
	
	private JFrame frame;
	private DrawingPanel drawingPanel; 
	private Point lastPoint; // Para almacenar la última posición del mouse
     // Para almacenar los puntos dibujados
	private List<Point> points = new ArrayList<>();
	private List<Rectangle> figuras = new ArrayList<>();
	private List<Rectangle> figurass = new ArrayList<>();
	private List<Triangulo> triangulos = new ArrayList<>();
    List<List<Point>> listaDePuntos = new ArrayList<>();

    
    //color
    //modificacion:
    private Color coloractual = Color.BLACK;
    List<Trazos> trazosList = new ArrayList<>();

    
    //1 = pincel, 2 = cuadrado
    private int method = 1;
    private int grozor = 3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint window = new Paint();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Paint() {

		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1076, 744);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel Instrumentos = new JPanel();
		Instrumentos.setBackground(new Color(240, 240, 240));
		panel.add(Instrumentos, BorderLayout.NORTH);
		Instrumentos.setLayout(new GridLayout(0, 1, 0, 10));
		
		JLabel lblNewLabel = new JLabel("Colors custom:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Instrumentos.add(lblNewLabel);
		
		JButton btnNewButton_11 = new JButton("Set background");
		btnNewButton_11.setBackground(new Color(253, 245, 230));
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		Instrumentos.add(btnNewButton_11);
		
		textField = new JTextField();
		Instrumentos.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Size:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Instrumentos.add(lblNewLabel_1);
		
		JPanel Colores = new JPanel();
		Colores.setBackground(SystemColor.control);
		panel.add(Colores, BorderLayout.SOUTH);
		Colores.setLayout(new GridLayout(0, 2, 15, 15));
		
		JButton btnNewButton = new JButton("            ");
		btnNewButton.addActionListener(e -> coloractual = Color.WHITE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		Colores.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(e -> coloractual = Color.LIGHT_GRAY);
		Colores.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBackground(Color.GRAY);
		Colores.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1.addActionListener(e -> coloractual = Color.BLACK);
		Colores.add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(210, 105, 30));
		btnNewButton_3.addActionListener(e -> coloractual = Color.decode("#dda15e"));
		Colores.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(Color.RED);
		btnNewButton_4.addActionListener(e -> coloractual = Color.RED);

		Colores.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(Color.PINK);
		btnNewButton_5.addActionListener(e -> coloractual = Color.PINK);
		Colores.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(Color.ORANGE);
		btnNewButton_7.addActionListener(e -> coloractual = Color.decode("#fca311"));
		Colores.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(Color.YELLOW);
		btnNewButton_6.addActionListener(e -> coloractual = Color.decode("#ffff00"));

		Colores.add(btnNewButton_6);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBackground(Color.MAGENTA);
		Colores.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(Color.GREEN);
		Colores.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBackground(Color.CYAN);
		
		Colores.add(btnNewButton_10);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.control);
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(5, 0));
		
		textField_1 = new JTextField();
		panel_2.add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);
		
		JButton btnNewButton_13 = new JButton("+");
		btnNewButton_13.setBackground(new Color(253, 245, 230));
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_13.addActionListener(new ActionListener() {
//=========================================================================	
//modificacion:
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 grozor += 1; 
			        textField_1.setText(String.valueOf(grozor));
			}
		});
		panel_2.add(btnNewButton_13, BorderLayout.EAST);
//=========================================================================			
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.setBackground(new Color(253, 245, 230));
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_12.addActionListener(new ActionListener() {
//=========================================================================			
//modificacion:	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (grozor > 1) { 
					// No permitir valores menores a 1
					// Disminuir grosor en 1
		            grozor -= 1; 
		            textField_1.setText(String.valueOf(grozor));
			}
		}
		});
		panel_2.add(btnNewButton_12, BorderLayout.WEST);
//=========================================================================			
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(10, 0));
		
		JButton btnNewButton_14 = new JButton("Brush");
		btnNewButton_14.setBackground(new Color(253, 245, 230));
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_3.add(btnNewButton_14, BorderLayout.WEST);
		
		JButton btnNewButton_15 = new JButton("Erase");
		btnNewButton_15.setBackground(new Color(253, 245, 230));
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_3.add(btnNewButton_15, BorderLayout.EAST);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.control);
		FlowLayout flowLayout = (FlowLayout) panel_5.getLayout();
		flowLayout.setVgap(10);
		panel_3.add(panel_5, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.control);
		FlowLayout flowLayout_1 = (FlowLayout) panel_6.getLayout();
		flowLayout_1.setHgap(0);
		panel_3.add(panel_6, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.control);
		panel_1.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new GridLayout(0, 1, 0, 20));
		
		JButton btnNewButton_19 = new JButton("Rectangulo");
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				method = 2;
			}
		});
		panel_4.add(btnNewButton_19);
		
		JButton btnNewButton_21 = new JButton("Triangulo");
		btnNewButton_21.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_21.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				method = 4;
			}
		});
		panel_4.add(btnNewButton_21);
		
		
		
		JButton btnNewButton_20 = new JButton("Circulo");
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				method = 3;
				
			}
		});
		panel_4.add(btnNewButton_20);
		
		JButton btnNewButton_18 = new JButton("Lapiz");
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12)); 
		btnNewButton_18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				method = 1;
				
			}
		});
		panel_4.add(btnNewButton_18);
		
		
		
		JButton btnNewButton_17 = new JButton("Save");
		btnNewButton_17.setBackground(new Color(152, 251, 152));
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panel_4.add(btnNewButton_17);
		
		
		JPanel Lienzo = new JPanel();
		Lienzo.setBackground(new Color(0, 0, 0));
		 Lienzo.setBorder(new EmptyBorder(5, 5, 5, 5));
		   // Lienzo.setBorder((Border) Lienzo);
		    frame.getContentPane().add(Lienzo, BorderLayout.CENTER);
		    
		    Lienzo.setLayout(new BorderLayout(0, 0));
		    
		    
//=============================================================================		    
		    JButton btnNewButton_16 = new JButton("Clean");
			btnNewButton_16.setBackground(new Color(152, 251, 152));
			btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			btnNewButton_16.addActionListener(new ActionListener() {
				
				@Override
				//BORRAR EL LIENZO:
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					listaDePuntos.clear(); // Limpia los trazos guardados
			        points.clear(); // Limpia el trazo actual
			        drawingPanel.repaint(); 
			        figuras.clear();
			        figurass.clear();
			        triangulos.clear();
				}
			});
			panel_4.add(btnNewButton_16);
//=============================================================================		    

	//PANEL QUE NOS PERMIETE DIBUJA EN EL:		
	drawingPanel = new DrawingPanel();

    Lienzo.add(drawingPanel, BorderLayout.CENTER);
    drawingPanel.setBackground(Color.WHITE);

    drawingPanel.addMouseListener(this);
    drawingPanel.addMouseMotionListener(this);


}
//=============================================================================		    
	
	
	
//=============================================================================		    
@Override
public void mouseClicked(MouseEvent e) {
	if(method==2) {

		 

		Rectangle tmp = new Rectangle(e.getX(),e.getY(),100,100);
		figuras.add(tmp);
	}
	if(method==3) {

		Rectangle tmp = new Rectangle(e.getX(),e.getY(),100,100);
		figurass.add(tmp);
	}
	 else if(method == 4) {
	        Triangulo tmp = new Triangulo(e.getX(), e.getY(), 100);
	        triangulos.add(tmp);
	    }

	drawingPanel.repaint();

}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub 
	lastPoint = e.getPoint();
    points.add(lastPoint); // Añadir el primer punto

}

@Override


public void mouseReleased(MouseEvent e) {

	// TODO Auto-generated method stub 
	if (!points.isEmpty()) {
        List<Point> listaCopiada = new ArrayList<>(points);
        trazosList.add(new Trazos(listaCopiada, coloractual, grozor));
        points.clear();
    }
    drawingPanel.repaint();
	


}

@Override
public void mouseEntered(MouseEvent e) {

	// TODO Auto-generated method stub
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub 
}


@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		 Point newPoint = e.getPoint(); 
		 if(method==1)
			 points.add(newPoint);  
	     drawingPanel.repaint();
	     lastPoint = newPoint;
	}
	
	
	
	
	
	class DrawingPanel extends JPanel {
	    public void DrawingPanel() {
	
	
	        setBackground(Color.white);
	    
	    }
	    @Override
	    protected void paintComponent(Graphics g) {
	    	
	    	 super.paintComponent(g);
	    	    Graphics2D g2d = (Graphics2D) g;
	    	
	    	 for (Trazos trazo : trazosList) {
	    	        g2d.setColor(trazo.color);
	    	        g2d.setStroke(new BasicStroke(trazo.grosor));
	    	        for (int i = 1; i < trazo.puntos.size(); i++) {
	    	            Point p1 = trazo.puntos.get(i - 1);
	    	            Point p2 = trazo.puntos.get(i);
	    	            g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
	    	        }
	    	    }

	    	    // Dibujar el trazo actual mientras se arrastra el mouse
	    	    g2d.setColor(coloractual);
	    	    g2d.setStroke(new BasicStroke(grozor));
	    	    for (int i = 1; i < points.size(); i++) {
	    	        Point p1 = points.get(i - 1);
	    	        Point p2 = points.get(i);
	    	        g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
	    	    }

	    	    // Dibujar las figuras (rectángulos, círculos y triángulos)
	    	    for (Rectangle rect : figuras) {
	    	        g2d.drawRect(rect.x, rect.y, rect.w, rect.h);
	    	    }
	    	    for (Rectangle circulo : figurass) {
	    	        g2d.drawOval(circulo.x, circulo.y, circulo.w, circulo.h);
	    	    }
	    	    for (Triangulo triangulo : triangulos) {
	    	        int[] xPoints = {triangulo.x, triangulo.x - triangulo.tamaño / 2, triangulo.x + triangulo.tamaño / 2};
	    	        int[] yPoints = {triangulo.y - triangulo.tamaño / 2, triangulo.y + triangulo.tamaño / 2, triangulo.y + triangulo.tamaño / 2};
	    	        g2d.drawPolygon(xPoints, yPoints, 3);
	    	    }
	    	}
	    
		}
	

	class Triangulo {
        int x, y, tamaño;
        public Triangulo(int x, int y, int tamaño) {
            this.x = x;
            this.y = y;
            this.tamaño = tamaño;
        }
    }
	class Rectangle{
		private int x,y,w,h;
		public Rectangle(int x, int y,int w, int h)
		{
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			
		}
 

	}
//
	class Trazos {
	    List<Point> puntos;
	    Color color;
	    int grosor;

	    Trazos(List<Point> puntos, Color color, int grosor) {
	        this.puntos = new ArrayList<>(puntos);
	        this.color = color;
	        this.grosor = grozor;
	    }
	}

	@Override 	
	public void mouseMoved(MouseEvent e) {		
	
		// TODO Auto-generated method stub
	
	}
	}
	
	
