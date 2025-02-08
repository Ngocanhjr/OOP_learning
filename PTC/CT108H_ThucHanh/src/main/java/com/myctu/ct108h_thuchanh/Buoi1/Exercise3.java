/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Buoi1;

/**
 *
 * @author ASUS
 */
public class Exercise3 {

    public static void main(String[] args) {
        double max = Double.MIN_VALUE;
//        System.out.println("MAX: " + max);

        double sum = 0;
        for (String arg : args) {
            try {
                double temp = Double.parseDouble(arg);
                if (temp > max) {
                    max = temp;
                }
                sum += temp;
            } catch (java.lang.NumberFormatException e) {
                System.out.println(e);
            }
        }

        System.out.println("MAX: " + max + ", sum: " + sum);
    }
}
