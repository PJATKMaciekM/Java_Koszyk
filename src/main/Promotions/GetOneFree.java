package main.Promotions;

import main.Koszyk;

public class GetOneFree extends Promo {
    public GetOneFree(Koszyk koszyk) {
        super(koszyk);
    }

    @Override
    public void implement() {
        backup();
        if(koszyk.getCount() == 3 && koszyk.getSum() > 0) {
            koszyk.sortAsc();
            koszyk.getProduct(0).setFree(true);
        }
        if(koszyk.getSum() <= 0) {
            undo();
        }
    }
}
