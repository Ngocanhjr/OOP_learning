package TH2.Bai1_PointClass;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class MyUtil {
    // Tạo đối tượng scanner dùng chung
    public static Scanner scanner = new Scanner(System.in);
    public static void printField(Object object, String fieldName) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            System.out.println(Modifier.toString(field.getModifiers()) + " " +
                    fieldName + ": " + field.getType().toString());
        } catch (Exception e) {
            System.out.print(fieldName + ": ERROR");
        }
    }
}
