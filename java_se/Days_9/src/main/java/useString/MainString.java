package useString;

public class MainString {
    public static void main(String[] args) {

        String data = "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. Lorem Ipsum, adı bilinmeyen bir matbaacının bir hurufat numune kitabı oluşturmak üzere bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı sahte metinler olarak kullanılmıştır.";
        String xData = new String("Merhaba Ali");

        System.out.println( data.length() );

        String lower = data.toLowerCase();
        System.out.println( lower );
        System.out.println( data.toUpperCase() );

        int indexOf = data.indexOf("diz");
        System.out.println("indexOf :" + indexOf);
        String[] words = {"sum", "diz", "kul"};
        for (String word : words) {
            int index = data.indexOf(word);
            if (index != -1) {
                System.out.println("yorum yayına uygun değil!");
            }
        }

        boolean contains = data.contains("mıgır");
        System.out.println("contains :" + contains);

        String newData = data.replace("Lorem", "***");
        System.out.println(newData);

        String subString = data.substring(data.length() - 22, data.length() - 16);
        System.out.println(subString);

        String[] wordss = data.split(" ");
        for (String word : wordss) {
            word = word.replace(",", "").replace(".","");
            System.out.println(word);
        }

        String email = "ALi@Mail.com";
        boolean emailStatus = email.equalsIgnoreCase("ali@mail.com");
        if (emailStatus) {
            System.out.println("Login Status : " + emailStatus);
        }


    }
}
