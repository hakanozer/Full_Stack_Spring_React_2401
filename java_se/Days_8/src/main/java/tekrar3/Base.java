package tekrar3;

public class Base {

    public Base() {
        System.out.println("Base Call");
    }

    public void call() {
        write(0);
    }

    final public void write(int x) {
        x = x * x;
        System.out.println(x);
    }

}
