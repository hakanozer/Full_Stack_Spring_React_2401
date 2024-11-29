package app_pack;

import java.util.Scanner;

public class UseScanner {

    public static void main(String[] args) {

        // kullanıcıdan veri alma
        // Sccanner
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        System.out.println("Lütfen 1. sayıyı giriniz!");
        double num1 = scanner.nextDouble();

        System.out.println("Lütfen 2. sayıyı giriniz!");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double div = num1 / num2;

        System.out.println("Lütfen Adınızı Giriniz?");
        String name = scannerString.nextLine();

        System.out.println(name);
        System.out.println( "Sum :" + sum );
        System.out.println( "Div :" + div );

    }

}
