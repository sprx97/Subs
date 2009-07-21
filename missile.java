import java.awt.image.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class missile {
	ImageIcon ii;
	Image img;
	int xpos;
	int ypos;
	int width;
	int height;
	String direction;
	public missile(int subx, int suby, String d) {
		if (d.equals("Left")) {
			ii = new ImageIcon("Images/missile-left.png");
			width = 30;
			height = 10;
		}
		else if (d.equals("Right")) {
			ii = new ImageIcon("Images/missile-right.png");
			width = 30;
			height = 10;
		}
		else if (d.equals("DownRight")) {
			ii = new ImageIcon("Images/Missile-UpRight.png");
			width = 30;
			height = 30;
		}
		else {
			ii = new ImageIcon("Images/Missile-DownRight.png");
			width = 30;
			height = 30;
		}
		img = ii.getImage();
		xpos = subx;
		ypos = suby;
		direction = d;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public boolean move() {
		if (direction.equals("Right")) xpos += 20;
		if (direction.equals("Left")) xpos -= 20;
		if (direction.equals("Up")) ypos -= 20;
		if (direction.equals("Down")) ypos += 20;
		if (direction.equals("DownRight")) {
			xpos += (int)(20 * Math.cos(50));
			ypos += (int)(20 * Math.sin(50));
		}
		if (direction.equals("UpRight")) {
			xpos += (int)(20 * Math.cos(50));
			ypos -= (int)(20 * Math.sin(50));
		}
		if (xpos > 1200 || xpos < 0 || ypos < 0 || ypos > 750)
			return false;
		return true;
		// if xpos or ypos hit another unit explode.
		// stop after going off the screen
	}
	public Image getImage() {
		return img;
	}
	public String getDir() {
		return direction;
	}
	public void setX(int x) {
		xpos = x;
	}
	public void setY(int y) {
		ypos = y;
	}
	public int getX() {
		return xpos;
	}
	public int getY() {
		return ypos;
	}
}
