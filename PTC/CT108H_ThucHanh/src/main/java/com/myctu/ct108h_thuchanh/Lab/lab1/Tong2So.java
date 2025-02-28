/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Lab.lab1;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Tong2So {

    public int tong(int a, int b) {
        return a + b;
    }

    public double tong(double a, double b) {
        return a + b;
    }

    public static int tong2(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 6, b = 4;
        // Gọi từ đối tượng t
        Tong2So t = new Tong2So();
        int s1 = t.tong(a, b);
        int s2 = t.tong2(a, b);
        // Gọi từ tên lớp
        // int n1 = Tong2So.tong1(a,b); // -> sai
        int n2 = Tong2So.tong2(a, b); // Hàm tĩnh
        // Chú ý 1 hàm phải được gọi từ 1 đối tượng
        // - 1 hàm tĩnh có thể gọi từ 1 tên lớp mà không cần gọi từ đối tượng
        // - hàm tĩnh chỉ có thể gọi hàm tĩnh, chỉ có thể truy xuất các thuộc tính tĩnh
        // (không truy xuất được thuộc tính bình thường)

        int c = t.tong(a, b);
        double d = t.tong(1.5, 2.5);
        System.out.println(c + " " + d);

        int[] arr = new int[5];
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> listString = new ArrayList<String>(20);
    }
}
