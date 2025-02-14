/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Buoi2.Bai1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Diem {

    private int x, y;

    private static Scanner sc = new Scanner(System.in);

    public Diem() {

    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhapDiem() {
        System.out.print("Nhap vao toa do cua x va y: ");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    public void hienThi() {
        System.out.println("Toa do diem: (" + x + "," + y + ")");
    }

    public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int giaTriX() {
        return x;
    }

    public int giaTriY() {
        return y;
    }
    
    public double khoangCach(){
        return sqrt(x*x + y*y);
    }
    public double khoangCach(Diem d){
        return sqrt(Math.pow((d.x - x), 2)+ Math.pow((d.y - y), 2));
    }
}
