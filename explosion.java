// start at zero and go up instead.
import java.awt.image.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class explosion
{
	public int x;
	public int y;
	public ImageIcon ii;
	public Image img;
	public int maxsize;
	public int count;
	public int radius;
	public int cx, cy;
	public explosion(int xpos, int ypos, int s)
	{
		x = xpos + s/2;
		y = ypos + s/2;
		ii = new ImageIcon("Images/Explosion1.png");
		img = ii.getImage();
		maxsize = s*2;
		count = 0;
		radius = 0;
		cx = xpos;
		cy = ypos;
	}
	public Image getImage()
	{
		return img;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void setX(int newx)
	{
		x = newx;
	}
	public void setY(int newy)
	{
		y = newy;
	}
	public int getSize()
	{
		return count;
	}
	public int getMaxSize()
	{
		return maxsize;
	}
	public void move()
	{
		count += 2;
		x--;
		y--;
		radius = count/2;
	}
	public int getRadius()
	{
		return radius;
	}
	public int getCenterX()
	{
		return cx;
	}
	public int getCenterY()
	{
		return cy;
	}
	public boolean inRadius(int xpoint, int ypoint)
	{
		int a = cx-xpoint;
		int b = cy-ypoint;
		double c = Math.sqrt(a*a + b*b);
		if(c < radius) return true;
		return false;
	}
}