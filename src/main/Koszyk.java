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
    Comparator<Product> asc = Comparator.comparingDouble(Product::getPrice);
    Comparator<Product> dsc = (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice());
    Comparator<Product> alpAsc = Comparator.comparing(Product::getName);
    Comparator<Product> alpDsc = (p1, p2) -> p2.getName().compareTo(p1.getName());

    public List<Product> sortAsc(){
        koszyk_zak.sort(asc);
        return koszyk_zak;
    }
    public List<Product> sortDsc(){
        koszyk_zak.sort(dsc);
        return koszyk_zak;
    }
    public List<Product> sortAlpAsc(){
        koszyk_zak.sort(alpAsc);
        return koszyk_zak;
    }
    public List<Product> sortAlpDsc(){
        koszyk_zak.sort(alpDsc);
        return koszyk_zak;
    }
}