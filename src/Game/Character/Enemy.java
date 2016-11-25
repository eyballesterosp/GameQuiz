package Game.Character;

import Game.Tile;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.*;

public class Enemy extends Character {

    private String name, nEnemyslevel, nSpeed, animation;
    private ArrayList<Tile> tiles;

    public Enemy(int posX, int posY, int width, int height, boolean vis, Image image) {
        super(posX, posY, width, height, vis, image);
    }

    public void MoveAttack() {//(int[] x, int[] y, int[] z)
        posY = 300;
        if (posX < 3) {
            posX = 200;
        }
        posX -= 1;
    }

    public String getName() {
        return name;
    }

    public String getnEnemyslevel() {
        return nEnemyslevel;
    }

    public String getnSpeed() {
        return nSpeed;
    }

    public String getAnimation() {
        return animation;
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
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
