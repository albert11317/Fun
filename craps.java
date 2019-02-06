import java.awt.Button;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.Color.*;


public class craps extends Applet implements ActionListener
{
private static final long serialVersionUID = 1L;
  public int x;
  public int y;
  private int x1;
  private int y1;
  private int x2;
  private int y2;
  private int loss;
  private int win;
  public int die;
  private int numSpots1;
  private int numSpots2;
  private Button reset;
  private Button roll;
  private int phase;
  private int point;
  public Graphics g;
  private String print;
  
  
  
  
  
  
  
  public void init() 
  {
	setSize(600, 400);
    reset = new Button("Reset");
    roll = new Button("Roll");
    reset.addActionListener(this);
    roll.addActionListener(this);
    super.add(reset);
    super.add(roll);
    x = (int) (Math.random() * 190);
    y = (int) (Math.random() * 290);
    numSpots1 = 0;
    numSpots2 = 0;
    win = 0;
    loss = 0;
    phase = 0;
    point = 0;
    print = "Roll the Dice!";
  }
  
  
  
  
  
  
  
  public void paint(Graphics g) 
  {
    if (phase == 0)
    {
  g.drawString(print, 10, 10);
  g.drawString("Win:"+win+" Loss:" + loss, 500, 10);
    }
    else
    {

  g.drawString("Win:"+win+" Loss:" + loss, 500, 10);
  g.drawString(print, 10, 10);
    this.drawDie(g, x1, y1, numSpots1);
    this.drawDie(g, x2, y2, numSpots2);
    }
    
  }
 
  
  
  
  
  
  
  
  
  
  
  
  
  public void actionPerformed(ActionEvent e)
  {
    Button justPressed = (Button) e.getSource();
    if (justPressed == roll)
    {
      x1 = (int) (Math.random() * 190);
      y1 = (int) (Math.random() * 290);
      x2 = (int) (300 + Math.random() * 190);
      y2 = (int) (Math.random() * 290);
      numSpots1 = (int) (1 + Math.random() * 6);
      numSpots2 = (int) (1 + Math.random() * 6);
      if (phase == 0)
      {
            if (numSpots1 + numSpots2 == 7 || numSpots1 + numSpots2 == 11)
            {
              win = win+1;
              phase = 1;
              print = "You win by rolling a " + (numSpots1+numSpots2) + "!";
              point = 0;
      reset.setEnabled(true);
      roll.setEnabled(false);
            }
            else if (numSpots1 + numSpots2 == 2 || numSpots1 + numSpots2 == 3 || numSpots1 + numSpots2 == 12)
            {
              phase = 2;
              print = "You Lose " + (numSpots1+numSpots2) + "!";
              loss = loss+1;
              point = 0;
      reset.setEnabled(true);
      roll.setEnabled(false);
            }
            else if (numSpots1 + numSpots2 >= 4 && numSpots1 + numSpots2 <= 6 || numSpots1 + numSpots2 >= 8 && numSpots1 + numSpots2 <= 10)
            {
              phase = 3;
              point =  numSpots1 + numSpots2;
              print = "Your point is "+point;
              reset.setEnabled(false);
            }
    }
    else if (phase == 3)
    {
      if (numSpots1 + numSpots2 == 7)
        {
        phase = 4;
        print = "You lose by rolling a " + (numSpots1+numSpots2) + "!";
        loss = loss+1;
        point = 0;
      reset.setEnabled(true);
      roll.setEnabled(false);
        }
      else if (numSpots1 + numSpots2  == point)
        {
         win = win+1;
         phase = 5;
         print = "You win by rolling a " + (numSpots1+numSpots2) + "!";
         point = 0;
      reset.setEnabled(true);
      roll.setEnabled(false);
        }
      else
        {
         phase = 3;
        }
    }
    }
    else if (justPressed == reset)
    {
    phase = 0;
      print = "Roll the Dice!";
      roll.setEnabled(true);
    }
  
    super.repaint();
  }
 
  
  
  
  
  
  
  
  public void drawDie(Graphics g, int x, int y, int numSpots)
  {
  g.setColor(RED);
  g.fillRoundRect(x,y,110,110,20,20);
  g.setColor(BLACK);
  if (numSpots == 1)
  {
  g.fillOval(x+40, y+40, 30, 30);
  }
  if (numSpots == 2)
  {
  g.fillOval(x+10, y+10, 30, 30);
  g.fillOval(x+70, y+70, 30, 30);
  }
  if (numSpots == 3)
  {
  g.fillOval(x+10, y+10, 30, 30);
  g.fillOval(x+40, y+40, 30, 30);
  g.fillOval(x+70, y+70, 30, 30);
  } 
  if (numSpots == 4)
  {
  g.fillOval(x+10, y+10, 30, 30);
  g.fillOval(x+70, y+10, 30, 30);  
  g.fillOval(x+10, y+70, 30, 30);  
  g.fillOval(x+70, y+70, 30, 30);
  }  
  if (numSpots == 5)
  {
  g.fillOval(x+10, y+10, 30, 30);
  g.fillOval(x+70, y+10, 30, 30);  
  g.fillOval(x+40, y+40, 30, 30);  
  g.fillOval(x+10, y+70, 30, 30);  
  g.fillOval(x+70, y+70, 30, 30);
  }  
  if (numSpots == 6)
  {
  g.fillOval(x+10, y+10, 30, 30);  
  g.fillOval(x+70, y+10, 30, 30);  
  g.fillOval(x+10, y+40, 30, 30);  
  g.fillOval(x+70, y+40, 30, 30);  
  g.fillOval(x+10, y+70, 30, 30);  
  g.fillOval(x+70, y+70, 30, 30);
  }  
  }
}