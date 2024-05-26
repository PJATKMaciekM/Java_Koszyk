package main.Promotions;

import main.Koszyk;
import main.Product;

public class MugFree extends Promo{
    public MugFree(Koszyk koszyk){
        super(koszyk);
    }

    @Override
    public void implement() {
        backup();
        product = new Product("99", "Firmowy Kubek", true);
        if(koszyk.getSum() > 200) {
            koszyk.appendProduct(product);
        }
        if(koszyk.getSum() <= 0) {
            undo();
        }
    }
}
