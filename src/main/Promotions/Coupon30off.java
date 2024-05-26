package main.Promotions;

import main.Koszyk;

public class Coupon30off extends Promo{
    private boolean active = true;
    private int id;
    public Coupon30off(Koszyk koszyk){
        super(koszyk);
    }

    @Override
    public void implement() {
        backup();
        if(active){
            koszyk.getProduct(id).setDiscountPrice(koszyk.getProduct(id).getPrice()*0.7);
            active = false;
        }
        if(koszyk.getSum() <= 0) {
            undo();
        }
    }
    public void setId(int id){
        this.id = id;
    }

}
