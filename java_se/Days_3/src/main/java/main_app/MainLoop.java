package main_app;

import java.util.Scanner;

public class MainLoop {
    public static void main(String[] args) {

        // Tekrarlanan işlemler için loop yapılır.
        // int i = 0; -> sayaç 0 dan başlar.
        // i < 10; -> durma noktasına karar veren yer
        // i++ -> sayaç adımı 1 artırır
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World :" + i);
        }

        String[] cities = {"Gaziantep", "ŞanlıUrfa", "Konya", "Bursa", "Trabzon", "Hatay"};
        for (int i = 0; i < cities.length; i++ ) {
            System.out.println( cities[i] );
        }

        // daha önceden bir sayı belirledin - 7
        // kullanıcıdan sayı istedin 1 - 10 arasında
        // aşağıda değer girdiyse yukarı yazsın, yukarı değer girdiyse aşağı yazsın.
        int number = 7;
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            System.out.println("Lütfen 1 - 10 arasında sayı giriniz!");
            int userNumber = scanner.nextInt();

            if (userNumber == number) {
                System.out.println("Şanlısınız!");
                break; // döngüyü durdur, çalışmasını istemiyorum.
            }

            if (userNumber > number) {
                System.out.println("Aşağı değer giriniz!");
            }

            if (userNumber < number) {
                System.out.println("Yukarı değer giriniz!");
            }
        }


    }
}
