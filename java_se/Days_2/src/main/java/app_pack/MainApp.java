package app_pack;

public class MainApp {
    public static void main(String[] args) {

        // Operatörler
        // Matematiksel

        double a = 50;
        double b = 20;
        double end = 0;

        // +
        double endSum = a + b;
        System.out.println(endSum);

        // -
        end = a - b;
        System.out.println(end);

        // /
        end = a / b;
        System.out.println(end);

        // *
        end = a * b;
        System.out.println(end);

        // toplama
        // çıkarma
        // bölme
        // çarpma

        // % - mod alma
        end = end % 11;
        endSum = endSum % 11;
        System.out.println(end);
        System.out.println(endSum);

        // ++
        // kendi değerine 1 ekler ve kendisini günceller
        int x = 10;
        x++; // x = x + 1
        System.out.println(x);

        // 10 ile kısa toplama
        x += 10; // x = x + 10;
        System.out.println(x);

        // x = 21
        System.out.println( x++ );
        System.out.println( x );

        --x;--x;--x;--x;--x;--x;
        System.out.println(x);

        // Mantıksal Operatörler
        // ==
        // !=
        // >
        // <
        // >=
        // <=
        // boolean - true - false
        boolean status = false;
        int q = 10;
        int w = 11;

        // == -> eşit mi diye kıyaslama yapar
        status = q == w;
        System.out.println(status);

        // != -> eşit değil ise
        status = q != w;
        System.out.println(status);

        // > -> sol taraftaki değer sağ taraftakinden büyük ise
        status = q > w;
        System.out.println(status);

        // < -> sol taraftaki değer sağ taraftakinden küçük ise
        status = q < w;
        System.out.println(status);

        // >= -> sol taraftaki değer sağ taraftaki değerden büyük veya eşit ise
        status = q >= w;
        System.out.println(status);

        // <= -> sol taraftaki değer sağ taraftaki değerden küçük veya eşit ise
        status = q <= w;
        System.out.println(status);

        // String equals -> kıyaslama
        String email = "ali@mail.com";
        String userEmail = "alim@mail.com";
        status = email.equals(userEmail);
        System.out.println(status);

    }
}
