package main.Promotions;

import main.Koszyk;
import main.Sorters.Ascending;

public class GetOneFree extends Promo {
    private Ascending asc = new Ascending();
    public GetOneFree(Koszyk koszyk) {
        super(koszyk);
    }

    @Override
    public void implement() {
        backup();
        if(koszyk.getCount() == 3 && koszyk.getSum() > 0) {
            koszyk.sort(asc);
            koszyk.getProduct(0).setFree(true);
        }
        if(koszyk.getSum() <= 0) {
            undo();
        }
    }
}
