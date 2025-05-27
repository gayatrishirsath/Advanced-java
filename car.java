package Gayatri;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Car extends Applet implements ActionListener
{
	Button b1,b2;
	int x,y;
 public void init()
 {
	 x=1;
	 y=200;
	 b1=new Button(">>>>");
	 b2=new Button("<<<<");
	 add(b2);
	 add(b1);
	 b1.addActionListener(this);
	 b2.addActionListener(this);
 }
 @Override
public void actionPerformed(ActionEvent ae)
 {
   if(ae.getSource()==b1)
   {
	   x=x+20;
	   repaint();
   }
   if(ae.getSource()==b2)
   {
	   x=x-20;
	   repaint();
   }
 }
 public void paint(Graphics g)
 {
	 g.drawRect(x, y, 100, 50);
	 g.drawOval(x+15, y+50, 20, 20);
	 g.drawOval(x+50, y+50, 20, 20);
 }
}
