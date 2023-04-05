package bai1_validateClassName;

import java.util.Scanner;

public class Bai1 {
    public static final String CLASS_NAME = "^[ACP](\\d){4}[G-M]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập tên lớp: ");
            String input = scanner.nextLine();

            String className = new String(input);
            if (className.matches(CLASS_NAME)) {
                System.out.println(className + " là tên lớp hợp lệ!");
            } else {
                System.err.println(className + " không hợp lệ!");
            }
        }
    }
}
