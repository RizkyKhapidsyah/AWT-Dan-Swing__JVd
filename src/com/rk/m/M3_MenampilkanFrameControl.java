package com.rk.m;

import java.awt.*;

public class M3_MenampilkanFrameControl extends Frame {
    public M3_MenampilkanFrameControl() {

    }

    public static void main(String[] args) {
        M3_MenampilkanFrameControl MFC = new M3_MenampilkanFrameControl();
        MFC.setLayout(new FlowLayout());
        MFC.setSize(600, 600);
        MFC.add(new Button("Pijit Saya"));
        MFC.add(new Label("Ini Merupakan Label"));
        MFC.add(new TextField());

        CheckboxGroup CbG = new CheckboxGroup();
        MFC.add(new Checkbox("Indonesia", CbG, true));
        MFC.add(new Checkbox("Malaysia", CbG, true));
        MFC.add(new Checkbox("Thailand", CbG, true));

        List L = new List(3, false);
        L.add("Rizky Khapidsyah");
        L.add("Dessy Puspita Sari");
        L.setSize(300,200);
        MFC.add(L);

        Choice C = new Choice();
        C.add("Gelas");
        C.add("Piring");
        C.add("Sendok");
        MFC.add(C);
        MFC.add(new Scrollbar());
        MFC.setVisible(true);

    }
}
