/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Lab.lab5.TH;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class KhachHang {

    private String cccd;

    private String hten;

    private String dchi;

    public KhachHang() {
        cccd = new String();
        hten = new String();
        dchi = new String();
    }

    public KhachHang(KhachHang kh) {
        cccd = new String(kh.cccd);
        hten = new String(kh.hten);
        dchi = new String(kh.dchi);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap vao cccd: ");
        cccd = sc.nextLine();
        System.out.print("Vui long nhap vao ho ten: ");
        hten = sc.nextLine();
        System.out.print("Vui long nhap vao dia chi: ");
        dchi = sc.nextLine();
    }

    public void in() {
        System.out.println("[" + cccd + ": " + hten + ", " + dchi + "]");
    }

    public String toString() {
        return "[" + cccd + ": " + hten + ", " + dchi + "]";
    }
}
