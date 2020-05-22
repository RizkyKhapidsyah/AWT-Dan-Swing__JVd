package com.rk.m;

import java.awt.*;

public class M2_MenampilkanPanel extends Panel {
    public M2_MenampilkanPanel() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(0, 255, 0));
        g.setFont(new Font("Cambria", Font.PLAIN, 10));
        g.drawString("Hallo Kamu..", 30, 100);
        g.setColor(new Color(1.0f, 0, 0));
        g.fillRect(30, 100, 150, 10);
    }

    public static void main(String[] args) {
        Frame Form = new Frame("Menampilkan Graphic Panel");
        M2_MenampilkanPanel MP = new M2_MenampilkanPanel();

        Form.add(MP);
        Form.setSize(700, 400);
        Form.setVisible(true);
    }
}
