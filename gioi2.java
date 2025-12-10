package Session5;

import java.util.Random;
import java.util.Scanner;

public class gioi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap do dai cua chuoi: ");
            n = Integer.parseInt(sc.nextLine());
            if (n < 1 || n > 1000) {
                System.err.println("Vui long nhap n trong khoang 1 den 1000.");
            }
        } while (n < 1 || n > 1000);
        String saltChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghiklmnopqrstuvwxyz1234567890";
        StringBuilder salt = new StringBuilder();
        Random random = new Random();
        while (salt.length() < n) {
            int index = (int) (random.nextDouble() * saltChars.length());
            salt.append(saltChars.charAt(index));
        }
        System.out.println(salt.toString());
    }
}
