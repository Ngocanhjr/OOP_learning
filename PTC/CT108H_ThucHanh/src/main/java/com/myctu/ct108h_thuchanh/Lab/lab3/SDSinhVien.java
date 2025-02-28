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
public class SDSinhVien {

    public static void main(String[] args) {
        SinhVien s = new SinhVien();
        s.nhap();
        s.nhapDiem();
        s.in();

        System.out.println("Co bao nhieu sinh vien");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinhVien ds[] = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap sinh vien thu " + (i + 1) + " : ");
            ds[i] = new SinhVien(); // Nho cap phat boj nhow, QUAN TRONG
            ds[i].nhap();
            ds[i].nhapDiem();
        }

        System.out.println("Danh sach sinh vien vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.println("\nSinh vien thu " + (i + 1) + " : ");
            ds[i].in();
            System.out.println(", voi diem TB: " + ds[i].diemTB());
        }

        System.out.println("Danh sach sinh vien canh bao hoc vu: ");
        for (int i = 0; i < n; i++) {
            if (ds[i].diemTB() < 1) {
                ds[i].in();
            }
        }
//veef lafm bai 2
    }

}
