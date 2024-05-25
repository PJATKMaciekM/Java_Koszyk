package main;

interface Promos_interface {
    void implement();
}
class disc5 implements Promos_interface {
    private Koszyk koszyk;
    public disc5(Koszyk koszyk) {
        this.koszyk = koszyk;
    }

    @Override
    public void implement() {
        if(koszyk.getSum() > 300) {
            for(int i = 0; i < koszyk.getCount(); i++){
                koszyk.getProduct(i).setDiscountPrice(koszyk.getProduct(i).getDiscountPrice()*0.95);
            }
        }
    }
}

public class Promos {
    Koszyk koszyk;
    Promos_interface disc5 = new disc5(koszyk);

}