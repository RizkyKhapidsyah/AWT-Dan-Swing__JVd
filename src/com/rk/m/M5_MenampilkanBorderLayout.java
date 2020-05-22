package com.rk.m;

import java.awt.*;

public class M5_MenampilkanBorderLayout extends Frame {
    public M5_MenampilkanBorderLayout() {

    }

    public static void main(String[] args) {
        M5_MenampilkanBorderLayout BL = new M5_MenampilkanBorderLayout();
        BL.setLayout(new BorderLayout(20, 20));
        BL.add(new Button("Atas"), BorderLayout.NORTH);
        BL.add(new Button("Bawah"), BorderLayout.SOUTH);
        BL.add(new Button("Kanan"), BorderLayout.EAST);
        BL.add(new Button("Kiri"), BorderLayout.WEST);
        BL.add(new Button("Tengah"), BorderLayout.CENTER);
        BL.setSize(200, 200);
        BL.setVisible(true);
    }
}
