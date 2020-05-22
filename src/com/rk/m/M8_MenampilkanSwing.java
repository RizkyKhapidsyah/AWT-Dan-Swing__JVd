package com.rk.m;

import javax.swing.*;
import java.awt.*;

public class M8_MenampilkanSwing {

    JFrame vFrame;
    JPanel vPanel;
    JTextField vTextField;
    JButton vButton;
    Container vContentPane;

    public M8_MenampilkanSwing() {

    }

    void JalankanFrame() {
        vFrame = new JFrame("Swing Application");
        vPanel = new JPanel();
        vTextField = new JTextField("Default Text");
        vButton = new JButton("Pijit Saya!");

        vContentPane = vFrame.getContentPane();

        vPanel.add(vTextField);
        vPanel.add(vButton);
        vContentPane.add(vPanel, BorderLayout.CENTER);
        vFrame.pack();
        vFrame.setVisible(true);
    }

    public static void main(String[] args) {
        M8_MenampilkanSwing MS = new M8_MenampilkanSwing();
        MS.JalankanFrame();
    }
}
