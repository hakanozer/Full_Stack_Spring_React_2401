package main_app;

public class MainArray {
    public static void main(String[] args) {

       // Dizi - Array
       // birden fazla değerin tek bir değişken altında toplanması davranışı
        // dizi değerleri için index kullanılır.
            // 0 dan başlar
            // names[0]

        String name = "Ali Bilmem";
        String name1 = "Ahmet Bil";
        String name2 = "Serkan Bilirim";
        String name3 = "Zehra Bilsin";

        String[] names = {"Ali Bilmem", "Ahmet Bil", "Serkan Bilirim", "Zehra Bilsin"};
        int index = 2;
        int size = names.length;
        System.out.println(size);

        System.out.println(name);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        if (size > index) {
            System.out.println(names[index]);
        }else {
            System.out.println("index error!");
        }

        double[] doubles = {10.6, 77.5, 33.4, 35.7, 32.33, 899.07};
        System.out.println(doubles.length);
        System.out.println(doubles[1]);


    }
}
