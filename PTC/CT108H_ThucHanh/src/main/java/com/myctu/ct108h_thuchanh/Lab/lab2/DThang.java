/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Lab.lab2;

/**
 *
 * @author ASUS
 */
public class DThang {

    private Diem d1, d2;

    //Goi Ham Xay Dung sao chep
    public DThang() {
        d1 = new Diem();
        d2 = new Diem();
    }

    public DThang(Diem d11, Diem d22) {
        d1 = new Diem(d11);
        d2 = new Diem(d22);
    }

    public DThang(DThang dt) {
        d1 = new Diem(dt.d1);
        d2 = new Diem(dt.d2);
    }

    public String toString() {
        return "[" + d1 + ";" + d2 + "]";
        //cung y nghia voi return "[" + d1.toString + ";" + d2.toString + "]";
    }

    public void in() {
        System.out.println("[" + d1 + ";" + d2 + "]");
    }

    public void nhap() {
        System.out.println("Nhap toa do d1: ");
        d1.nhap();
        System.out.println("Nhap toa do d2: ");
        d2.nhap();
    }

    public float kcach() {
        return d1.kcach(d2);
    }

    public void ttien(int dx, int dy) {
        d1.ttien(dx, dy);
        d2.ttien(dx, dy);
    }

}
