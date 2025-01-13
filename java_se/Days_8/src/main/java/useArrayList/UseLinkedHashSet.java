package useArrayList;

import java.util.LinkedHashSet;
import java.util.Set;

public class UseLinkedHashSet {
    public static void main(String[] args) {

        Set<String> list = new LinkedHashSet<>();
        list.add("Ali");
        list.add("Bob");
        list.add("Bob");
        list.add("Bob");
        list.add("Jack");
        list.add("Tom");
        list.add("Tom");
        list.add("Tom");
        list.add("Erkan");
        list.add("Erkan");
        list.add("Erkan");
        list.add("Erkan");

        System.out.println(list);

        Set<User> set = new LinkedHashSet<>();
        User u1 = new User("Ali", "Bilmem", 30);
        User u2 = new User("Bülent", "Bil", 25);
        User u3 = new User("Bob", "Bil", 20);
        User u4 = new User("Jack", "Bilsin", 15);
        User u5 = new User("Ali", "Bilmem", 30);

        set.add(u1);
        set.add(u1);
        set.add(u2);
        set.add(u2);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u4);
        set.add(u5);
        set.add(u5);
        set.add(u5);
        set.add(u5);

        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u3.hashCode());
        System.out.println(u4.hashCode());
        System.out.println(u5.hashCode());

        System.out.println(set);


    }
}
