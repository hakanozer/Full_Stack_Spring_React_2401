package app_pack;

public class IfMain {
    public static void main(String[] args) {

        // if
        // karar kontrol yapısı için kullanılır.

        /*
        if (kıyaslama yapılacak alan) {
            // kıyaslama doğrulandı ise çalışacak kodlar
        }else {
            // kıyaslama hatalı ise çalışcak kodlar
        }
         */

        String email = "elif@mail.com";
        String password = "12345";
        boolean loginStatus = email.equals("elif@mail.com") && password.equals("12345");
        if ( loginStatus ) {
            System.out.println("Email is valid");
        }else {
            System.out.println("Email is not valid");
        }


        int a = 10;
        int b = 11;
        if ( a > b ) {
            System.out.println("A is greater than b");
        }else {
            System.out.println("A is not greater than b");
        }

        if ( b > a && b > 10 ){
            System.out.println("B is greater than a");
        }else {
            System.out.println("B is not greater than a");
        }


    }
}
