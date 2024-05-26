package main.Sorters;

import main.Product;
import java.util.Comparator;

public class Ascending implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return (int)(p1.getDiscountPrice() - p2.getDiscountPrice());
    }

}
