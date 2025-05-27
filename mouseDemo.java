package Gayatri;

import java.awt.event.*;
import java.awt.*;

public class mouseDemo extends Frame implements MouseListener
{
    Label l1;
    int x, y;

    mouseDemo()
    {
        setSize(400, 400);
        setLayout(new FlowLayout());
        l1 = new Label("Mouse x and y position");
        add(l1);
        addMouseListener(this);

        setVisible(true); 
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        l1.setText("x position = " + x + ", y position = " + y);
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        // Optional implementation
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        // Optional implementation
    }

    @Override
    public void mouseExited(MouseEvent me) {
        // Optional implementation
    }

    public static void main(String[] args) {
        new mouseDemo();
    }
}
