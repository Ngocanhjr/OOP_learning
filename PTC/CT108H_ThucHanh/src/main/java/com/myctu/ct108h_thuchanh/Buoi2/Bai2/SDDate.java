/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myctu.ct108h_thuchanh.Buoi2.Bai2;

/**
 *
 * @author ASUS
 */
public class SDDate extends Date {
    
    public static void main(String[] args) {
        int[][] testCases = {
            {15, 8, 2023}, // Hợp lệ
            {31, 12, 2000}, // Hợp lệ (cuối năm)
            {29, 2, 2024}, // Hợp lệ (năm nhuận)
            {29, 2, 2023}, // Không hợp lệ (không phải năm nhuận)
            {30, 2, 2020}, // Không hợp lệ (tháng 2 không có 30 ngày)
            {0, 5, 2023}, // Không hợp lệ (ngày = 0)
            {10, 0, 2023}, // Không hợp lệ (tháng = 0)
            {10, 13, 2023}, // Không hợp lệ (tháng > 12)
            {32, 1, 2023}, // Không hợp lệ (tháng 1 không có 32 ngày)
            {15, 6, -5} // Không hợp lệ (năm âm)
        };

        // Chạy kiểm thử từng test case
        for (int i = 0; i < testCases.length; i++) {
            int ngay = testCases[i][0];
            int thang = testCases[i][1];
            int nam = testCases[i][2];
            
            System.out.println("Test case " + (i + 1) + ": " + ngay + "/" + thang + "/" + nam);
            Date day = new Date(ngay, thang, nam);
            day.hienThiNgay();
            
            if (day.hopLe(ngay, thang, nam)) {
                System.out.println("D");
            } else {
                System.out.println("S");
            }
            System.out.println("-------------------------");
        }

//        Date newDay = new Date(5,7,2007);
////        newDay.nhap();
//        newDay.hienThiNgay();
//        newDay.ngayHomSau();
//        newDay.congNgay(30);
//        newDay.hienThiNgay();
        Date[] testCaseses = {
            new Date(5, 7, 2007), // Trường hợp thông thường
            new Date(31, 12, 2023), // Cuối năm
            new Date(28, 2, 2024), // Năm nhuận (ngày cuối tháng 2)
            new Date(28, 2, 2023), // Không phải năm nhuận (ngày cuối tháng 2)
            new Date(30, 4, 2023), // Tháng 30 ngày
            new Date(31, 1, 2023), // Tháng 31 ngày
            new Date(29, 12, 2023), // Cộng ngày qua năm mới
            new Date(1, 1, 2023), // Đầu năm
            new Date(15, 8, 2023), // Giữa năm
            new Date(1, 11, 2023) // Cuối năm nhưng không phải tháng 12
        };
        
        int[] congNgayCases = {1, 2, 30, 31, 60, 90}; // Số ngày cần cộng

        for (Date d : testCaseses) {
            d.hienThiNgay();
            // Kiểm thử hàm ngayHomSau()
            d.ngayHomSau();

            // Kiểm thử hàm congNgay() với nhiều số ngày khác nhau
            for (int soNgay : congNgayCases) {
                System.out.print("Cong " + soNgay + " : ");
                d.congNgay(soNgay);
            }
            System.out.println("------------------------");
        }
        
        Date day = new Date(1, 1, 2023);
        day.congNgay(365);
    }
}
