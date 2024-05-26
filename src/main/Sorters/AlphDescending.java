package main.Sorters;

import main.Product;
import java.util.Comparator;

public class AlphDescending implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p2.getName().compareToIgnoreCase(p1.getName());
    }

}
