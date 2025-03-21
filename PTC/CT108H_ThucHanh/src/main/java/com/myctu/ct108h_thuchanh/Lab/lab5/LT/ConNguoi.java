/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Lab.lab5.LT;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ConNguoi {
    private String cccd;
    
    private String hoTen;
    
    private DiaChi dc; //Thuộc tính quan hệ. Nếu 0-> n thì phải khai báo là mảng
    private DiaChi dcc[];
//    public ConNguoi(){
//        cccd = new String();
//        hoTen = new String();
//        dc = new DiaChi();
//    }
    public ConNguoi(){
        cccd = new String();
        hoTen = new String();
        dcc = new DiaChi[MAX_LENGHT];
    }
    
     public ConNguoi(ConNguoi c){
        cccd = new String(c.cccd);
        hoTen = new String(c.hoTen);
        dcc = new DiaChi[MAX_LENGHT];
        for(int i = 0; i < c.dcc.length; i++){
            if(c.dcc[i] == null )
                break;
            dcc[i] = new DiaChi(c.dcc[i]);
        }
        
    }
    
    public void nhap(){
        //....
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao cccd");
        cccd = sc.nextLine();
        System.out.println("Nhap vao ho ten");
        hoTen = sc. nextLine();
        
        System.out.println("Nhap vao so nha hien có");
        int n = sc.nextInt();
          
        for(int i = 0; i < n; i++){
            System.out.println("Nhap dia chi thu " + (i + 1) + ": ");
            dcc[i] = new DiaChi();
            dcc[i].nhap();
        }
        dc.nhap();
        //....
        
    }
    
    public void in (){
    }
    
}
