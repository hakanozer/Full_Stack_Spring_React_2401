package mainApp;


public class MainBase {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        a.call();
        b.call();
        c.call();

        int number1 = 10;
        number1 = 20;

        final int number2 = 50;
        final String password = "12345";

        Action action = new Action();


    }

}
