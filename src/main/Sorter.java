package main;

import java.util.Comparator;

abstract class sortUp implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return (int)(p1.getPrice() - p2.getPrice());
    }
}
abstract class sortDown implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return (int)(p2.getPrice() - p1.getPrice());
    }
}
abstract class sortAphUp implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
abstract class sortAphDown implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p2.getName().compareTo(p1.getName());
    }
}
