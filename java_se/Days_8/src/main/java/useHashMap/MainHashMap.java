package useHashMap;

import java.util.*;

public class MainHashMap {
    public static void main(String[] args) {

        // HashMap
        // Runtime'da veri ekleme - çıkarma işlemi yapılır.
        // key - value anahtar çifti ile çalışır
        // index kavramı yoktur.
        // key değerleri aynı olduğunda replace(üzerine yazma) yapar.
        // sıralama algoritmasını dikkate almaz
            // çünkü burada index kavramı yoktur.

        HashMap<String, Object> map = new HashMap<>();
        // değer ekleme - put
        map.put("title", "TV");
        map.put("title", "iPhone");
        map.put("description", "iPhone OS");
        map.put("price", 150.0);
        map.put("stock", 5);
        map.put("status", true);

        // size
        int size = map.size();
        System.out.println("Size :" + size);

        // get item - key
        System.out.println( map.get("price") );

        // get keys
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key : keys) {
            Object value = map.get(key);
            System.out.println(key +" - " +value);
        }
        System.out.println("===================");
        map.forEach( (key, val) -> {
            System.out.println(key +" - " + val);
        });

        System.out.println("===================");
        // map.clear();
        // map.remove("price");
        map.remove("title", "iPhonex");

        boolean statusKey = map.containsKey("titlex");
        System.out.println(statusKey);

        Object data = map.getOrDefault("titlex", "No title");
        System.out.println(data);

        Map<String, Object> map1 = new HashMap<>();
        map1.put("color", "black");
        map1.put("camera", 3);
        map.putAll(map1);

        System.out.println("===================");
        Collection<Object> values = map.values();
        for (Object val : values) {
            if (val instanceof String) {
                System.out.println("String: ");
            }
            if (val instanceof Integer) {
                System.out.println("Integer: ");
            }
            System.out.println(val);
        }

        System.out.println( map );

    }
}
