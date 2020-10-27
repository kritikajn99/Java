import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class AlphaBeta extends JApplet implements ActionListener{
JButton b1,b2;
JLabel l;
public void init()
{
Font ff=new Font("Arial",Font.BOLD,22);
b1=new JButton("Alpha");
b2=new JButton("Beta");
b1.setFont(ff);
//b1.setBounds(200,100,100,100);
b2.setFont(ff);
//b2.setBounds(200,100,100,100);
l=new JLabel();
setLayout(new FlowLayout());
l.setFont(ff);
l.setForeground(Color.blue);
//l.setBounds(170,70,185,30);
getContentPane().add(b1);
getContentPane().add(b2);
 getContentPane().add(l);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
l.setText("Alpha is pressed");
}
if(e.getSource()==b2){
l.setText("Beta is pressed");
}
}
}
//<applet code=AlphaBeta width=500 height=500> </applet>