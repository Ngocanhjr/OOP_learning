package com.myctu.ct108h_thuchanh.Lab.lab4;

import java.util.Scanner;

import lab3.SinhVien;

public class SDSinhVienCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong sinh vien: ");
		int n = sc.nextInt();

		SinhVien[] ds = new SinhVien[n];
		for (int i = 0; i < n; i++) {
			int c = 0;
			
			System.out.println("Ban nhap va sinh vien (0) hay sinh vien CNTT (1): ");
			c = sc.nextInt();
			if(c == 0)
				ds[i] = new SinhVien();
			else 
				ds[i] = new SinhVienCNTT();
			ds[i].nhap();
			ds[i].nhapDiem();
		}
		
//		for(int i =0; i < n; i++) {
//			ds[i].in();
//		}
		for(SinhVien sv1: ds) {
			System.out.println(sv1);
		}
		
		sc.nextLine();
		System.out.println("Nhap email sinh vien can tim: ");
		String email = sc.nextLine();
		for(SinhVien sv2: ds) {
			if(email.equals(sv2.getEmail())) {
				System.out.println("Tai khoan tim thay: " + sv2.layTaiKhoan()
														+ ", diem TB: " + sv2.diemTB() );
				break;
			}
		}
		
		SinhVien t;
		for(int i =0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(ds[i].layTen().compareTo(ds[j].layTen()) > 0) {
					t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
			}
		}
		
		System.out.println("Danh sach sau khi sap xep theo ten: ");
		for(SinhVien s1: ds) {
			System.out.println(s1);
		}
	}
}
