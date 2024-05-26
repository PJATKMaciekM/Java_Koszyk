package main.Promotions;

import main.Koszyk;
import main.Product;

public abstract class Promo {
    public Koszyk koszyk;
    public Koszyk backup;
    public Product product;

    Promo(Koszyk koszyk) {
        this.koszyk = koszyk;
    }

    void backup() {
        backup = new Koszyk(koszyk);
    }

    void undo() {
        koszyk = new Koszyk(backup);
    }

    public abstract void implement();
}
