import java.awt.*;
import java.awt.event.*;
public class ActionFrame1 extends Frame implements ActionListener
{
Button b1;
 public ActionFrame1()
{
super(" Swing Frame");
b1=new Button("click here");
add(b1);
b1.addActionListener(this);
setBounds(10,10,400,400);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if (ae.getSource()==b1)
b1.setLabel("PRESSED");
}
public static void main(String a[])
{
new ActionFrame1();
}
}
/*
<applet code=Action1Frame.class width=400 height=400>
</applet>
*/