package Gayatri;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ListtDemo extends Applet implements ActionListener {
    List lst1;
    TextField t1;
    Button b1, b2, b3;
    Label l1, l2;

    public void init() {
        setLayout(new GridLayout(4, 2));
        l1 = new Label("Enter product");
        l2 = new Label("Product list");
        t1 = new TextField(10);
        lst1 = new List(10);
        b1 = new Button("ADD");
        b2 = new Button("CLEAR");
        b3 = new Button("REMOVE");

        add(l1);
        add(t1);
        add(l2);
        add(lst1);
        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == b1)
        {
            String s = t1.getText();
            if (!s.isEmpty()) 
            {
                lst1.add(s);
            }
        } 
        else if (ae.getSource() == b2)
        {
            lst1.clear();
        } 
        else if (ae.getSource() == b3)
        {
            String s = lst1.getSelectedItem();
            if (s != null) 
            {
                lst1.remove(s);
            }
        }
    }
}
