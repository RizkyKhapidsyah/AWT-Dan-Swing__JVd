package com.rk.m;

import java.awt.*;

public class M6_MenampilkanGridLayout extends Frame {
    public M6_MenampilkanGridLayout() {

    }

    public static void main(String[] args) {
        M6_MenampilkanGridLayout GL = new M6_MenampilkanGridLayout();
        GL.setLayout(new GridLayout(2, 3, 4, 4));
        GL.add(new Button("Satu"));
        GL.add(new Button("Dua"));
        GL.add(new Button("Tiga"));
        GL.add(new Button("Empat"));
        GL.add(new Button("Lima"));
        GL.setSize(300, 300);
        GL.setVisible(true);
    }
}
