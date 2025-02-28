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
public class ConvertToArray {

    public static void main(String[] args) {
        // khai báo 1 ArrayList có tên là list
        // có kiểu là String
        ArrayList<String> list = new ArrayList<String>();
        // thêm các phần tử vào list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        // sử dụng phương thức toArray() chuyển list thành mảng
        // kết quả của phương thức này sẽ trả về mảng arr
        Object[] arr = list.toArray();

        // hiển thị các phần tử có trong mảng arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử tại vị trí " + i + " " + "trong arr là " + arr[i]);
        }
    }
}
