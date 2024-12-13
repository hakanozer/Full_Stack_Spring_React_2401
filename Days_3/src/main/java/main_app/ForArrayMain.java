package main_app;

import java.util.Scanner;

public class ForArrayMain {
    public static void main(String[] args) {

        String[] users = { "Ali", "Kasım", "Erdal" ,"Murat", "Kemal", "Salih", "Serkan", "Ahmet" };
        String[] removeUser = {"Kemal", "", "Serkan", "Zehra"};

        for (int i = 0; i < users.length; i++) {
            String name = users[i];

            boolean found = false;
            for (int j = 0; j < removeUser.length; j++) {
                String removeName = removeUser[j];
                if (name.equals(removeName)) {
                    found = true;
                }
            }

            if (found) {
                continue;
            }
            System.out.println(name);

        }

        // mevsimler
        String[] mevsimler = {"İlk Bahar", "Yaz", "Son Bahar", "Kış"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1-4 arası bir mevsim seçiniz!");
        for(;;) {
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < mevsimler.length) {
                String mevsim = mevsimler[index];
                System.out.println("Seçtiniz mevsim: " + mevsim);
                break;
            } else {
                System.out.println("Lütfen geçerli bir sayı giriniz!");
            }
        }

    }
}
