package main.Promotions;

import main.Koszyk;

public class Disc5 extends Promo {
    public Disc5(Koszyk koszyk) {
        super(koszyk);
    }

    @Override
    public void implement() {
        backup();
        if(koszyk.getSum() > 300) {
            for(int i = 0; i < koszyk.getCount(); i++) {
                koszyk.getProduct(i).setDiscountPrice(koszyk.getProduct(i).getDiscountPrice()*0.95);
            }
        }
        if(koszyk.getSum() <= 0) {
            undo();
        }
    }
}
