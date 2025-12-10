package Session5;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gioi1 {
    public static void main(String[] args) {
        System.out.print("Nhap mat khau bat ky: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        Matcher checkpassword = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]){8,}").matcher(password);
        if (checkpassword.find()) {
            System.out.println("Mat khau hop le");
        }else{
            System.out.println("Mat khau khong hop le");
        }
    }
}
