package useArrayList;

import java.util.HashSet;
import java.util.Set;

public class useSet {

    public static void main(String[] args) {

        Set<String> list = new HashSet();
        // Set ekleme algoritması - benzersizliği
        // eklem sırasında eklnen değerin hashcode büyüklüğüne göre sıralama yapar.
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


    }

}
