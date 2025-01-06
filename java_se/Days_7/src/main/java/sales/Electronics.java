package sales;

public class Electronics extends Product {

    @Override
    public int callDiscount() {
        return 10;
    }

    @Override
    public int price() {
        int price = 60;
        price = price - (price * callDiscount()) / 100;
        return price;
    }


}
