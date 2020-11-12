package com.jetbrains;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


public class App8i2 extends JFrame {
    private JPanel MainPanel;
    private ImageIcon image1;
    private ImageIcon image2;
    private ImageIcon image3;
    private ImageIcon image4;
    private JLabel label1;
    private JLabel label2;
    private JLabel label4;
    private JLabel label3;

    App8i2(){
        setLayout(new FlowLayout());
        image1 = new ImageIcon("1.jpg");
        label1 = new JLabel(image1);
        image2 = new ImageIcon("2.jpg");
        label2 = new JLabel(image2);
        image3 = new ImageIcon("3.jpg");
        label3 = new JLabel(image3);
        image4 = new ImageIcon("4.jpg");
        label4 = new JLabel(image4);
        add(label1);
        add(label2);
        add(label3);
        add(label4);

        setTitle("Lab#8.2");
        add(MainPanel);

        setSize(450, 150);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }


}
