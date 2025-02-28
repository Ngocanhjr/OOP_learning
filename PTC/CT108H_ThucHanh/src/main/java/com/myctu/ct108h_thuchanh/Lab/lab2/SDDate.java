package com.myctu.ct108h_thuchanh.Lab.lab2;

import java.util.Scanner;

public class SDDate {

    public static void main(String[] args) {
        Date nn = new Date(6, 9, 2055);
        nn.in();

        System.out.println("===========================");

        Date t = new Date();
        System.out.println("Nhap ngay a");
        t.nhap();
        System.out.println("Ngay a");
        t.in();

        Date tomorrow = new Date(t.layD(), t.layM(), t.layY());
        tomorrow = tomorrow.ngayHomSau();
        System.out.println("Ngay hom sau: ");
        tomorrow.in();

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so ngay can cong: ");
        n = sc.nextInt();
        System.out.println("Ngay sau khi cong: ");
        t = t.cong(n);
        t.in();
    }
}
