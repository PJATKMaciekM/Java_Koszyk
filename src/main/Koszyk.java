package main;

import java.util.ArrayList;

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
    public Product getProducts(int idx){
        for(int i=0; i<idx; i++){
            return koszyk_zak.get(i);
        }
        return null;
    }
    public double getSum() {
        double sum = 0;
        for(int i=0; i<count; i++){
            sum += koszyk_zak.get(i).getPrice();
        }
        return sum;
    }

}

