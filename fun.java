import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Color.*;
import java.awt.Color;

public class fun extends Applet implements ActionListener
{
	private static final long serialVersionUID = 1L;
  public int k;
  private int dotx;
  private int doty;
  private int redcolor;
  private int bluecolor;
  private int greencolor;
  private Color color;
  private int linex1;
  private int linex2;
  private int liney1;
  private int liney2;
  private int rectx;
  private int recty;
  private int circle1x;
  private int circle1y;
  private int circle2x;
  private int circle2y;
  
  public void init() 
  {
  setSize(600, 400);
  }
    
  public void paint(Graphics g) 
  {
  g.drawLine(0, 200, 600, 200);
  g.drawLine(300, 0, 300, 200);
  g.drawLine(100, 200, 100, 400);
  g.drawLine(500, 200, 500, 400);
    for(int k = 1; k <= 10000; k++)
      //dots
    {
    redcolor = (int) (Math.random() * 255);
    bluecolor = (int) (Math.random() * 255);
    greencolor = (int) (Math.random() * 255);
    color = new Color(redcolor, bluecolor, greencolor);
    g.setColor (color);
    dotx = (int) (Math.random() * 300);
    doty = (int) (Math.random() * 200);
    g.drawLine(dotx, doty, dotx, doty);
    }
    
    for(int k = 1; k <= 500; k++)
      //lines
    {
    g.setColor (BLUE);
    linex1 = (int) (300 + Math.random() * 300);
    linex2 = (int) (300 + Math.random() * 300);
    liney1 = (int) (Math.random() * 200);
    liney2= (int) (Math.random() * 200);
    g.drawLine(linex1, liney1, linex2, liney2);
    }
    
    for(int k = 1; k <= 100; k++)
      //rectangles
    {
    g.setColor (GREEN);
    rectx = (int) (101 + Math.random() * 359);
    recty = (int) (201 + Math.random() * 160);
    g.drawRect(rectx, recty, 40, 40);
    }
    
    for(int k = 1; k <= 100; k++)
      //circles
    {
    g.setColor (MAGENTA);
    circle1x = (int) (Math.random() * 75);
    circle1y = (int) (201 + Math.random() * 175);
    circle2x = (int) (500 + Math.random() * 75);
    circle2y = (int) (201 + Math.random() * 175);
    g.drawOval(circle1x, circle1y, 25, 25);
    g.drawOval(circle2x, circle2y, 25, 25);
    }
  }

    
  public void actionPerformed(ActionEvent e)
  {
    
    
    super.repaint();
  }
}

