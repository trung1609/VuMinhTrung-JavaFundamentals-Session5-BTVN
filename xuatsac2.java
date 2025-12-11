package Session5;

import java.util.Scanner;

public class xuatsac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = null;
        String[] arrStudent = new String[100];
        int count = 0;
        boolean isFoundWord = false;
        do {
            System.out.println("*********************************MENU*********************************");
            System.out.println("1. Them ten sinh vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim ten sinh vien chua tu khoa");
            System.out.println("4. Dem so sinh vien co ten bat dau bang chu cai nhap vao");
            System.out.println("5. Sap xep danh sach ten theo thu tu A-Z");
            System.out.println("6. Thoat");
            System.out.println("**********************************************************************");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhap ten sinh vien: ");
                    name = sc.nextLine();
                    arrStudent[count] = name;
                    count++;
                    System.out.println("Da them: " + name);
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien:");
                    for (int i = 0; i < count; i++) {
                        System.out.printf("%d. %s \n", i + 1, arrStudent[i]);
                    }
                    break;
                case 3:
                    System.out.print("Nhap tu khoa: ");
                    String word = sc.nextLine();
                    System.out.println("Ket qua tim kiem: ");
                    for (int i = 0; i < count; i++) {
                        if (arrStudent[i].contains(word)) {
                            System.out.printf("- %s\n", arrStudent[i]);
                            isFoundWord = true;
                        }
                    }
                    if (!isFoundWord) {
                        System.out.printf("Khong tim thay sinh vien co tu khoa %s\n", word);
                    }
                    break;
                case 4:
                    int countName = 0;
                    System.out.print("Nhap chu cai: ");
                    String findName = sc.nextLine();
                    for (int i = 0; i < count; i++) {
                        if (arrStudent[i].startsWith(findName)) {
                            countName++;
                        }
                    }
                    System.out.printf("So sinh vien co ten bat dau bang '%s': %d\n", findName, countName);
                    break;
                case 5:
                    for (int i = 0; i < count; i++) {
                        for (int j = 0; j < count - i - 1; j++) {
                            if (arrStudent[j].compareTo(arrStudent[j + 1]) > 0) {
                                String tmp = arrStudent[j];
                                arrStudent[j] = arrStudent[j + 1];
                                arrStudent[j + 1] = tmp;
                            }
                        }
                    }
                    System.out.println("Da sap xep theo thu tu A-Z");
                    break;
                case 6:
                    System.out.println("Tam biet!");
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-6");
            }
        } while (true);
    }
}
