import java.awt.*;
import java.applet.*;

public class Applet1 extends Applet {
public void paint(Graphics g) {
Color c=new Color(249, 153, 113);
Font f=new Font("Bradley Hand ITC",Font.BOLD,20);
setBackground(c);
g.setFont(f);
showStatus("HAVE A GREAT DAY!");
int a=100;
int b=200;
int sum = a+b;
String s = "The Sum is :" + String.valueOf(sum);
g.drawString( s, 160,50);
showStatus("Have a Great Day :) ");
} }

/*Coding of HTML File <applet code = Applet1.class width= 400 height=400> </applet> */