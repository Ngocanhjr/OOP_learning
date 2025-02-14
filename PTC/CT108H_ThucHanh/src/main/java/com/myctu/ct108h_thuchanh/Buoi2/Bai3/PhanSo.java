/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Buoi2.Bai3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PhanSo {

    private int tu, mau;

    private static Scanner sc;

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void nhap() {
        sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhap tu: ");
                tu = sc.nextInt();
                System.out.print("Nhap mau: ");
                mau = sc.nextInt();
                if (mau != 0) {
                    break;
                } else {
                    System.out.println("Loii");
                }
            } catch (InputMismatchException e) {
                System.out.println("Loi nhap");
                sc.next(); // Xóa dữ liệu sai
            }
        }
    }

    public void hienThi() {
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
        if (tu == 0) {
            System.out.println("0");
        } else if (mau == 1) {
            System.out.println("Phan so: " + tu);
        } else {
            System.out.println("Phan so: " + tu + "/" + mau);
        }
    }

    public void nghichDao() {
        int temp = tu;
        tu = mau;
        mau = temp;
    }

    public PhanSo giaTriNghichDao() {
        PhanSo nghicDao = new PhanSo();
        nghicDao.tu = this.mau;
        nghicDao.mau = this.tu;
        return nghicDao;
    }

    public double giaTriThuc() {
        return (double) tu / mau;
    }

    public boolean lonHon(PhanSo a) {
        quyDong(a);
        return tu > a.tu;
    }

    private void quyDong(PhanSo a) {
        int mauChung = this.mau * a.mau;
        this.tu *= a.mau;
        a.tu *= this.mau;
        this.mau = a.mau = mauChung;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    private void toiGian() {
        int ucln = gcd(this.tu, this.mau);
        this.tu /= ucln;
        this.mau /= ucln;
    }

    public PhanSo congPS(PhanSo a) {
        PhanSo ketQua = new PhanSo();
        quyDong(a);
        ketQua.tu = this.tu + a.tu;
        ketQua.mau = this.mau;
        ketQua.toiGian();
        return ketQua;
    }

    public PhanSo congPSNguyen(int a) {
        PhanSo cong = new PhanSo();
        cong.tu = tu + a * mau;
        cong.mau = mau;
        cong.toiGian();
        return cong;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
}
