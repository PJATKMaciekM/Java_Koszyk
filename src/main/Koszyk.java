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
    public Koszyk(Koszyk koszyk_bcp) {
        this.koszyk_zak = koszyk_bcp.koszyk_zak;
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
            sum += koszyk_zak.get(i).getDiscountPrice();
        }
        return sum;
    }
    public List<Product> sort(Comparator<Product> comparator){
        koszyk_zak.sort(comparator);
        return koszyk_zak;
    }
}