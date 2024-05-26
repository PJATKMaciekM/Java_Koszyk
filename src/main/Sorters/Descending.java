package main.Sorters;

import main.Product;
import java.util.Comparator;

public class Descending implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return (int)(p2.getDiscountPrice() - p1.getDiscountPrice());
    }

}