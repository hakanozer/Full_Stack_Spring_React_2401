package main_app;

public class ForEach {
    public static void main(String[] args) {

        String[] users = {
                "Kemal Yılmaz", "Ayşe Demir", "Mehmet Kaya", "Fatma Çelik", "Ali Şahin",
                "Emine Öz", "Mustafa Aydın", "Zeynep Kılıç", "Hüseyin Arslan", "Elif Yıldız",
                "Hasan Koç", "Merve Aksoy", "İbrahim Güneş", "Seda Polat", "Osman Kurt",
                "Gülşah Çetin", "Kemal Er", "Derya Uçar", "Yusuf Can", "Büşra Eren"
        };
        
        // currentTimeMillis -> 1970'ten şimdiki zamana kadar geçen milisaniye süresidir.
        long start = System.currentTimeMillis();
        for (int i = 4; i < users.length - 3; i++) {
            String item = users[i];
            System.out.println( item );
        }
        long end = System.currentTimeMillis();
        System.out.println( users.length );
        System.out.println( "finish: " +  (end - start) );

        System.out.println("=========================");
        // özel for
        // for each
        for (String item : users) {
            if ( item.equals("Mehmet Kaya") ) {
                continue;
            }
            System.out.println( item );
        }

        System.out.println("=========================");
        // For users tersten yazdırma
        for (int i = users.length - 1; i >= 0; i--) {
            String item = users[i];
            System.out.println(item);
        }

        System.out.println("=========================");
        // 1- 100 arasındaki çift sayıları
        int cift = 0;
        int count = 0;
        for (int i = 0; i < 100; i = i + 2) {
            System.out.println(i);
            //cift = cift + i;
            cift += i;
            count++;
        }
        System.out.println("cift: " + cift);
        System.out.println("Count :" + count);
        System.out.println("Aritmetik :" + (cift / count) );

    }
}
