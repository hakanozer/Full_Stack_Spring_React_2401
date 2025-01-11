package propertiesArrayList;

import java.util.ArrayList;
import java.util.List;


public class MainApp {
    public static void main(String[] args) {

        // ArrayList<Product> products = new ArrayList<>();
        List<Product> list = new ArrayList<>();

        Product p1 = new Product();
        String[] imgs = {"1.jpg", "2.jpg", "3.jpg", "4.jpg"};
        Category c1 = new Category();
        c1.setCid(10);
        c1.setName("Elektronik");

        p1.setTitle("TV");
        p1.setDescription("TV Detail");
        p1.setPrice(10000);
        p1.setQuantity(10);
        p1.setImgPaths(imgs);
        p1.setCategory(c1);

        list.add(p1);




    }
}
