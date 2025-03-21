package com.myctu.ct108h_thuchanh.Lab.lab4;

import java.util.Scanner;

import lab2.Diem;

public class SDDiemMau {

	public static void main(String[] args) {
		Diem d = new Diem();
		d.nhap();
		d.in();
		
		Diem diem = new DiemMau();
		diem.nhap();
		diem.in();
		System.out.println(diem);

		DiemMau dm = new DiemMau();
		dm.nhap();
		dm.in();
		dm.ganMau("red");

		dm.ttien(4, 7);
		dm.in();
		d = dm; // Con ep sang thanh cha
		d.nhap();// Lien ket dong
		d.in(); // la kieu diem nhung tham chieu toi doi tuong diem mau -> DiemMau.nhap();
//		d.super.in(); SAI
		d = new DiemMau();

//		dm = new Diem(); sai
//		dm = d; sai
		
		/*
		 * Hay nhap va in 1 ds doi tuong diem va diem mau
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so doi tuong: ");
		int n = sc.nextInt();
		Diem[] ds = new Diem[n]; //Deu la diem tham chieu toi null
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap vao Diem(0) hay diem mau (1): ");
			//Dieu kiem nhap vao
			int c = sc.nextInt();
			if(c == 0)
				ds[i] = new Diem(); //Tham chieu toi diem
			else
				ds[i] = new DiemMau(); //Tham chieu toi diem mau
			ds[i].nhap(); //Tuy vao doi tuong ng dung nhap vao diem hay diem mau
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(ds[i]);
		}
	}
}
