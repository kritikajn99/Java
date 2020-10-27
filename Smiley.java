import java.applet.*; 
import java.awt.*; 
  
public class Smiley extends Applet { 
public void init()
{
Frame title = (Frame)this.getParent().getParent();
 title.setTitle("SMILEY!!");
}
    public void paint(Graphics g) 
    { 
         Color c=new Color(133,212,225);
          setBackground(c);
        g.fillOval(120, 120, 15, 15); 
        g.fillOval(170, 120, 15, 15); 
        g.drawArc(115, 150, 75, 50,180, 180); 
        g.drawOval(80, 70, 150, 150); 
    } 
} 

//<applet code=Smiley width=500 height=500> </applet>