package bai2_validatePhoneNumber;

import java.util.Scanner;

public class Bia2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone = "^\\((\\d){2}\\)\\-\\(0(\\d){9}\\)$";
        while (true) {
            System.out.println(" Nhập số điện thoại: ");
            String phoneNumber = scanner.nextLine();
            if (phoneNumber.matches(phone)) {
                System.out.println(phoneNumber + " đúng định dạng!");
            } else {
                System.err.println(phoneNumber + " không đúng định dạng!");
            }
        }
    }
}
