package tekrar;

public class MainTekrar {
    public static void main(String[] args) {

        String name = "Ali";
        String surname = "Ali";
        String city = new String("İstanbul");

        int a = 10;
        int b = 10;
        Integer c = 10; // nesne

        System.out.println( name.hashCode() );
        System.out.println( surname.hashCode() );

        Product product = new Product();
        System.out.println( product.age );


        // city - dizi - String
        String[] cities = {"Adana", "Hatay", "Konya", "Gaziantep"};
        for (int i = 0; i < cities.length; i++) {
            String item = cities[i];
            if (item.equals("Hatay")) {
                continue;
            }
            int size = item.length();
            System.out.println( size );
        }

        Action action = new Action(100);
        // 1 - Class Name
        // 2 - action - Nesne
        // 3 -
        String end = action.call();
        System.out.println(end);

    }
}
