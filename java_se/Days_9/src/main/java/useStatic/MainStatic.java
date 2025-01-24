package useStatic;

import javax.swing.text.html.parser.DocumentParser;

public class MainStatic {

    // static
    // oluşturulduktan sonra bellekten silinmeyen
    // static üyeler sınıfa ait olmak zorundadırlar.
    // nesneler, fonksiyonlar,değişkenler static olabilirler.
    // staticler -> bellekte normal (değişkenlere, fonksiyonlara..) göre farklı bir alanda saklanırlar.

    public static void main(String[] args) {

        MainStatic mainStatic = new MainStatic();
        mainStatic.call1();

        Computer.b = 55;
        System.out.println( Computer.b );
        int sm = Computer.sum(50,777);
        System.out.println(sm);

        boolean status = Security.loginControl(50);

        Computer.ls.add("Ali");

    }

    public static void write() {
        System.out.println("Write Call");
    }

    public void call1() {
        String name = "Call - 1";
        System.out.println(name);
    }

    public void call2() {
        call1();
        String surname = "Call - 2";
        System.out.println(surname);
    }


}