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
import java.util.List;

import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import IDSTV.Paint.DrawingPanel;




public class  Paint   implements MouseListener, MouseMotionListener {

	public class DrawingPanel {

		public void addMouseListener(Paint paint) {
			// TODO Auto-generated method stub
			
		}

		public void addMouseMotionListener(Paint paint) {
			// TODO Auto-generated method stub
			
		}

		public void repaint() {
			// TODO Auto-generated method stub
			
		}

	}

	private JTextField textField;
	private JTextField textField_1;
	
	private JFrame frame;

	 

	private Component drawingPanel; 

	private Point lastPoint; // Para almacenar la última posición del mouse

     // Para almacenar los puntos dibujados
 

	private List<Point> points = new ArrayList<>();
 
    List<List<Point>> listaDePuntos = new ArrayList<>();
 
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
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		Colores.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		Colores.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBackground(Color.GRAY);
		Colores.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBackground(Color.DARK_GRAY);
		Colores.add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(210, 105, 30));
		Colores.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(Color.RED);
		Colores.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(Color.PINK);
		Colores.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(Color.ORANGE);
		Colores.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(Color.YELLOW);
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
		panel_2.add(btnNewButton_13, BorderLayout.EAST);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.setBackground(new Color(253, 245, 230));
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_2.add(btnNewButton_12, BorderLayout.WEST);
		
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
		flowLayout.setVgap(50);
		panel_3.add(panel_5, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.control);
		FlowLayout flowLayout_1 = (FlowLayout) panel_6.getLayout();
		flowLayout_1.setHgap(0);
		flowLayout_1.setVgap(50);
		panel_3.add(panel_6, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.control);
		panel_1.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new GridLayout(0, 1, 0, 20));
		
		
		
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
				}
			});
			panel_4.add(btnNewButton_16);
//=============================================================================		    

			
	drawingPanel = new DrawingPanel1();

    Lienzo.add(drawingPanel, BorderLayout.CENTER);

    drawingPanel.addMouseListener(this);
    drawingPanel.addMouseMotionListener(this);


}
	
	
	

@Override


public void mouseClicked(MouseEvent e) {


	// TODO Auto-generated method stub 


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


	


	


	ArrayList<Point> listaCopiada = (ArrayList<Point>) (((ArrayList<Point>) points).clone());


	


	listaDePuntos.add(listaCopiada); 


	points.clear();


	


	System.out.println(listaDePuntos);


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


	 


	 points.add(newPoint);  


        


     drawingPanel.repaint();


        


     lastPoint = newPoint;


        


        


}





class DrawingPanel1 extends JPanel {


    public void DrawingPanel() {


        setBackground(Color.WHITE);


    }





    @Override


    protected void paintComponent(Graphics g) {


        super.paintComponent(g);


        Graphics2D g2d = (Graphics2D) g;


        


        // Configuración del dibujo


        g2d.setColor(Color.BLACK);


        g2d.setStroke(new BasicStroke(3));


        


        // Dibujar todos los trazos guardados (listaDePuntos)


        for (List<Point> trazo : listaDePuntos) {


            if (trazo.size() > 1) {


                for (int i = 1; i < trazo.size(); i++) {


                    Point p1 = trazo.get(i - 1);


                    Point p2 = trazo.get(i);


                    g2d.drawLine(p1.x, p1.y, p2.x, p2.y);


                }


            }


        }


        


        // Dibujar el trazo actual (points) mientras se arrastra el mouse


        if (points.size() > 1) {


            for (int i = 1; i < points.size(); i++) {


                Point p1 = points.get(i - 1);


                Point p2 = points.get(i);


                g2d.drawLine(p1.x, p1.y, p2.x, p2.y);


            }


        }


    }


}





@Override


public void mouseMoved(MouseEvent e) {


	// TODO Auto-generated method stub


	


}

}