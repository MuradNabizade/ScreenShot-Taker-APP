package com.muradn;



import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {
    static JButton button;
    static JFrame obj;

    public static void main(String[] args) {
//        Thread.sleep(2);

        //Window
        obj = new JFrame();
        Play gamePlay = new Play();

        button=  new JButton();
        button.setBounds(230,10,140,30);
        button.setText("Capture");
        button.setBackground(new Color(46, 58, 65));
        button.addActionListener(new Action());

        button.addActionListener(new Action());

        obj.setBounds(10, 10, 600, 300);
        obj.setTitle("Capture ScreenShot");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(button);

        obj.add(gamePlay);

        obj.setVisible(true);
    }

        static class Action implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("QOL");
                try {
                    Robot robot = new Robot();
                    Rectangle rectangle = new Rectangle(0, 0, 1920, 1080);
                    BufferedImage screenshot = robot.createScreenCapture(rectangle);
                    //Note: We have to give them unreal name generate name for new Screenshots.
                    ImageIO.write(screenshot, "JPG", new File("/Users/muradnabizade/Desktop/screenshotRR.jpg"));

                    JFrame frame2 =new JFrame();
                    frame2.setVisible(false);
                    frame2.setSize(200,200);
                    JLabel label=new JLabel("Success");
                    JPanel panel3=new JPanel();
                    panel3.add(label);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        }




}

