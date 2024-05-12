package main;

public class Koszyk {
    private Product[] koszyk_zak;
    private int count;
    public Koszyk() {
        koszyk_zak = new Product[10];
        count = 0;
    }
    public void appendProduct(Product product){
        koszyk_zak[count] = product;
        count++;
    }
    public Product getProduct(int idx){
        return koszyk_zak[idx];
    }
    public Product getProducts(int idx){
        for(int i=0; i<idx; i++){
            return koszyk_zak[i];
        }
        return null;
    }
    public double getSum() {
        double sum = 0;
        for(int i=0; i<count; i++){
            sum += koszyk_zak[i].getPrice();
        }
        return sum;
    }
    public void sort() {

    }

}
