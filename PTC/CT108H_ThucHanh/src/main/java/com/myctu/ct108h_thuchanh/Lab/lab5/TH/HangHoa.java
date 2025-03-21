/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Lab.lab5.TH;

/**
 *
 * @author ASUS
 */
public class HangHoa {

    private int mso;

    private String ten;

    private String nsxuat;

    public HangHoa() {
        mso = 0;

        ten = new String();

        nsxuat = new String();
    }

    public HangHoa(HangHoa h) {
        mso = h.mso;

        ten = new String(h.ten);

        nsxuat = new String(h.nsxuat);
    }

    public void nhap() {

    }

    public void in() {

    }

    public String toString() {
        return "";
    }
}
