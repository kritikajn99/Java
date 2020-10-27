import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.*;
import java.lang.Math;
public class D1 extends Applet implements ActionListener
{
Button b;
TextField t1;
public void init()
{
setLayout(null);
Font ff=new Font("Arial",Font.BOLD,22);
b=new Button("DICE");
b.setFont(ff);
b.setBounds(200,100,100,100);

b.setForeground(Color.red);
t1=new TextField(1);
t1.setBounds(223,230,50,50);
Font fg=new Font("Arial",Font.BOLD,35);
t1.setFont(fg);
add(b);
add(t1);
Frame title = (Frame)this.getParent().getParent();
 title.setTitle("WELCOME!!");
b.addActionListener(this);
}
public void paint(Graphics g)
{
Color c=new Color(133,212,225);
Font f=new Font("Arial",Font.BOLD,20);
setBackground(c);
g.setFont(f);
g.drawString("DICE GENERATOR",160,50);
showStatus("HAVE A GREAT DAY!");
}
public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand();
 if(ae.getSource()==b)
{
 int ran= rand();
t1.setText(String.valueOf(ran));
}
repaint();
}
int rand()
{
Random r=new Random();
int number=1+Math.abs(r.nextInt()%6);
return number;
}
}
//<applet code=D1 width=500 height=500> </applet>

