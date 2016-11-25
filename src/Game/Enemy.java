package Game;

/**
 *
 * @author Yesid
 */
public class Enemy {

    private int dx;
    private int dy;

    public Enemy(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public void move() {
        int x = (int) Math.random();
        System.out.println(x);
    }
    public static void main(String[] args) {
        System.out.println();
        Enemy m = new Enemy(2,1);
        m.move();
    }
}
