package com.myctu.ct108h_thuchanh.Lab.lab2;

public class SDDiem {

    public static void main(String[] args) {
        Diem A = new Diem(3, 4);
        System.out.print("\nToa do diem A: ");
        A.in();

        Diem B = new Diem();
        System.out.print("\nNhap toa do diem B: ");
        B.nhap();
        System.out.print("\nToa do diem B: ");
        B.in();

        Diem C = new Diem(-B.layX(), -B.layY());
        System.out.print("\nToa do diem doi xung B: ");
        C.in();

        System.out.println("\nB0 = " + B.kcach());
        System.out.println("AB = " + B.kcach(B));

        // Toa do trung diem
        Diem I = A.trungDiem(B);
        I.in();

        Diem II = new Diem();
        int x = ((A.layX() + B.layX()) / 2);
        int y = ((A.layY() + B.layY()) / 2);

        II.gan(x, y);
        II.in();
    }
}
