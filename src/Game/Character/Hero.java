package Game.Character;

import Game.Action;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.JOptionPane;

public class Hero extends Character {

    private String name;
    private String animation;
    private int lives;
    private int score;
    private ArrayList<Action> actions;

    public Hero(String name, String animation, int lives, int Score, ArrayList<Action> actions, int posX, int posY, int width, int height, boolean vis, Image image) {
        super(posX, posY, width, height, vis, image);
        this.name = name;
        this.animation = animation;
        this.lives = lives;
        this.score = Score;
        this.actions = actions;
    }

    public void Victory() {
        JOptionPane.showMessageDialog(null, "Has Ganado \nSu Puntaje:" + score);
    }

    public void Defeat() {
        JOptionPane.showMessageDialog(null, "Has Perdido\nSu Puntaje:" + score);
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            MoveLeft();
        }

        if (key == KeyEvent.VK_RIGHT) {
            MoveRight();

        }

        if (key == KeyEvent.VK_UP) {
            MoveUp();
        }

        if (key == KeyEvent.VK_DOWN) {
            MoveDown();
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            posX = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            posX = 0;
        }

        if (key == KeyEvent.VK_UP) {
            posY = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            posY = 0;
        }
    }

    public void MoveUp() {
        posY -= 5;
    }

    public void MoveDown() {
        posY += 5;
    }

    public void MoveLeft() {
        posX -= 5;
    }

    public void MoveRight() {
        posX += 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimation() {
        return animation;
    }

    public void setAnimation(String animation) {
        this.animation = animation;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int Score) {
        this.score = Score;
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    public void setActions(ArrayList<Action> actions) {
        this.actions = actions;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}
