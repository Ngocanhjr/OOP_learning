package com.myctu.ct108h_thuchanh.Lab.lab4;

import java.util.Scanner;

import lab3.SinhVien;

public class SinhVienCNTT extends SinhVien {
	private String tk;

	private String mk;

	private String email;

	public SinhVienCNTT() {
		super();
		tk = new String();
		mk = new String();
		email = new String();
	}

	public SinhVienCNTT(SinhVienCNTT sv) {
		super(sv); //super((SinhVien)s) // QUAN TRONG
		sv.tk = new String(sv.tk);
		sv.mk = new String(sv.mk);
		sv.email = new String(sv.email);
	}

	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao tai khoan: ");
		tk = sc.nextLine();
		System.out.println("Nhap vao mat khau: ");
		mk = sc.nextLine();
		System.out.println("Nhap vao email: ");
		email = sc.nextLine();
	}

	public void in() {
		super.in();
		System.out.print(", [Tai khoan: " + tk + ", Email: " + email + "]");
//		System.out.print(", " + mk);
	}

	public String toString() {
		return super.toString() + ", [Tai khoan: " + tk + ", " + mk + ", Email: " + email + "]";
	}

	public void doiMatKhau(String newPass) {
		mk = new String(newPass);
	}

	public String getEmail() {
		return email;
	}
	
	public String layTaiKhoan() {
		return "[Tai khoan: " + tk + ", " + mk + ", Email: " + email + "]";
	}
	
	
}
