package odev_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Odev5 {
    public static void main(String[] args) {

        B b = new B();
        C c = new C();

        System.out.println( A.name );
        b.degis();
        System.out.println( A.name );
        c.degis();
        System.out.println( A.name );
        sifirla();
        A.name = "Emre";
        System.out.println( A.name );

        Integer[] diz = {1,4,6,83,4,0,32};
        kiyas(diz);
    }

    static void sifirla() {
        A.name = "";
    }

    static void kiyas( Integer[] arr ) {
        List<Integer> ls = Arrays.asList(arr);
        Collections.sort(ls);
        System.out.println( ls.get(0) );
        Collections.reverse(ls);
        System.out.println( ls.get(0) );
    }

}
