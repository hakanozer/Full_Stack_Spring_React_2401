package useAbstract;

abstract public class Customer {

    abstract int customerID();

    public String name() {
        int customerID = customerID();
        if (customerID == 0) {
            return "Kemal Customer";
        }else if (customerID == 1) {
            return "Harry Potter";
        }
        return "Unknown Customer";
    }

}
