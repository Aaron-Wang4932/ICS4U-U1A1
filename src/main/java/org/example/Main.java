package org.example;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

public class Main extends JFrame {

    JLabel title;
    JTextArea text;

    public Main() {
        this.setTitle("About Me!");
        this.setPreferredSize(new Dimension(700, 500));
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x2270BD));

        title = new JLabel("all about me :>", JLabel.CENTER);
        title.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 40));
        title.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(0xB093E0), 4, true),
                "hiii welcome to",
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18),
                new Color(0xebddff)));
        title.setForeground(Color.white);

        text = new JTextArea();
        text.setEditable(false);
        text.setMargin(new Insets(15, 15, 15,15));
        text.setBackground(new Color(0x81B8FF));
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setFont(new Font("Century Gothic", Font.BOLD, 20));
        text.append("• Hi! My name is Aaron Wang.");
        text.append("\n• I go to Agincourt Collegiate Institute, at the Toronto District School Board.");
        text.append("\n• I enjoy Java the most; C++ can go away.");
        text.append("\n• I am not entirely sure about my dream job, but it is somewhere in the STEM field.");
        text.append("\n• My least favourite subject in high school is English.");
        text.append("\n• I worked my part-time job at Kumon during the summer.");



        this.add(title);
        title.setBounds(171, 20, 358, 110);
        this.add(text);
        text.setBounds(100, 150, 500, 280);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}