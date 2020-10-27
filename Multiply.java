import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.*;
public class Multiply extends Applet implements ActionListener
{
Button b;
TextField t1,t2;
Label l1;
public void init()
{
setLayout(null);
Font ff=new Font("Arial",Font.BOLD,22);
l1=new Label("Enter the number:");
l1.setFont(ff);
l1.setForeground(Color.blue);
l1.setBounds(170,70,185,30);
add(l1);
t1=new TextField(20);
t1.setBounds(232,100,50,30);
t1.setFont(ff);
add(t1);
b=new Button("SUM");
b.setFont(ff);
b.setBounds(215,150,100,35);
b.setForeground(Color.blue);
add(b);
t2=new TextField(20);
t2.setBounds(219,200,80,30);
t2.setFont(ff);
add(t2);
Frame title = (Frame)this.getParent().getParent();
 title.setTitle("SUM OF NATURAL NUMBERS");
b.addActionListener(this);
}
public void paint(Graphics g)
{
Color c=new Color(249, 153, 113);
Font f=new Font("Arial",Font.BOLD,20);
setBackground(c);
g.setFont(f);
g.drawString("NATURAL NUMBERS",160,50);
showStatus("HAVE A GREAT DAY!");
}
public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand();
 if(ae.getSource()==b)
{
int rand=rand(Integer.parseInt(t1.getText()));
t2.setText(String.valueOf(rand));
}
repaint();
}
int rand(int f)
{
int sum=0;
for(int i=1;i<=f;i++)
{
sum=sum+i;
}
return sum;
}
}
//<applet code=Multiply width=500 height=500> </applet>

