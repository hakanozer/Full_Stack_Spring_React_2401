package app_pack;

public class MainApp {

    public static void main(String[] args) {
        // Değişkenler
        // Variable
        /*
        * çok
        * satırlı
        * kod
        * bölümü
        */

        // String
        // Karakter katarı
        // DeğişkeninTürü DeğişkenAdı = DeğişkenDeğeri;
        String name = "Kemal";
        String surname = "Bil";
        String join = "Sn." + name +" "+ surname;
        String label = "Ali01";

        String stringAge = "30";
        String number1 = "50";
        String numberJoin = stringAge + number1;

        System.out.println(name);
        System.out.println(surname);
        System.out.println(join);
        System.out.println(numberJoin);

        // Tam sayı
        // int
        int num1 = 50;
        int num2 = 30;
        int sum = num1 + num2;
        String sumInt = "Toplam: " + sum;
        System.out.println(sumInt); // Toplam: 80

        byte b1 = 127;
        short s1 = 32456;
        long long1 = 9223372036854775807L;

        // char
        // Karakter katarı
        String data = "Almanya çok soğuk!";
        char ch1 = 'x';

        // karar değişkeni - true - false
        boolean status = true;

        // ondalıklı değerler
        // float küçük ondalıklı değerler
        float f1 = 40.6f;
        float f2 = 79.6f;
        float sumFloat = f1 + f2;
        System.out.println(sumFloat);

        // büyük finansal - uzaysal için kullanılır.
        double d1 = 402342.6523423423423;
        double d2 = 592342.6523423423423423;
        double doubleSum = d1 + d2;
        System.out.println(doubleSum);

    }

}
