package Game;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Game extends JFrame {

    public Game() {
        setTitle("THE BEST GAME");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        add(new Maze());
        setVisible(true);
    }

    public static void main(String args[]) {
        new Game();
    }
}
