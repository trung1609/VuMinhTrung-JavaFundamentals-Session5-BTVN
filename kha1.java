package Session5;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 chuoi bat ky: ");
        String email = sc.nextLine();
        Matcher checkEmail = Pattern.compile("[a-zA-Z0-9\\._]+@[\\w]+\\.[a-zA-Z]{2,6}").matcher(email);
        if (checkEmail.find()) {
            System.out.println(checkEmail.group());
            System.out.println("Email hop le");
        }else {
            System.out.println("Email khong hop le");
        }
    }
}
