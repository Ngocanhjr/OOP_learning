/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2.Bai1_PointClass;

/**
 *
 * @author ASUS
 */
public class PointTest  {
    public static void main(String[] args) {
        Point A = new Point(3,4);
        A.print();
        Point B = new Point();


        B.read();
        int x = B.getX();
        int y = B.getY();
        Point C = new Point(-x,-y);
        B.print();
        C.print();
        System.out.println(B.distance());
        System.out.println(B.distance(A));

    }
}
