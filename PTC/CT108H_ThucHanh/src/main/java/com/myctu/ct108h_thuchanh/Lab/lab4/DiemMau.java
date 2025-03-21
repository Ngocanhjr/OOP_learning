package com.myctu.ct108h_thuchanh.Lab.lab4;

import java.util.Scanner;

import lab2.Diem;

public class DiemMau extends Diem{
	private String mau;
	
	public DiemMau() {
//		x = 0; vi pham tinh bao goi
//		y = 0; vi pham tinh bao goi
//		Diem(); khong the goi ham xay dung cua cha
		super();
		mau = new String();
	}
	
	public DiemMau(int x1, int y1, String c) {
		super(x1, y1); //Diem(x1,y1);
		mau = new String(c); //QUAN TRONG NHO, NEW STRING
	}
	
	public DiemMau(DiemMau dm) {
		super(dm); //Diem(dm); tu dong ep kieu tu con thanh cha <=> super((Diem)mau);
		mau = new String(dm.mau);
	}
	
	public void nhap() {
//		nhap(); nhap se goi trong lop con truoc, sau do moi do tim toi cha
//		Diem.nhap(); sao
		super.nhap();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mau: ");
		mau = sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.println(", " + mau);
	}
	
	public String toString() {
		return super.toString() + ", " + mau;
	}
	
	public void ganMau(String mau1) {
		mau = new String(mau1);
	}
}

