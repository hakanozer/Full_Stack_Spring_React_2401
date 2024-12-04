package app_pack;

import java.util.Scanner;

public class LogicMain {
    public static void main(String[] args) {

        int a = 10;
        int b = 11;
        boolean status = false;

        // ve -> &&
        // veya ->  ||
        // ! -> not

        // ve -> &&
        // sol tarafta bulunan kıyas ile sağ tarafta bulunan kıyasın sağlanması durumu
        status = a > 5 && b < 11;
        System.out.println(status);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen email giriniz!");
        //String email = scanner.nextLine();
        String email = "ali@mail.com";

        System.out.println("Lütfen şifre giriniz!");
        //String password = scanner.nextLine();
        String password = "12345";

        status = ( email.equals("5436557788") || email.equals("ali@mail.com") ) && password.equals("12345");
        System.out.println("Login Status: " + status);

        status = a > 6 && a < 11;
        System.out.println(status);

        // || -> sol tarafta bulunan kıyas veya sağ tarafta bulunan kıyasın sağlanması durumu
        status = a > 10 || b > 11 || b > a;
        System.out.println(status);

        // ! -> değilse
        status = !(a > 10);
        System.out.println(status);

    }
}
