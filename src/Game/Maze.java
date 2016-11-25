package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Maze extends JPanel implements Runnable {

    private Thread hilo;
    private int x, y;
    ImageIcon fondo = new ImageIcon("fondo.jpg");

    public Maze() {
        setBackground(Color.WHITE);
        setDoubleBuffered(true);
    }

    @Override
    public void addNotify() {
        super.addNotify();
        //CREAMOS UN NUEVO HILO Y LO INICIAMOS
        hilo = new Thread(this);
        hilo.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g.dispose();
    }

    public void ciclo() {
        x += 1;
        y += 1;
    }

    @Override
    public void run() {
        while (true) {
            ciclo();
            repaint();

        }
    }
}
