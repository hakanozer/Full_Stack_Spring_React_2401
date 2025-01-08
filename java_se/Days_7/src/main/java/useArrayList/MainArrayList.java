package useArrayList;

import java.util.*;

public class MainArrayList {

    public static void main(String[] args) {

        String[] users = {"Ali", "Zeki", "Hasan", "Mehmet"};
        System.out.println(users);
        // dizi -> immutable

        // ArrayList
        // <String> -> Generic
        ArrayList<String> list = new ArrayList<>();

        // item ekleme
        list.add("Ali");
        list.add("Zeki");
        list.add("Hasan");
        list.add("Mehmet");
        list.add("Zehra");
        list.add("Selin");
        list.add("Serkan");
        list.add("Ahmet");

        // Runtime
        Scanner scanner = new Scanner(System.in);
        // exit -> dur
        for (;;) {
            System.out.println("Lütfen ad giriniz!");
            //String name = scanner.nextLine();
            String name = "exit";
            if (name.equals("exit")) {
                break;
            }
            list.add(name);
        }

        // loop
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String item = list.get(i);
            System.out.println(item);
        }
        System.out.println("===================");
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("===================");

        // remove item
        //list.remove(0);
        //list.remove("Mehmet");
        //list.clear();

        // add index
        list.add(1, "Erkan");

        // contains
        boolean status = list.contains("Zehra");
        System.out.println("Zehra Status : " + status);

        // indexof
        int indexOf = list.indexOf("Seli");
        System.out.println("Selin : " + indexOf);

        // item set
        int indexOf2 = list.indexOf("Hasan");
        list.set(indexOf2, "Kemal");

        System.out.println(list);

        // sort
        Collections.sort(list);

        // tüm elemanları yazdırma
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        // array to List
        List<String> usersList = Arrays.asList(users);

    }

}
