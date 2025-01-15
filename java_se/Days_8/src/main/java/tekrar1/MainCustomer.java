package tekrar1;

public class MainCustomer {
    public static void main(String[] args) {

        Customer customer = new Customer(); // age -> ram
        System.out.println( customer.age ); // age -> ram

        customer.addAddressLines("Gaziantep", "Konya", "Bursa", "Hatay");

    }
}
