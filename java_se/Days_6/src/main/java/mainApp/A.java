package mainApp;

public class A extends Base {

    int a = 10;
    // private
    // protected - default
    // public

    public void sum() {
        System.out.println("sum: ");
        computer();
    }

    @Override
    public void call() {
        write("A Call");
    }


}
