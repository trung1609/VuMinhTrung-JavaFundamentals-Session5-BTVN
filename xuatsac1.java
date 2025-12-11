package Session5;

import java.util.Scanner;

public class xuatsac1 {
    public static void main(String[] args) {
        String str = null;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("**************** MENU *****************");
            System.out.println("1. Nhap chuoi");
            System.out.println("2. Dem so ky tu thuong, hoa, so, dac biet");
            System.out.println("3. Dao nguoc chuoi");
            System.out.println("4. Kiem tra Palindrome");
            System.out.println("5. Chuan hoa chuoi");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhap chuoi bat ky: ");
                    str = sc.nextLine();
                    break;
                case 2:
                    int upper = 0, lower = 0, digit = 0, specialCharacter = 0;
                    for (int i = 0; i < str.length(); i++) {
                        char character = str.charAt(i);
                        if (Character.isUpperCase(character)) {
                            upper++;
                        } else if (Character.isLowerCase(character)) {
                            lower++;
                        } else if (Character.isDigit(character)) {
                            digit++;
                        } else {
                            specialCharacter++;
                        }
                    }
                    System.out.printf("Co %d chu thuong - %d chu hoa - %d chu so - %d ky tu dac biet\n", lower, upper, digit, specialCharacter);
                    break;
                case 3:
                    StringBuilder reverseString = new StringBuilder(str);
                    for (int element : str.toCharArray()) {
                        reverseString.reverse();
                    }
                    System.out.println("Chuoi sau khi dao nguoc: " + reverseString.toString());
                    break;
                case 4:
                    StringBuffer str1 = new StringBuffer(str);
                    StringBuffer str2 = new StringBuffer(str);
                    str1.reverse();
                    if (str1.compareTo(str2) == 0) {
                        System.out.println("Chuoi nhap vao la chuoi doi xung");
                    } else {
                        System.out.println("Chuoi nhap vao khong la chuoi doi xung");
                    }
                    break;
                case 5:
                    // Loai bo khoang trang 2 dau va tren 2 khoang trang
                    // Viet hoa chu dau cac chu con lai viet thuong
                    String strStandard = str.trim().replaceAll("\\s+", " ");
                    String[] arr = strStandard.split(" ");
                    StringBuilder sb = new StringBuilder();
                    for (String element : arr) {
                        sb.append(Character.toUpperCase(element.charAt(0)))
                                .append(element.substring(1).toLowerCase())
                                .append(" ");
                    }
                    System.out.println("Chuoi sau khi chuan hoa: " + sb.toString().trim());
                    break;
                case 6:
                    System.out.println("Tam biet");
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-6");
            }
        } while (true);
    }
}
