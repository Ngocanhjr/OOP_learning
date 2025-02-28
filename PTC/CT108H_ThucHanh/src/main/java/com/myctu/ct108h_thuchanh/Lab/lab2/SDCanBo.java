package com.myctu.ct108h_thuchanh.Lab.lab2;

import java.util.Scanner;

public class SDCanBo {

    public static void main(String[] args) {
//		CanBo t = new CanBo();
//		t.nhap();
//		t.in();

        int n;
        System.out.println("Nhap va so luong can bo: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        CanBo[] cb = new CanBo[n];

        for (int i = 0; i < n; i++) {
            cb[i] = new CanBo(); //cap phat bo nho
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao thong tin can bo thu " + (i + 1));
            CanBo b = new CanBo();
            b.nhap();
            cb[i] = b;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin can bo thu " + (i + 1));
            cb[i].in();
        }

        long tong = 0;
        for (int i = 0; i < n; i++) {
            tong += cb[i].khenThuong();
        }

        System.out.println("\nTong khen thuong: " + tong);

//		t.inKhenThuong(cb, n);
    }
}
