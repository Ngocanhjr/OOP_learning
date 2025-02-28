package com.myctu.ct108h_thuchanh.Lab.lab2;

import java.util.Scanner;

public class CanBo {

    private int maSo;

    private String hoTen;

    private int namSinh;

    private int thamNien;

    private char xepLoai;

    public CanBo() {
        maSo = 0;
        hoTen = new String();
        namSinh = 2000;
        thamNien = 0;
        xepLoai = 'C';
    }

    public CanBo(int maSo, String hoTen, int namSinh, int thamNien, char xepLoai) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.thamNien = thamNien;
        this.xepLoai = xepLoai;
    }

    public int layMaSo() {
        return maSo;
    }

    public String layHoTen() {
        return hoTen;
    }

    public int layNamSinh() {
        return namSinh;
    }

    public int layThamNien() {
        return thamNien;
    }

    public char layXepLoai() {
        return xepLoai;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Nhap vao ma so can bo: ");
        maSo = sc.nextInt();
        System.out.print("\n Nhap vao ho ten can bo: ");
        sc.nextLine();
        hoTen = sc.nextLine();
        System.out.print("\n Nhap vao nam sinh can bo: ");
        namSinh = sc.nextInt();
        System.out.print("\n Nhap vao tham nien can bo: ");
        thamNien = sc.nextInt();

        sc.nextLine();
        do {
            System.out.print("\n Nhap vao xep loai can bo: ");
            xepLoai = sc.next().charAt(0);
            if (!hopLe()) {
                System.out.println("Loai khong hop le. Vui long nhap lai!");
            }
        } while (!hopLe());
    }

    private boolean hopLe() {
        return (xepLoai == 'A' || xepLoai == 'B' || xepLoai == 'C');
    }
    // viet chuong trinh nhap lieu va in ds khen thuong cho khong qua 100 can bo

    public void in() {
//		System.out.println(maSo + " " + hoTen + ' ' + namSinh + " " + thamNien + " " + xepLoai);
        System.out.print("\nMa So: " + maSo);
        System.out.print("\nHo Ten: " + hoTen);
        System.out.print("\nNam Sinh: " + namSinh);
        System.out.print("\nTham Nien: " + thamNien);
        System.out.print("\nXep Loai: " + xepLoai);
    }

    public long khenThuong() {
        int tien = 0;
        if (xepLoai == 'A') {
            tien = 1000000 * thamNien;
        } else if (xepLoai == 'B') {
            tien = 500000 * thamNien;
        }
        return tien;
    }

    private boolean hopLeKT() {
        return (xepLoai == 'A' || xepLoai == 'B');
    }

    public void inKhenThuong(CanBo[] cb, int n) {
        long total = 0;
        for (int i = 0; i < n; i++) {
            if (cb[i].hopLeKT()) {
                cb[i].in();
                long tien = cb[i].khenThuong();
                System.out.println("Tien " + tien);
                total += tien;
            }
        }
        System.out.println("Tong khen thuong: " + total);
    }

}
