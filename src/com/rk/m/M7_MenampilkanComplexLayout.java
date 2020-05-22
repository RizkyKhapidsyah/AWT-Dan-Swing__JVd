package com.rk.m;

import java.awt.*;

public class M7_MenampilkanComplexLayout extends Frame {
    public M7_MenampilkanComplexLayout() {

    }

    public static void main(String[] args) {
        M7_MenampilkanComplexLayout CL = new M7_MenampilkanComplexLayout();
        Panel PanelAtas = new Panel();
        Panel PanelTengah = new Panel();
        Panel PanelBawah = new Panel();

        PanelAtas.add(new Button("Satu"));
        PanelAtas.add(new Button("Dua"));
        PanelAtas.add(new Button("Tiga"));

        PanelTengah.setLayout(new GridLayout(4, 4));
        PanelTengah.add(new TextField("Juara 1"));
        PanelTengah.add(new TextField("Juara 2"));
        PanelTengah.add(new TextField("Juara 3"));
        PanelTengah.add(new TextField("Juara 4"));

        PanelBawah.setLayout(new BorderLayout());
        PanelBawah.add(new Checkbox("Pilih Saya!"), BorderLayout.CENTER);
        PanelBawah.add(new Checkbox("Saya Disini!"), BorderLayout.EAST);
        PanelBawah.add(new Checkbox("Ambil Saya!"), BorderLayout.WEST);

        CL.add(PanelAtas, BorderLayout.NORTH);
        CL.add(PanelTengah, BorderLayout.CENTER);
        CL.add(PanelBawah, BorderLayout.SOUTH);
        CL.setSize(300, 300);
        CL.setVisible(true);
    }

}
