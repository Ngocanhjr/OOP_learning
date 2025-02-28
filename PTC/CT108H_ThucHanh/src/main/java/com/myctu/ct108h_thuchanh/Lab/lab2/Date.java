package com.myctu.ct108h_thuchanh.Lab.lab2;

import java.util.Scanner;

public class Date {

    private int d, m, y;

    public Date() {
        d = 1;
        m = 1;
        y = 2025;
    }

    public Date(int ngay, int thang, int nam) {
        this.d = ngay;
        this.m = thang;
        this.y = nam;
    }

    public Date(Date d) {
        this.d = d.d;
        this.m = d.m;
        this.y = d.y;
    }

    public int layD() {
        return d;
    }

    public int layM() {
        return m;
    }

    public int layY() {
        return y;
    }

    public void gan(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public void in() {
        System.out.println(d + "/" + m + "/" + y);
    }

    @Override
    public String toString() {
        return (d + "/" + m + "/" + y);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao ngay: ");
            d = sc.nextInt();
            System.out.println("Nhap vao thang: ");
            m = sc.nextInt();
            System.out.println("Nhap vao nam: ");
            y = sc.nextInt();
            if (!hopLe()) {
                System.out.println("Error. Please try again!");
            }
        } while (!hopLe());
    }

//
    private boolean hopLe() {
        int ngay[] = {0, 31, isNamNhuan(y) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return (d > 0 && d <= ngay[m] && m > 0 && m <= 12 && y > 0);
    }

//	public boolean hopLe() {
//		int maxd[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		if ((y% 4) == 0 && (y %100) != 0) {
//			maxd[2] = 29;
//		}
//		boolean h = false;
//		if (d > 0 && d <= maxd[m] && m > 0 && m < 13 && y > 0) {
//			h = true;
//		}
//		return h;
//	}
    private boolean isNamNhuan(int t) {
        return (t % 4 == 0 && t % 100 != 0) || (t % 400 == 0);
    }

    public Date ngayHomSau() {
        Date t = new Date(d, m, y);
        t.d++;
        if (!t.hopLe()) {
            t.d = 1;
            t.m++;
            if (!t.hopLe()) {
                t.m = 1;
                t.y++;
            }
        }
        return t;
    }

    public Date cong(int n) {
        Date t = new Date(d, m, y);
        for (int i = 1; i <= n; i++) {
            t = t.ngayHomSau();
        }

        return t;
    }
}
