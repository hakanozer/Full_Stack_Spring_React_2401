package mainApp;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class AppMain {
    public static void main(String[] args) {

        FileControl fileControl = new FileControl("not");
        //fileControl.createNewFile();
        //fileControl.deleteFile();
        fileControl.writeLine( UUID.randomUUID().toString() );
        List<String> ls = fileControl.readFile();
        System.out.println(ls);

        /////////////////////////////
        int a = 100;
        int b = 200;
        int sum = a + b;

        try {
            // hata olma olasılığı olan kodlar
            int i = 1 / 0;
        }catch (Exception ex) {
            // hata olduğunda çalışacak kodlar
            System.err.println("girilen sayılarda sorun var!");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı girini!");
        try {
            // String stAge = scanner.nextLine();
            String stAge = "33";
            int age = Integer.parseInt(stAge);
            System.out.println("age :" + age);
        }catch (Exception ex) {
            System.out.println( ex.getMessage() );
            System.out.println("Lütfen tam sayı giriniz!");
        }

        try {
            Thread.sleep(1000);
            int i = 1 / 0;
        }catch (Exception ex) {

        }


        System.out.println("Bu bölümde çalıştı");

    }
}
