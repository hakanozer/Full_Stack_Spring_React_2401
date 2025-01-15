package tekrar4;

import java.util.*;

public class Tekrar4 {
    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setName("Ali");
        c1.setEmail("ali@gmail.com");

        Customer c2 = new Customer("Erkan", "erkan@mail.com");

        List<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);

        System.out.println(customers);

        List<Customer> l1 = new ArrayList<>();
        Set<Customer> l2 = new HashSet<>(); // nesneler benzersiz - sıralama karışık
        Set<Customer> l3 = new LinkedHashSet<>(); // nesneler benzersiz - sıralama algoritmasi bizim eklediğimiz sıraya göre gider.


    }
}
