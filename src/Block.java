import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Image;

public class Block extends Rectangle {
	
	Block(int a, int b, int w, int h, String s)
	{
		Image pic;
		x = a;
		y = b;
		width = w;
		height = h;
		pic = Toolkit.getDefaultToolkit().getImage(s);
		
	}
	
	public void Draw(Graphics g, Component c)
	{
		g.drawImage(pic, x, y, width, height, c);
	}
	

}
