package useStatic;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    int a = 10;
    static int b = 20;

    static List<String> ls = new ArrayList<String>();

    public static int sum(int a, int b) {
        return a + b;
    }

}
