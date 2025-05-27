package Gayatri;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MDemo extends Applet implements MouseListener
{
	Label l1,l2;
	int x1,y1,x2,y2;
 public void init()
 {
	 setLayout(new FlowLayout());	 
  addMouseListener(this);
 }
 public void mouseClicked(MouseEvent me)
 {	 }
 public void mousePressed(MouseEvent me)
 {	
	 x1=me.getX();
	 y1=me.getY();
 }
 public void mouseReleased(MouseEvent me)
 {
	 x2=me.getX();
	 y2=me.getY();
	  repaint();
 }
 public void mouseEntered(MouseEvent e) {	}
 public void mouseExited(MouseEvent e) {	}
 public void update(Graphics g)
 { 
	  g.setColor(Color.pink);
      g.fillOval(x1, y1, x2-x1, y2-y1);
 }
}
