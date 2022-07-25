package com.company;

import java.awt.*;// "*" won't import the subpackages in java.awt
//java.awt package is different from java.awt.event
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleAWT extends Frame {
    public SimpleAWT(String title) {
        super(title);
        setSize(250,100);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif",Font.BOLD,18);
        Font sansSerifSmall = new Font("SansSerif",Font.BOLD,12);
        g.setFont(sansSerifLarge);
        g.drawString("Akshat Marathe",20,60);
        g.setFont(sansSerifSmall);
        g.drawString("Software Engineer, Nvidia",20,80);

    }
}
