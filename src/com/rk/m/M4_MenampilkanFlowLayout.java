package com.rk.m;

import java.awt.*;

public class M4_MenampilkanFlowLayout extends Frame {
    public M4_MenampilkanFlowLayout() {

    }

    public static void main(String[] args) {
        M4_MenampilkanFlowLayout FL = new M4_MenampilkanFlowLayout();
        FL.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        FL.add(new Button("Satu"));
        FL.add(new Button("Dua"));
        FL.add(new Button("Tiga"));
        FL.setSize(200, 200);
        FL.setVisible(true);
    }
}
