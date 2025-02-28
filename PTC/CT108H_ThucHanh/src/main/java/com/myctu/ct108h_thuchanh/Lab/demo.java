/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Lab;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao tuoi va ten: ");
        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println(name + " " + age);
        System.out.println();
    }
}
