/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Buoi2.Bai1;

/**
 *
 * @author ASUS
 */
public class SDDiem {
    public static void main(String[] args) {
        Diem A = new Diem(3,4);
        A.hienThi();
        
        Diem B = new Diem();
        B.nhapDiem();
        B.hienThi();
        
        Diem C = new Diem((-B.giaTriX()), (-B.giaTriY()));
        C.hienThi();
        
        System.out.println("Khoang cach tu B den tam 0: " + B.khoangCach());
        System.out.println("Khoang cach tu A den tam B: " + B.khoangCach(A));

    }
}
