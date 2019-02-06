
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Color.*;

public class flag extends Applet implements ActionListener
{
  private static final long serialVersionUID = 1L;
  public int xc;
  public int yc;
  private int x1;
  private int y1;
  private int x2;
  private int y2;
    
  public void init() 
  {
	  setSize(640,377);
  }
    
  public void paint(Graphics g) 
  {
    g.setColor(red);
    this.stripes(g, 0, 0);
    g.setColor(blue);
    g.fillRect(0, 0, 245, 203);
    g.setColor(white);
   for (int xc = 20; xc <= 220; xc += 40)
   {
      for (int z = 20; z <= 180; z += 40)
      {
      this.star(g, xc, z, 12);
      }
   }
      for (int xc = 40; xc <= 200; xc += 40)
   {
    
      for (int q = 40; q <= 160; q += 40)
      {
          this.star(g, xc, q, 12);
      }
   }
  }
  
  public void stripes(Graphics g, int xc, int yc)
    {
       for (int y = 0; y <= 377; y += 58)
       {        
            g.fillRect(0, y, 640, 29);
       }
    }
  
  public void star(Graphics g, int xc, int yc, int radius)
  {

     for (int x = 0; x <= radius; x += 1)
     {
        x1 = (int) (xc + x * Math.cos(Math.toRadians(450)));
        y1 = (int) (yc - x * Math.sin(Math.toRadians(450)));
        x2 = (int) (xc + x * Math.cos(Math.toRadians(234)));
        y2 = (int) (yc - x * Math.sin(Math.toRadians(234)));
      g.drawLine(x1, y1, x2, y2);
        x1 = (int) (xc + x * Math.cos(Math.toRadians(234)));
        y1 = (int) (yc - x * Math.sin(Math.toRadians(234)));
        x2 = (int) (xc + x * Math.cos(Math.toRadians(378)));
        y2 = (int) (yc - x * Math.sin(Math.toRadians(378)));
      g.drawLine(x1, y1, x2, y2);
        x1 = (int) (xc + x * Math.cos(Math.toRadians(378)));
        y1 = (int) (yc - x * Math.sin(Math.toRadians(378)));
        x2 = (int) (xc + x * Math.cos(Math.toRadians(162)));
        y2 = (int) (yc - x * Math.sin(Math.toRadians(162)));
      g.drawLine(x1, y1, x2, y2);
        x1 = (int) (xc + x * Math.cos(Math.toRadians(162)));
        y1 = (int) (yc - x * Math.sin(Math.toRadians(162)));
        x2 = (int) (xc + x * Math.cos(Math.toRadians(306)));
        y2 = (int) (yc - x * Math.sin(Math.toRadians(306)));
      g.drawLine(x1, y1, x2, y2);
        x1 = (int) (xc + x * Math.cos(Math.toRadians(306)));
        y1 = (int) (yc - x * Math.sin(Math.toRadians(306)));
        x2 = (int) (xc + x * Math.cos(Math.toRadians(450)));
        y2 = (int) (yc - x * Math.sin(Math.toRadians(450)));
      g.drawLine(x1, y1, x2, y2);
     }
  }  
  
  public void actionPerformed(ActionEvent e)
  {
    
    
    super.repaint();
  }

}