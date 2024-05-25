package test;

import main.Koszyk;
import main.Product;
import main.Promos;
import main.Promos_interface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class Promos_Test {
    private Koszyk koszyk_zak;
    private Product product;
    private Promos promos;
    @BeforeEach
    void setUp() {
        koszyk_zak = new Koszyk();
        product = new Product(0, "Ser", 5.99);
        koszyk_zak.appendProduct(product);
        product = new Product(1, "Maslo", 7.62);
        koszyk_zak.appendProduct(product);
        product = new Product(2, "Mleko", 2);
        koszyk_zak.appendProduct(product);
    }
    @Test
    void testdisc5() {


    }
}
