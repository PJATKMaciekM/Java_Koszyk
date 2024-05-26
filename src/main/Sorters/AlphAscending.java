package main.Sorters;

import main.Product;
import java.util.Comparator;

public class AlphAscending implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p1.getName().compareToIgnoreCase(p2.getName());
    }

}
