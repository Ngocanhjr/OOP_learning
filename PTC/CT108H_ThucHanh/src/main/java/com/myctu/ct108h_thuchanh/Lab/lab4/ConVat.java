package com.myctu.ct108h_thuchanh.Lab.lab4;

import java.util.Scanner;

public class ConVat {
	
	private String giong;
	
	private String mau;
	
	private float canNang;

	//Viet 5 ham cb
	public ConVat() {
		giong = new String();
		mau = new String();
		canNang = 0;
	}
	
	public ConVat(ConVat dv) {
		giong = new String(dv.giong);
		mau = new String(dv.mau);
		canNang = dv.canNang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao giong dong vat: ");
		giong = sc.nextLine();
		System.out.println("Nhap vao mau dong vat: ");
		mau = sc.nextLine();
		System.out.println("Nhap vao can nang dong vat: ");
		canNang = sc.nextFloat();
	}
	
	public void in() {
		System.out.println("[Giong dong vat: " + giong + ", mau: " + mau + ", can nang: " + canNang + "]");
	}
	
	public String toString() {
		return "[Giong dong vat: " + giong + ", mau: " + mau + ", can nang: " + canNang + "]";
	}
	
	//phuong thuc keu
	
	public void keu() {
		
	}
}
