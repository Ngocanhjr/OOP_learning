/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Lab.lab3;

import com.myctu.ct108h_thuchanh.Lab.lab2.Date;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SinhVien {

    private String mssv;

    private String hoTen;

    private Date ngSinh;

    private int n;

    private String[] mon, diem;

    private final int MAX_MON_HOC = 55;

    public SinhVien() {
        mssv = new String();
        hoTen = new String();
        ngSinh = new Date();
        n = 0;
        mon = new String[MAX_MON_HOC]; // tong so mon hoc toi da
        diem = new String[MAX_MON_HOC];
    }

    // ham xay dung sao chep
    public SinhVien(SinhVien sv) {
        mssv = new String(sv.mssv);
        hoTen = new String(sv.hoTen);
        ngSinh = new Date(sv.ngSinh);
        n = sv.n;
        mon = new String[sv.mon.length];
        diem = new String[sv.diem.length];

        for (int i = 0; i < n; i++) {
            mon[i] = new String(sv.mon[i]);
            diem[i] = new String(sv.diem[i]);
        }
    }

    @Override
    public String toString() {
        String s = ("\n [" + mssv + ", " + hoTen + ", " + ngSinh + ", {cac mon hoc: ");
        for (int i = 0; i < n; i++) {
            s += (mon[i] + ": " + diem[i] + ", ");
        }
        s += ("}");
        return s;
    }

    public void in() {
        System.out.println("\n [" + mssv + ", " + hoTen + ", " + ngSinh + ", {cac mon hoc: ");
        for (int i = 0; i < n; i++) {
            System.out.println(mon[i] + ": " + diem[i] + ", ");
        }
        System.out.println("}");
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Nhap vao ma so sinh vien: ");
        mssv = sc.nextLine();
        System.out.print("\n Nhap vao ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.print("\n Nhap vao ngay sinh vien: \n");
        ngSinh.nhap();
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\n Nhap vao so mon hoc: ");
            n = sc.nextInt();
        } while (n > MAX_MON_HOC || n < 0);
//			n = MAX_MON_HOC;
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap mon hoc thu " + (i + 1) + " : ");
            mon[i] = sc.nextLine();
            System.out.println("\nNhap diem cho mon hoc " + (i + 1) + " : ");
            diem[i] = sc.nextLine();
        }
    }

    public float diemTB() {
        float d = 0.0f;
        for (int i = 0; i < n; i++) {
            switch (diem[i]) {
                case "A" ->
                    d += 4;
                case "B+" ->
                    d += 3.5;
                case "B" ->
                    d += 3;
                case "C+" ->
                    d += 2.5;
                case "C" ->
                    d += 2;
                case "D+" ->
                    d += 1.5;
                case "D" ->
                    d += 1;
                default -> {
                }
            }
        }

        return d / n;
    }
    
    //Hàm đăng ký thêm 1 học phần cho sinh viên
    
}
