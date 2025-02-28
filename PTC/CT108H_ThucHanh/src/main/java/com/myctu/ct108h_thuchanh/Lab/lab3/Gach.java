/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Lab.lab3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Gach {

    private String maSo;

    private String mau;

    private int soLuongVienTrongHop;

    private int chieuDai;

    private int chieuRong;

    long gia;

    public Gach() {
        maSo = new String();
        mau = new String();
        soLuongVienTrongHop = 0;
        chieuDai = 0;
        chieuRong = 0;
        gia = 0;
    }

    //Hàm xây dựng sao chép
    public Gach(Gach g) {
        maSo = new String(g.maSo);
        mau = new String(g.mau);
        soLuongVienTrongHop = g.soLuongVienTrongHop;
        chieuDai = g.chieuDai;
        chieuRong = g.chieuRong;
        gia = g.gia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao ma so: ");
        maSo = sc.nextLine();
        System.out.print("Nhap vao mau: ");
        mau = sc.nextLine();
        System.out.print("Nhap vao so luong vien trong hop: ");
        soLuongVienTrongHop = sc.nextInt();
        System.out.print("Nhap vao chieu dai: ");
        chieuDai = sc.nextInt();
        System.out.print("Nhap vao chieu rong: ");
        chieuRong = sc.nextInt();
        System.out.print("Nhap vao chieu gia: ");
        gia = sc.nextInt();
    }

    public void hienThi() {
        System.out.println("Ma so: " + maSo);
        System.out.println("Mau gach: " + mau);
        System.out.println("So luong vien trong hop: " + soLuongVienTrongHop);
        System.out.println("Chieu dai x chieu rong: " + chieuDai + "x" + chieuRong);
        System.out.println("Gia gach: " + gia);
    }

    @Override
    public String toString() {
        return "Ma so: " + maSo + "\n"
                + "Mau gach: " + mau + "\n"
                + "So luong vien trong hop: " + soLuongVienTrongHop + "\n"
                + "Chieu dai x chieu rong: " + chieuDai + "x" + chieuRong + "\n"
                + "Gia gach: " + gia;
    }

    public float giaBanLe() {
//        return (float)((float)(gia/soLuongVienTrongHop)*1.2);
        return ((float) gia / soLuongVienTrongHop) * 1.2f;

    }

    public float dienTichNen() {
        return (float)(chieuDai * chieuRong * soLuongVienTrongHop);
    }

    public int soLuongHop(int d, int n) {
        return (int)Math.ceil((d * n) / dienTichNen()); 
        //Math.ceil để làm tròn lên
    }
}
