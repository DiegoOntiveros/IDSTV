package IDSTV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.net.URL;
import java.nio.charset.CharsetEncoder;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

public class Memorama {
	
	public JFrame frame;
	private  int cartas[] = {1,1,2,2,3,3,4,4,5,5,6,6};
	public int C1 =0;
	public int C2 = 0;
	public int aciertos = 0;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_3;


		

private void verificarPareja() {
    if (C1 != 0 && C2 != 0) {
        if (C1 == C2) {
        	aciertos +=10;
            JOptionPane.showConfirmDialog(null, "¡Es un par! :D", "Correcto", JOptionPane.YES_OPTION);
            lblNewLabel_1.setText("Puntaje"+aciertos);

           
        } else {
            JOptionPane.showConfirmDialog(null, "No es un par D':", "Error", JOptionPane.ERROR_MESSAGE);
            on1(null);
            
            
        }
        
        C1 = 0;
        C2 = 0;
        

       
    }	
}
private void off1(JButton boton){
	
	if(boton != null) {
		boton.setEnabled(false);
		
	}
}
private void on1(JButton boton1) {
 if(boton1 != null) {
		
		boton1.setEnabled(true);
	}



}

private void tiemp(){
	
	
}




	/**
	 * Create the application.
	 */
	public Memorama() {
		initialize();
		
	}
	public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            try {
	                Memorama window = new Memorama();
	                window.frame.setVisible(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    });
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		
		frame = new JFrame();
		frame.setBounds(100, 100, 801, 752);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#0066b1"));
		frame.getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		//panel.setBorder(new LineBorder(Color.decode("#FFE4E1"), 6));

		
	
		
		//=============================================================================
		lblNewLabel_3 = new JLabel("Tiempo: 0\r\n");
		lblNewLabel_3.setForeground(SystemColor.window);
		lblNewLabel_3.setFont(new Font("Magneto", Font.ITALIC, 20));
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setBorder(new LineBorder(Color.decode("#fff773"), 6));
		
	    lblNewLabel_1 = new JLabel("Puntaje: 0");
		lblNewLabel_1.setForeground(SystemColor.window);
    	lblNewLabel_1.setBackground(Color.GREEN);
    	lblNewLabel_1.setFont(new Font("Magneto", Font.ITALIC, 20));
    	lblNewLabel_1.setBorder(new LineBorder(Color.decode("#fff773"), 6));
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_4 = new JLabel("Movimientos: 0");
		lblNewLabel_4.setForeground(SystemColor.window);
		lblNewLabel_4.setFont(new Font("Magneto", Font.ITALIC, 20));
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setBorder(new LineBorder(Color.decode("#fff773"), 6));

		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#0066b1"));
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setBorder(new LineBorder(Color.decode("#fff773"), 6));

		
		JLabel lblNewLabel = new JLabel("Memorama 3000");
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setBackground(SystemColor.activeCaptionBorder);
		lblNewLabel.setFont(new Font("Magneto", Font.ITALIC, 25));
		panel_2.add(lblNewLabel); 
		//lblNewLabel.setBorder(new LineBorder(Color.decode("#d7dbdb"), 6));

		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.decode("#FFFAF0"));
		panel_1.add(panel_3, BorderLayout.CENTER);
		
		panel_3.setLayout(new GridLayout(4, 3, 10, 7));
		panel_3.setBorder(new LineBorder(Color.decode("#FFFAF0"), 10));
				
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_1.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/76.png")));

				if(C1 ==0) {
					
					C1 = 76;
					
				}else if (C2 == 0) {
					C2 =76;
					
				} 
					
				verificarPareja();
				off1(btnNewButton_1);

			}
		});
		btnNewButton_1.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_1.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));

		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_4.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/76.png")));
				
				if(C1 ==0) {
					
					C1 = 76;
					
				}else if (C2 == 0) {
					C2 =76;
					
				} 
					
				verificarPareja();
				off1(btnNewButton_4);
			}
		});
		btnNewButton_4.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_4.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_3.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg(1).png")));
				
				if(C1 ==0) {
					
					C1 = 76;
					
				}else if (C2 == 0) {
					C2 =76;
					
				} 
					
				verificarPareja();
				off1(btnNewButton_3);
				

			}
		});
		btnNewButton_3.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_3.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		btnNewButton_3.setForeground(new Color(153, 153, 102));
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_12.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg(2).png")));
			
				if(C1 ==0) {
					
					C1 = 76;
					
				}else if (C2 == 0) {
					C2 =76;
					
				} 
					
				verificarPareja();
				off1(btnNewButton_12);

			}
		});
		btnNewButton_12.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_12.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		btnNewButton_12.setForeground(new Color(153, 153, 102));
		panel_3.add(btnNewButton_12);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_9.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg.png")));
				
				if(C1 ==0) {
					
					C1 = 1;
					
				}else if (C2 == 0) {
					C2 =1;
					
				} 
					
				verificarPareja();
				off1(btnNewButton_9);
				
				 
			}
			});
		btnNewButton_9.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_9.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_6.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg(1).png")));

			}
		});
		btnNewButton_6.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_6.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg(2).png")));

				
				if(C1 ==0) {
					
					C1 = 76;
					
				}else if (C2 == 0) {
					C2 =76;
					
				} 
					
				verificarPareja();
				off1(btnNewButton);

			}
		});
		btnNewButton.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setForeground(new Color(153, 153, 102));
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				btnNewButton_5.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg.png")));
				
				if(C1 ==0) {
					
					C1 = 1;
					
				}else if (C2 == 0) {
					C2 =1;
					
				} 		
				verificarPareja();
				off1(btnNewButton_5);

			}
		});
		btnNewButton_5.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		btnNewButton_5.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_7.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg(3).png")));
				
				
				if(C1 ==0) {
					
					C1 = 76;
					
				}else if (C2 == 0) {
					C2 =76;
					
				} 
					
				verificarPareja();
				off1(btnNewButton_7);

			}
		});
		btnNewButton_7.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		btnNewButton_7.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_8.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg(3).png")));
				
				if(C1 ==0) {
					
					C1 = 76;
					
				}else if (C2 == 0) {
					C2 =76;
					
				} 
					
				verificarPareja();
				off1(btnNewButton_8);

			}
		});
		btnNewButton_8.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		btnNewButton_8.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_2.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg(6)(2).png")));
				
				if(C1 ==0) {
					
					C1 = 76;
					
				}else if (C2 == 0) {
					C2 =76;
					
				} 
					
				verificarPareja();
				off1(btnNewButton_2);

			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		btnNewButton_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_11.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg(6)(2).png")));
				
				if(C1 ==0) {
					
					C1 = 76;
					
				}else if (C2 == 0) {
					C2 =76;
					
				} 
					
				verificarPareja();
				off1(btnNewButton_11);

			}
		});
		btnNewButton_11.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_11.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		panel_3.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_13.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg(5).png")));
if(C1 ==0) {
					
					C1 = 76;
					
				}else if (C2 == 0) {
					C2 =76;
					
				} 
					
				verificarPareja();
				off1(btnNewButton_5);

			}
		});
		btnNewButton_13.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_13.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		panel_3.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_14.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg(5).png")));
				
				if(C1 ==0) {
					
					C1 = 76;
					
				}else if (C2 == 0) {
					C2 =76;
					
				} 
					
				verificarPareja();
				off1(btnNewButton_13);

			}
		});
		btnNewButton_14.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_14.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		panel_3.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				btnNewButton_15.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg(4).png")));
				
				if(C1 ==0) {
					
					C1 = 76;
					
				}else if (C2 == 0) {
					C2 =76;
					
				} 
					
				verificarPareja();
				off1(btnNewButton_15);

			}
		});
		btnNewButton_15.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_15.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		panel_3.add(btnNewButton_15);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_10.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/pngegg(4).png")));
				
				if(C1 ==0) {
					
					C1 = 76;
					
				}else if (C2 == 0) {
					C2 =76;
					
				} 
					
				verificarPareja();
				off1(btnNewButton_10);
				
			}
		});
		
		btnNewButton_10.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_10.setIcon(new ImageIcon(Memorama.class.getResource("/imagenes/logo.2(1).jpg")));
		panel_3.add(btnNewButton_10);
		
	}

}
