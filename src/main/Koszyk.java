package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Koszyk {
    public ArrayList<Product> koszyk_zak;
    private int count;
    public Koszyk() {
        koszyk_zak = new ArrayList<Product>();
        count = 0;
    }
    public void appendProduct(Product product){
        koszyk_zak.add(product);
        count++;
    }
    public Product getProduct(int idx){
        return koszyk_zak.get(idx);
    }
    public List<Product> getProducts(int idx){
        if(idx >= 0 && idx < koszyk_zak.size()){
            return koszyk_zak.subList(0, idx);
        }
        return null;
    }
    public int getCount() {
        return count;
    }
    public double getSum() {
        double sum = 0;
        for(int i=0; i<count; i++){
            sum += koszyk_zak.get(i).getPrice();
        }
        return sum;
    }
    public List<Product> sort(Comparator<Product> comparator){
        koszyk_zak.sort(comparator);
        return koszyk_zak;
    }


}
Comparator<Product> asc = new Comparator<Product>() {
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
};
Comparator<Product> dsc = new Comparator<Product>() {
    public int compare(Product p1, Product p2) {
        return Double.compare(p2.getPrice(), p1.getPrice());
    }
};

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
class sortAphUp implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
abstract class sortAphDown implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p2.getName().compareTo(p1.getName());
    }
}
