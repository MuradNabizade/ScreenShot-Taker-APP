package com.muradn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Play extends JPanel implements KeyListener, ActionListener {
    private Timer time;
    private int delay= 100;

    Image imgCar = Toolkit.getDefaultToolkit().createImage("/Users/muradnabizade/Desktop/Daco_5666117.png");


    public Play(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        time=new Timer(delay,this);
        time.start();//
    }

    public void paint(Graphics g) {
        g.setColor(new Color(42, 65, 61));
        g.fillRect(1,1,1400,960);

        g.drawImage(imgCar, 10, 10, null);

        g.setColor(new Color(255, 84, 49));
        g.setFont(new Font("Open Sans Condensed",Font.BOLD,25));
        g.drawString("Press Capture button to take a screenshot",0,65);

        g.dispose();
    }
        @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
