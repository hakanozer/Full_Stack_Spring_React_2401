package appPack;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        // Nesne Üretimi
        Action xx = new Action();
        xx.a = 20;
        xx.a = 40;
        System.out.println( xx.a );

        Action yy = new Action();
        System.out.println(yy.a);
        yy.a = 50;
        System.out.println(yy.a);

        Action zz = new Action();
        System.out.println(zz.a);

        // Profile
        Profile tt = new Profile();
        System.out.println( tt.name );

        // Methods Call
        xx.write();

        xx.nameWrite("Erkan", "Bil");
        xx.nameWrite("Murat", "Bilsin");
        xx.nameWrite("Kasım", "Bilki");
        xx.nameWrite("Ali", "Bilirim");

        xx.userLogin("al", "a1234");
        xx.validPhone("5556667787");

        xx.fncAction(50.6, 77.8);

        xx.charSumNumber("Alanya", 100);

    }
}
