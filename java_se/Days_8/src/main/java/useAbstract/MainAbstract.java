package useAbstract;

public class MainAbstract {
    public static void main(String[] args) {

        Customer customer = new Customer() {
            @Override
            int customerID() {
                return 10;
            }
        };
        customer.name();

        Person person = new Person();
        person.name();


    }
}
