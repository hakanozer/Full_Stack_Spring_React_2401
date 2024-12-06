package app_pack;

import java.util.Scanner;

public class ExampleIf {
    public static void main(String[] args) {

        // kişiden kart bilgisi alınır
        // kişiden çekilecek miktar alınır

        // geçerli kart bilgisi kıyaslanır
        // ürün fiyatı kıyaslanır

        // kişinin kart bilgisi hatalı ise kart hatası göster
        // kişinin kart limiti ürün için yetersiz ise hata göster
        Scanner scanner = new Scanner(System.in);

        int cardNumber = 45435677;
        int productPrice = 100;

        System.out.println("Please enter the card number: ");
        int userCardNumber = scanner.nextInt();

        System.out.println("Please enter the card limit: ");
        int userCardLimit = scanner.nextInt();

        if (cardNumber == userCardNumber) {
            if( userCardLimit >= productPrice ) {
                int minus = userCardLimit - productPrice;
                System.out.println("Sales Success Product Price: " + productPrice + " Remainder: " + minus);
            }else {
                System.out.println("You don't have enough money to buy this card.");
            }
        }else {
            System.out.println("The card number is not the same as the user card number");
        }

        System.out.println("======================================");
        if (cardNumber != userCardNumber) {
            System.out.println("The card number is not the same as the user card number");
        }else if (userCardLimit < productPrice) {
            System.out.println("You don't have enough money to buy this card.");
        }else {
            int minus = userCardLimit - productPrice;
            System.out.println("Sales Success Product Price: " + productPrice + " Remainder: " + minus);
        }

    }
}
