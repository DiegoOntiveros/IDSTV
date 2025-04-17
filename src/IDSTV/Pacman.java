package IDSTV;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JFrame;

public class Pacman extends JFrame {
    private int x = 100;
    private int y = 60;
    private List<player> paredes = new ArrayList<>();
    private List<Bolita> bolitas = new ArrayList<>(); // Lista de bolitas
    private int lastPress = 'd';
    private Timer timer;
    private Timer timeCounter; // Contador de tiempo
    private int elapsedTime = 0; // Tiempo transcurrido en segundos
    private JPanel panel_center;
    private JLabel timeLabel; // Etiqueta para mostrar el tiempo
    private JLabel scoreLabel;
    private Puntaje puntaje = new Puntaje();


    // Mapa del juego adaptado
    int[][] matrixdraw = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0},
        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
        {1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1},
        {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1},
        {1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1},
        {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
        {1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1},
        {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
        {1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1},
        {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1},
        {1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

    public Pacman() {
        this.setTitle("Pacman");
        this.setSize(1280, 720);

        JPanel panel_norte = new JPanel();
        panel_norte.setBackground(Color.blue);
        timeLabel = new JLabel("Tiempo: 0 s");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        timeLabel.setForeground(Color.WHITE);
        panel_norte.add(timeLabel);
        scoreLabel = new JLabel("Puntos: 0");
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 18));
        scoreLabel.setForeground(Color.WHITE);
        panel_norte.add(scoreLabel);
        this.add(panel_norte, "North");

        JPanel panel_south = new JPanel();
        panel_south.setBackground(Color.MAGENTA);
        this.add(panel_south, "South");

        panel_center = new dibujo();
        panel_center.setBackground(Color.black);
        this.add(panel_center, "Center");

        loadMap();

        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                lastPress = e.getKeyChar();
            }
        });

        timer = new Timer(100, e -> update());
        timer.start();

        timeCounter = new Timer(1000, e -> {
            elapsedTime++;
            timeLabel.setText("Tiempo: " + elapsedTime + " s");
        });
        timeCounter.start();

        this.setVisible(true);
    }

    private void loadMap() {
        int cellWidth = 98;
        int cellHeight = 50;

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                if (matrixdraw[i][j] == 1) {
                    paredes.add(new player(j * cellWidth, i * cellHeight, cellWidth, cellHeight, Color.orange));
                } else if (matrixdraw[i][j] == 0) {
                    bolitas.add(new Bolita(j * cellWidth + cellWidth / 2 - 5, i * cellHeight + cellHeight / 2 - 5, 10));
                }
            }
        }
    }
    
    //Movimiento del pacman 
    public void update() {
        int pacmanSize = 40;
        int newX = x;
        int newY = y;

        if (lastPress == 'd') {
            newX += 15;
        }
        if (lastPress == 'a') {
            newX -= 15;
        }
        if (lastPress == 'w') {
            newY -= 15;
        }
        if (lastPress == 's') {
            newY += 15;
        }
        if (!checkCollision(newX, newY)) {
            x = newX;
            y = newY;
        }
        // que el pacman salga al otro lado
        if (x < 0) {
            x = getWidth() - pacmanSize; 
        } else if (x + pacmanSize > getWidth()) {
            x = 0; 
        }
        
       // Verificar si Pacman come una bolita:
     // Verificar si Pacman come una bolita (colisión por distancia) y sumar 2 puntos
        for (int i = 0; i < bolitas.size(); i++) {
            Bolita b = bolitas.get(i);
            // Centros
            int pcX = newX + pacmanSize/2;
            int pcY = newY + pacmanSize/2;
            int bdX = b.x + b.size/2;
            int bdY = b.y + b.size/2;
            // Distancia al cuadrado
            int dx = pcX - bdX, dy = pcY - bdY;
            int distSq = dx*dx + dy*dy;
            int radSum = pacmanSize/2 + b.size/2;
            if (distSq <= radSum*radSum) {
                bolitas.remove(i);
                puntaje.addPoints(2);
                scoreLabel.setText("Puntos: " + puntaje.getPuntos());
                break;
            }
        }



        panel_center.repaint();
        //PANEL DE VICTORIA DESPOUES DE COMER TODAD LAS BOLITAS:
        if (bolitas.isEmpty()) {
            // Detener los temporizadores
            timer.stop();
            timeCounter.stop();
            // Mostrar diálogo de victoria
            JOptionPane.showMessageDialog(this,
                "Victoria :D, Has comido todas las bolitas.","Juego Terminado",
                JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

    }
    

    public boolean checkCollision(int newX, int newY) {
        int pacmanSize = 30;
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

    class dibujo extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;

            g2d.setColor(Color.YELLOW);
            g2d.fillOval(x, y, 40, 40);

            for (player wall : paredes) {
                g2d.setColor(wall.c);
                g2d.fillRect(wall.x, wall.y, wall.w, wall.h);
            }

            g2d.setColor(Color.WHITE);
            for (Bolita bolita : bolitas) {
                g2d.fillOval(bolita.x, bolita.y, bolita.size, bolita.size);
            }
        }
    }

    class player {
        int x, y, w, h;
        Color c;

        public player(int x, int y, int w, int h, Color c) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.c = c;
        }
    }

    class Bolita {
        int x, y, size;

        public Bolita(int x, int y, int size) {
            this.x = x;
            this.y = y;
            this.size = size;
        }
    }
 // Clase Puntaje
    class Puntaje {
        private int puntos = 0;
        public void addPoints(int pts) {
            puntos += pts;
        }
        public int getPuntos() {
            return puntos;
        }
    }

    public static void main(String[] args) {
        new Pacman();
    }
}
