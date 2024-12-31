package tekrar;

import java.util.Scanner;

public class Action {

    // Overload - Aşırı yüklenmiş
    int number = 0;
    public Action( int number ) {
        this.number = number;
    }

    public Action( ) {

    }

    public String call() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz!");
        String name = scanner.nextLine();
        return name;
    }


}
