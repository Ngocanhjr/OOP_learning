package com.myctu.ct108h_thuchanh.Buoi2.Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class SDPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Tạo và hiển thị hai phân số a = 3/7, b = 4/9
        PhanSo a = new PhanSo(3, 7);
        PhanSo b = new PhanSo(4, 9);
        System.out.print("Phan so a: "); a.hienThi();
        System.out.print("Phan so b: "); b.hienThi();

        // 2. Nhập hai phân số x và y từ bàn phím
        PhanSo x = new PhanSo();
        PhanSo y = new PhanSo();
        System.out.println("\nNhap Phan so x:");
        x.nhap();
        System.out.println("Nhap phan so y y:");
        y.nhap();

        // 3. Hiển thị giá trị nghịch đảo của x
        System.out.print("\nNghich doa cua x: ");
        x.giaTriNghichDao().hienThi();

        // 4. Tính tổng của x + y và in kết quả
        PhanSo tongXY = x.congPS(y);
        System.out.print("\nSum x + y: ");
        tongXY.hienThi();

        // 5. Nhập danh sách n phân số
        System.out.print("\nNhap so lương phan tu n: ");
        int n = sc.nextInt();
        PhanSo[] dsPhanSo = new PhanSo[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thư i " + (i + 1) + ":");
            dsPhanSo[i] = new PhanSo();
            dsPhanSo[i].nhap();
        }

        // 6. Tính tổng n phân số
        PhanSo tongNPhanSo = new PhanSo(0, 1);
        for (PhanSo ps : dsPhanSo) {
            tongNPhanSo = tongNPhanSo.congPS(ps);
        }
        System.out.print("\nTong cua danh sach phan so: ");
        tongNPhanSo.hienThi();

        // 7. Tìm phân số lớn nhất
        PhanSo maxPhanSo = dsPhanSo[0];
        for (PhanSo ps : dsPhanSo) {
            if (ps.lonHon(maxPhanSo)) {
                maxPhanSo = ps;
            }
        }
        System.out.print("\nPhan so lơn nhat: ");
        maxPhanSo.hienThi();

        // 8. Sắp xếp danh sách phân số theo thứ tự tăng dần
        Arrays.sort(dsPhanSo, (ps1, ps2) -> {
            if (ps1.lonHon(ps2)) return 1;
            else if (ps2.lonHon(ps1)) return -1;
            return 0;
        });

        System.out.println("\nAfter sorted:");
        for (PhanSo ps : dsPhanSo) {
            ps.hienThi();
        }

        sc.close();
    }
}
