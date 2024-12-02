import java.util.Scanner;

public class Odev_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Sayı Girin!");
        String stringNumber = scanner.nextLine(); // String
        int number = Integer.parseInt(stringNumber);
        int end = number * 5;
        System.out.println(end);

    }
}
