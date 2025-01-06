package sales;

public class MainProduct {
    public static void main(String[] args) {

        Product ePro = new Electronics();
        Product cPro = new Clothing();

        System.out.println( ePro.price() );
        System.out.println( cPro.price() );

    }
}
