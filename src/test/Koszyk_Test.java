package test;

import main.Koszyk;
import main.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Koszyk_Test {
    private Koszyk koszyk_zak;
    private Product product;
    @BeforeEach
    void setUp() {
        koszyk_zak = new Koszyk();
    }

    @Test
    void testappendProduct() {
        product = new Product(0, "Ser", 5.99);
        koszyk_zak.appendProduct(product);
        assertEquals("0 Ser 5.99", koszyk_zak.getProduct(0).toString());
    }
    @Test
    void testappendProducts() {
        product = new Product(0, "Ser", 5.99);
        koszyk_zak.appendProduct(product);
        product = new Product(1, "Maslo", 7.62);
        koszyk_zak.appendProduct(product);
        assertEquals(2, koszyk_zak.getCount());
    }
    @Test
    void testgetProducts() {
        List<Product> expected = Arrays.asList(new Product(0, "Ser", 5.99), new Product(1, "Maslo", 7.62));
        product = new Product(0, "Ser", 5.99);
        koszyk_zak.appendProduct(product);
        product = new Product(1, "Maslo", 7.62);
        koszyk_zak.appendProduct(product);
        product = new Product(2, "Mleko", 2);
        koszyk_zak.appendProduct(product);
        List<Product> actual = koszyk_zak.getProducts(2);
        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void testgetSum() {
        product = new Product(0, "Ser", 5.99);
        koszyk_zak.appendProduct(product);
        product = new Product(1, "Maslo", 7.62);
        koszyk_zak.appendProduct(product);
        product = new Product(2, "Mleko", 2);
        koszyk_zak.appendProduct(product);
        assertEquals(15.61, koszyk_zak.getSum());
    }
}
