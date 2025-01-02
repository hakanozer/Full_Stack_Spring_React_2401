package useAbstract;

abstract public class Customer {

    abstract int customerID();
    int id = customerID();

    public String name() {
        String data = "";
        if (id == 100) {
            data = "Kemal Bilsin";
        }else if (id == 101) {
            data = "Ayşe Bil";
        }
        return data;
    }

    public int total() {
        int total = 0;
        if (id == 100) {
            total = 1000000;
        } else if (id == 101) {
            total = 2000000;
        }
        return total;
    }


}
