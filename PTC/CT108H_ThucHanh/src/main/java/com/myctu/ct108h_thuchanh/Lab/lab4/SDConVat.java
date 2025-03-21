package com.myctu.ct108h_thuchanh.Lab.lab4;

import java.util.Scanner;

public class SDConVat {
	public static void main(String[] args) {
//		ConVat cv = new ConVat();
//		cv.nhap();
//		cv.in();

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap vao so con vat: ");
		n = sc.nextInt();
		ConVat[] ds = new ConVat[n];
		int c;
		for (int i = 0; i < n; i++) {

			do {
				System.out.println("Nhap vao con vat - heo (0), bo (1), de (2), ga(3): ");
				c = sc.nextInt();
			} while (c != 0 && c != 1 && c != 2 && c != 3);

			if (c == 0) {
				ds[i] = new Heo();
			} else if (c == 1) {
				ds[i] = new Bo();
			} else if (c == 2) {
				ds[i] = new De();
			} else if (c == 3) {
				ds[i] = new Ga();
			}
			ds[i].nhap();
		}

		for (ConVat cv1 : ds) {
			System.out.println(cv1);
			cv1.keu();
		}
	}
}
