
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Button;



public class designs extends Applet implements ActionListener
{
	private static final long serialVersionUID = 1L;
  private Button previous;
  private Button next;
  private int screenNumber;
  private Font big;
  private int y1;
  private int y2;
  
  public void init() 
  {
	setSize(600,400);
    super.setLayout(null);
    previous = new Button("Previous Design");
    previous.addActionListener(this);
    previous.setBounds(195, 20, 100, 20);
    super.add(previous);
    next = new Button("Next Design");
    next.addActionListener(this);
    next.setBounds(300, 20, 100, 20);
    super.add(next);
    screenNumber = 0;
    big = new Font("Times", 1, 48);
    y1 = 0;
    y2 = 0;
  }
    
  public void paint(Graphics g) 
  {
	  int R = (int)(Math.random()*256);
	  int G = (int)(Math.random()*256);
	  int B= (int)(Math.random()*256);
	  Color color = new Color(R, G, B);
	  g.setColor(color);
    if (screenNumber == 0)
    {
      for (int x = 0; x <= 600; x += 10)
      {
        g.drawLine(x, 0, x, 400);
      }
      for (int y = 0; y <= 400; y += 10)
      {
        g.drawLine(0, y, 600, y);
      }
    }
    
    else if (screenNumber == 1)
    {
      for (int y = 0; y <= 400; y += 10)
      {
        g.drawLine(0, 200, 600, y);
      }
    }
      
    else if (screenNumber == 2)
    {
      for (int x = 0; x <= 600; x += 10)
      {
        g.drawLine(0, 0, x, 400);
      }
      for (int y = 0; y <= 600; y += 10)
      {
        g.drawLine(600, 0, y, 400);
      }
    }
      
    else if (screenNumber == 3)
    {
      for (int x = 0; x <= 600; x += 10)
      {
        g.drawLine(0, 400, x, 0);
      }
      for (int y = 0; y <= 600; y += 10)
      {
        g.drawLine(600, 400, y, 0);
      }
    }
      
    else if (screenNumber == 4)
    {
      for (int x = 0; x <= 400; x += 10)
      {
        g.drawLine(300, 200, 0, x);
      }
      for (int y = 0; y <= 400; y += 10)
      {
        g.drawLine(300, 200, 600, y);
      }
    }
      
    else if (screenNumber == 5)
    {
      for (int x = 0; x <= 600; x += 10)
      {
        g.drawLine(300, 0, x, 200);
      }
      for (int y = 0; y <= 600; y += 10)
      {
        g.drawLine(300, 400, y, 200);
      }
    }
      
    else if (screenNumber == 6)
    {
      for (int a = 0; a <= 400; a += 10)
      {
        g.drawLine(300, 200, 600, a);
      }
      for (int b = 0; b <= 600; b += 10)
      {
        g.drawLine(300, 200, b, 400);
      }
      for (int c = 0; c <= 400; c += 10)
      {
        g.drawLine(300, 200, 0, c);
      }
      for (int d = 0; d <= 600; d += 10)
      {
        g.drawLine(300, 200, d, 0);
      }
    }
      
    else if (screenNumber == 7)
    {
      y1 = 0;
      y2 = 0;
      for (int x = 0; x <= 600; x += 15)
      {
        g.drawLine(0, y1, x, 0);
        y1 = y1 + 10;
      }
      
      for (int x = 600; x >= 0; x -= 15)
      {      
        g.drawLine(600, y2, x, 0);
        y2 = y2 + 10;
      }
    }
      
    else if (screenNumber == 8)
    {
      y1 = 0;
      for (int x = 0; x <= 600; x += 15)
      {
        g.drawLine(600, y1, x, 0);
        y1 = y1 + 10;
      }
      y2 = 00;
      for (int x = 0; x <= 600; x += 15)
      {
        g.drawLine(0, y2, x, 400);
        y2 = y2 + 10;
      }
    }
      
    else if (screenNumber == 9)
    {
      g.drawOval(0, 0, 600, 400);
      for (int x = 0; x <= 600; x += 15)
      {
       g.drawOval(x, 0, 600-2*x, 400);
      }
      for (int y = 0; y <= 400; y += 15)
      {
       g.drawOval(0, y, 600, 400-2*y);
      }
    }
    
    g.setFont(big);
    g.setColor(BLACK);
    g.drawString("Design " + screenNumber, 200,300);
  }
    
  public void actionPerformed(ActionEvent e)
  {
    Button justPressed = (Button) e.getSource();
    if (justPressed == previous)
    {
      if (screenNumber <= 10 && screenNumber > 0)
      {
      screenNumber = screenNumber - 1;
      }
      else
      {
      screenNumber = 9;
      }
    }
    else if (justPressed == next)
    {
      if (screenNumber < 9 && screenNumber >= 0)
      {
      screenNumber = screenNumber + 1;
      }
      else
      {
      screenNumber = 0;
      }
    }
    super.repaint();
  }

}