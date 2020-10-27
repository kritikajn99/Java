import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Applet2_sum extends Applet implements ActionListener
{
Button b;
TextField t1;
TextField t2;
TextField t3;
public void init( )
{
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
Font ff=new Font("Arial",Font.BOLD,35);
b=new Button("Add");
b.setFont(ff);
Font fg=new Font("Arial",Font.BOLD,35);
t1.setFont(fg);
t2.setFont(fg);
add(t1);
add(t2);
add(b);
t3.setFont(fg);
add(t3);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String s1=t1.getText();
int a=Integer.parseInt(s1);
String s2=t2.getText();
int b=Integer.parseInt(s2);
int c=a+b;
t3.setText(Integer.toString(c));
}
}
/*
<applet code=Applet2_sum width=400 height=400>
</applet>
*/