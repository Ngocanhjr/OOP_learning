package com.myctu.ct108h_thuchanh.Buoi1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
/*
Viết chương trình nhập vào 2 số nguyên a và b. Tính tổng và hiển thị ra màn hình. Nếu 
số nhập vào không đúng định dạng thì hiển thị thông báo lỗi, yêu cầu nhập lại. 
 */
public class Exercise4 {

    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 2 so a va b: ");
        try {
            a = sc.nextInt();
            b = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Sum: " + new Exercise4().sum(a, b));
    }
}
