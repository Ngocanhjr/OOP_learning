//Viết chương trình bằng ngôn ngữ Java nhận vào đối số dòng lệnh là 1 danh sách các số thực.
// Hiển thị số lớn nhất và tổng của các số thực có trong danh sách đó.
// Chú ý loại trừ các số thực nhập vào không đúng định dạng.
//        Đầu vào
//        Không có
//        Đầu ra
//        In ra màn hình hai số M và S,
//        cách nhau một khoảng trắng với M  là số lớn nhất và S là tổng của các số.
package TH1;
public class bai3_doiSoDongLenh {
    public static void main(String[] args) {
        double max = Double.MIN_VALUE;
        double sum = 0;
        for (String arg : args) {
            try {
                double number = Double.parseDouble(arg);
                max = Math.max(max, number);
                sum += number;
            } catch (NumberFormatException e) {
            }
        }
        System.out.println(max + " " + sum);
    }
}
//public class bai3_doiSoDongLenh {
//
//    public static void main(String[] args) {
//        // Khai báo biến để lưu trữ số lớn nhất và tổng
//        double soLonNhat = Double.MIN_VALUE;
//        double tong = 0;
//
//        // Duyệt qua danh sách đối số dòng lệnh
//        for (String chuoiSo : args) {
//            try {
//                // Chuyển đổi chuỗi số sang số thực
//                double soThuc = Double.parseDouble(chuoiSo);
//
//                // Cập nhật số lớn nhất
//                soLonNhat = Math.max(soLonNhat, soThuc);
//
//                // Cập nhật tổng
//                tong += soThuc;
//            } catch (NumberFormatException e) {
//                // Bỏ qua số nhập vào không đúng định dạng
//                //  System.err.println("Lỗi: " + chuoiSo + " không phải là số thực hợp lệ.");
//            }
//        }
//
//        // In ra màn hình kết quả
//        System.out.println(soLonNhat + " " + tong);
//    }
//}
//
//
