/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Buoi2.Bai2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Date {

    private int ngay, thang, nam;

    private final int LIMITED_MONTH = 13;

    private static Scanner sc = new Scanner(System.in);

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Date.sc = sc;
    }

    //Contructor
    public Date() {
    }

    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    //Hàm hiển thị thông tin ngày ra màn hình. 
    public void hienThiNgay() {
        System.out.println("Ngay hien tai: " + ngay + "/" + thang + "/" + nam);
    }

    //Hàm nhập giá trị từ bàn phím, nếu không hợp lệ thì yêu cầu nhập lại. 
    public int getDate() {
        boolean check = false;
        int ngay = 0;
        do {
            try {
                ngay = sc.nextInt();
                check = true;
            } catch (InputMismatchException e) {
                System.out.println("Error. Please try again!.");
                sc.nextLine();
            }
        } while (!check);
        return ngay;
    }

    public void nhap() {
        System.out.println("Nhap vao ngay thang nam: ");

        while (true) {
            ngay = getDate();
            thang = getDate();
            nam = getDate();
            if (hopLe(ngay, thang, nam)) {
                break;
            } else {
                System.out.println("Error. Invalid day, month, or year.!");
            }
        }
    }

    protected boolean hopLe(int ngay, int thang, int nam) {
        if (nam > 0 && thang >= 1 && thang <= 12) {
            int[] ngayTrongThang = {0, 31, isNamNhuan(nam) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (ngay >= 1 && ngay <= ngayTrongThang[thang]) {
                return true;
            }
        }
        return false;
    }

    private boolean isNamNhuan(int nam) {
        if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
            return true;
        }
        return false;
    }

    //Hàm tính ra ngày hôm sau là ngày nào.
    public void ngayHomSau() {
        int[] ngayTrongThang = {0, 31, isNamNhuan(nam) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Date nextDate = new Date(ngay + 1, thang, nam);
        if (nextDate.ngay > ngayTrongThang[nextDate.thang]) {
            nextDate.ngay = 1;
            nextDate.thang += 1;
        }
        if (nextDate.thang == LIMITED_MONTH) {
            nextDate.thang = 1;
            nextDate.nam += 1;
        }

        System.out.println("Ngay hom sau: " + nextDate.ngay + "/" + nextDate.thang + "/" + nextDate.nam);

    }

    //Hàm cộng 1 Date với số ngày n nào đó
    public void congNgay(int n) {
        int[] ngayTrongThang = {0, 31, isNamNhuan(nam) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Date nextDate = new Date(ngay + n, thang, nam);

        while (nextDate.ngay > ngayTrongThang[nextDate.thang]) {
            nextDate.ngay = nextDate.ngay - ngayTrongThang[nextDate.thang];
            nextDate.thang += 1;
            if (nextDate.thang == LIMITED_MONTH) {
                nextDate.thang = 1;
                nextDate.nam += 1;
            }
            // Cập nhật ngày của tháng mới (vì năm có thể thay đổi)
            ngayTrongThang[2] = isNamNhuan(nextDate.nam) ? 29 : 28;
        }
        System.out.println("Ngay hom sau: " + nextDate.ngay + "/" + nextDate.thang + "/" + nextDate.nam);

        
    }

}
