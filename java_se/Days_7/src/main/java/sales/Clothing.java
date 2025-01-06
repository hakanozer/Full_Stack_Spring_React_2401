package sales;

public class Clothing extends Product{

    @Override
    public int callDiscount() {
        return 5;
    }

    @Override
    public int price() {
        int price = 85;
        price = price - (price * callDiscount()) / 100;
        return price;
    }

}
