package tekrar1;

public class Customer {

    // public;
    // private;
    // protected;
    String surname = "Bilmem";
    int age = 30;

    public Customer() {
        System.out.println(age);
    }

    public void call() {
        String name = "Kasım";
        System.out.println(name);
    }

    public void call1() {
        System.out.println(surname);
    }

    public void call1(String name) {
        System.out.println(name);
    }

    public void addAddressLines(String... lines) {

    }


}
