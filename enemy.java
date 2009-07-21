import java.util.*;
import java.awt.*;
public interface enemy
{
	public int getX();
	public int getY();
	public int getSize();
	public void takeDamage();
	public int getHP();
	public int getMaxHealth();
	public int getLevel();
	public ArrayList<missile> getMissiles();
	public void move();
	public Image getImage();
	public void takePartDamage();
	public int getHealth();
}

// import java.awt.image.*;
// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// import java.util.*;
// public class enemy
// {
// 	int level; // level of enemy it is (higher is stronger)
// 	ImageIcon ii; 
// 	Image img; // different images for each enemy
// 	int xpos; // current x position
// 	int ypos; // current y position
// 	ArrayList<missile> missiles = new ArrayList<missile>();
// 	int hitpoints;
// 	int hitpointfrac = 0;
// 	int reloadtime = 0;
// 	int size = 0;
// 	public enemy(int l, int x, int y)
// 	{
// 		level = l;
// 		hitpoints = l*(l-1) + 1;
// 		xpos = x;
// 		ypos = y;
// 		ii = new ImageIcon("Images/enemy.png");
// 		img = ii.getImage();
// 	}
// 	public int getMaxHealth()
// 	{
// 		return level*(level-1)+1;
// 	}
// 	public int getHealth()
// 	{
// 		return hitpoints;
// 	}
// 	public int getLevel()
// 	{
// 		return level;
// 	}
// 	public Image getImage()
// 	{
// 		return img;
// 	}
// 	public void takeDamage()
// 	{
// 		hitpoints--;
// 	}
// 	public void takePartDamage()
// 	{
// 		hitpointfrac++;
// 		if(hitpointfrac >= 5)
// 		{
// 			hitpoints--;
// 			hitpointfrac = 0;
// 		}
// 	}
// 	public int getHP()
// 	{
// 		return hitpoints;
// 	}
// 	public int getX()
// 	{
// 		return xpos;
// 	}
// 	public int getY()
// 	{
// 		return ypos;
// 	}
// 	public void setX(int x)
// 	{
// 		xpos = x;
// 	}
// 	public void setY(int y)
// 	{
// 		ypos = y;
// 	}
// 	public void move() // moves based on level
// 	{
// 		xpos -= (level+1);
// 		fire();
// 		// hitting other stuff
// 		// stops after going off screen.
// 	}
// 	public void fire()
// 	{
// 		// fires based on level
// 		int rand = (int)(Math.random()*100) + 1;
// 		if(rand >= 100-(level) && reloadtime > 5)
// 		{
// 			if(missiles.size() < level)
// 				missiles.add(new missile(xpos,ypos+20,"Left"));
// 			reloadtime = 0;
// 		}
// 		else reloadtime++;
// 	}
// 	
// 	public ArrayList<missile> getMissiles()
// 	{
// 		return missiles;
// 	}
// 	
// 	public int getSize()
// 	{
// 		return size;
// 	}
// }	