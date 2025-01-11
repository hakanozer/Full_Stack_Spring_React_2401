package propertiesArrayList;

import lombok.Data;

@Data
public class Product {

    private String title;
    private String description;
    private double price;
    private int quantity;

    private String[] imgPaths;
    private Category category;


}
