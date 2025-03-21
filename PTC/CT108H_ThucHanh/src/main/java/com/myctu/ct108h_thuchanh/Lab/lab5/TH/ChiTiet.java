/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Lab.lab5.TH;

/**
 *
 * @author ASUS
 */
public class ChiTiet {

    private int sluong;

    private float dgia;

    private HangHoa hangHoa;

    public ChiTiet() {
        sluong = 0;
        dgia = 0;
        hangHoa = new HangHoa();
    }

    public ChiTiet(ChiTiet t) {
        sluong = t.sluong;
        dgia = t.dgia;
        hangHoa = new HangHoa(t.hangHoa);
    }

    public void nhap() {

    }

    public void in() {

    }

    public String toString() {
        return "";
    }

}
