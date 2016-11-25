package Game.Character;

import java.awt.Image;
import java.awt.Rectangle;

public class Character {

    protected int posX;
    protected int posY;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;

    public Character(int posX, int posY, int width, int height, boolean vis, Image image) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.visible = vis;
        this.image = image;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return posX;
    }

    public int getY() {
        return posY;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean vis) {
        visible = vis;
    }

    public Rectangle getBounds() {
        return new Rectangle(posX + 1, posY + 1, width - 2, height - 2);
    }
}
