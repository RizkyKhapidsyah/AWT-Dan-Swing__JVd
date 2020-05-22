package com.rk.m;

import javax.swing.*;

public class M9_MenampilkanJOption {

    JOptionPane vOptionPane;

    public M9_MenampilkanJOption() {

    }

    void JalanlanFrame() {
        vOptionPane = new JOptionPane();
        String Nama = vOptionPane.showInputDialog("Hi, Siapakah Namamu?");
        vOptionPane.showMessageDialog(null, "Senang Bercinta Denganmu," + Nama + ".", "Salam..", vOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }

    public static void main(String[] args) {
        new M9_MenampilkanJOption().JalanlanFrame();
    }
}
