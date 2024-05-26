package main.Promotions;

import main.Koszyk;

public class CouponMinus extends Promo{
    public CouponMinus(Koszyk koszyk) {
        super(koszyk);
    }

    @Override
    public void implement() {
        backup();
        if(koszyk.getSum() > 100) {
            for(int i = 0; i < koszyk.getCount(); i++) {
                koszyk.getProduct(i).setDiscountPrice(koszyk.getProduct(i).getDiscountPrice() - ((double) 10 / koszyk.getCount()));
            }
        }
        if(koszyk.getSum() <= 0) {
            undo();
        }
    }
}
