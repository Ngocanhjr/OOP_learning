/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Lab.lab2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Diem {

    private int x, y;

    public Diem() {
        x = 0;
        y = 0;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Diem(Diem d) {
        this.x = d.x;
        this.y = d.y;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhap x: ");
        x = sc.nextInt();
        System.out.print("\n Nhap y: ");
        y = sc.nextInt();
    }

    public void in() {
        System.out.print("(" + x + ", " + y + ")");
    }

    public void ttien(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int layX() {
        return x;
    }

    public int layY() {
        return y;
    }

    public float kcach() {
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public float kcach(Diem B) {
        return (float) Math.sqrt(Math.pow(x - B.x, 2) + Math.pow(y - B.y, 2));
    }

    public Diem trungDiem(Diem B) {
        return new Diem((x + B.x) / 2, (y + B.y) / 2);
    }

    public void gan(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
