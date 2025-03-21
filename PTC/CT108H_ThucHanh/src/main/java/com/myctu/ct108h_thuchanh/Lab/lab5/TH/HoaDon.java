/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Lab.lab5.TH;

/**
 *
 * @author ASUS
 */
public class HoaDon {

    private String mso;

    private String tde;

    private String nvien;

    private KhachHang khachHang;

    private ChiTiet chiTiet[];

    private final int MAX = 50;

    public HoaDon() {
        mso = new String();
        tde = new String();
        nvien = new String();
        khachHang = new KhachHang();
        chiTiet = new ChiTiet[MAX];
    }

    public HoaDon(HoaDon d) {
        mso = new String(d.mso);
        tde = new String(d.tde);
        nvien = new String(d.nvien);
        khachHang = new KhachHang(d.khachHang);
        chiTiet = new ChiTiet[MAX];
        for (int i = 0; i < d.chiTiet.length; i++) {
            if (d.chiTiet[i] == null) { //Tai sao phai kiem tra
                break;
            }
            chiTiet[i] = new ChiTiet(d.chiTiet[i]);
        }
    }

    public void nhap() {

    }

    public void in() {

    }

    public String toString() {
        return "";
    }

    public float tong() {
        float sum = 0;

        return sum;
    }
}
