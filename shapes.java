
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;
import java.awt.Font;
import java.awt.Button;
import java.awt.Choice;
import java.awt.TextArea;


public class shapes extends Applet implements ActionListener
{
	private static final long serialVersionUID = 1L;
private Choice ddMenu;
private TextArea out;
private Button go;
private TextField size;
private Font monospaced_20;
public int a;
public int b;
public String stringB;
private String output;
private int a5;
  
  public void init() 
  {
	setSize(600, 400);
    super.setLayout(null);
    monospaced_20 = new Font("Monospaced", 1, 20);
    ddMenu = new Choice();
    ddMenu.add("Choose A Design...");
    ddMenu.add("1. Square");
    ddMenu.add("2. Increasing Triangle");
    ddMenu.add("3. Decreasing Triangle");
    ddMenu.add("4. 3*x Triangle");
    ddMenu.add("5. 2*x Triangle");
    ddMenu.add("6. Border Square");
    ddMenu.setBounds(300, 15, 200, 25);
    super.add(ddMenu);
    
    out = new TextArea();
    out.setText("Waiting...");
    out.setBounds(10, 100, 575, 300);
    super.add(out);
    out.setFont(monospaced_20);
    
    go = new Button("Go!");
    go.addActionListener(this);
    go.setBounds(520, 10, 45, 25);
    super.add(go);
    
    size = new TextField();
    size.setBounds(150, 10, 100, 35);
    super.add(size);
    size.setFont(monospaced_20);
    
  }
    
  public void paint(Graphics g) 
  {
  g.setFont(monospaced_20);
  g.drawString("Size:",50, 30);
  }
    
    
  public void actionPerformed(ActionEvent e)
  {
    Button justPressed = (Button) e.getSource();
      if (justPressed == go)
        {
          int a = ddMenu.getSelectedIndex();
          String stringB = size.getText();
          int b = Integer.parseInt(stringB);
          
          if (a == 1)
          {
            output="";
            for (int x = 1; x <= b; x += 1)
               {
                  for (int y = 1; y <= b; y += 1)
                  {
                    output+=("1");
                  }
                  output+=("\n");
               }
              out.setText(output);
          }
           
          else if (a == 2)
          {
            output="";
            for (int x = 1; x <= b; x += 1)
               {
                  for (int y = 1; y <= x; y += 1)
                  {
                    output+=("2");
                  }
                  output+=("\n");
               }
              out.setText(output);
          }
           
          else if (a == 3)
          {
            output="";
            for (int x = 1; x <= b; x += 1)
               {
                  for (int y = b; y >= x; y -= 1)
                  {
                    output+=("3");
                  }
                  output+=("\n");
               }
              out.setText(output);
          }
          
          
          else if (a == 4)
          {
            output="";
            for (int x = 1; x <= b; x += 3)
               {
                  for (int y = b; y >= x; y -= 1)
                  {
                    output+=("4");
                  }
                  output+=("\n");
               }
              out.setText(output);
          }
          
          
          else if (a == 5)
          {
            output="";
            a5 = 1;
            for (int x = 1; x <= b; x += 1)
               {
                  for (int y = 1; y <= a5; y += 1)
                  {
                    output+=("5");
                  }
                  output+=("\n");
               a5 *= 2;
               }
              out.setText(output);
          }
          
          
          else if (a == 6)
          {
            output="";
            for (int x = 1; x <= (b); x += 1)
               {
                if (x == 1 || x == b)
                {
                 for (int y = 1; y <= b; y += 1)
                 { 
                 output+=(6);
                 
                 }
                  output+=("\n");
                }
                else
                {
                 output+=(6);
                  for (int y = 1; y <= b-2; y += 1)
                  {
                    output+=(".");
                  }
                    output+=("6");
                  output+=("\n");
                }
               }
              out.setText(output);
          }
          
          
        }
    
    super.repaint();
  }

}