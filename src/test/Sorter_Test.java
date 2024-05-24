package test;

import main.Koszyk;
import main.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Sorter_Test {
    private Koszyk koszyk_zak;
    private Product product;
    private Comparator<Product> comparator;
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
    void sortUp_Test() {
        List<Product> expected = Arrays.asList(new Product(2, "Mleko", 2),new Product(0, "Ser", 5.99), new Product(1, "Maslo", 7.62));
        List<Product> actual = koszyk_zak.sort(new )
        assertEquals(expected, actual);
    }
}
