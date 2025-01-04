package TH1;

import java.util.Scanner;

public class bai6_nguyenTo_nhiPhan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag=true;
        if (n < 2) {
            flag =false;
        }

        for (int i=2; i<=Math.sqrt(n);i++){
            if (n%i==0){

                flag =false;
                break;
            }
        }
        if (flag){
            System.out.println("n là số nguyên tố");
        } else {
            System.out.println("n không là số nguyên tố");
        }
        System.out.println(Integer.toBinaryString(n));
    }
}

