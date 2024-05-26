package test;

import main.Koszyk;
import main.Product;
import main.Sorters.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Sorter_Test {
    private Koszyk koszyk_zak;
    private Product product;
    private Ascending ascending;
    private Descending descending;
    private AlphAscending alphAscending;
    private AlphDescending alphDescending;
    @BeforeEach
    void setUp() {
        koszyk_zak = new Koszyk();
        product = new Product("0", "Ser", 5.99);
        koszyk_zak.appendProduct(product);
        product = new Product("1", "Maslo", 7.62);
        koszyk_zak.appendProduct(product);
        product = new Product("2", "Mleko", 2);
        koszyk_zak.appendProduct(product);
        ascending = new Ascending();
        descending = new Descending();
        alphAscending = new AlphAscending();
        alphDescending = new AlphDescending();
    }
    @Test
    void sortasc_Test() {
        List<Product> expected = Arrays.asList(new Product("2", "Mleko", 2),new Product("0", "Ser", 5.99), new Product("1", "Maslo", 7.62));
        List<Product> actual = koszyk_zak.sort(ascending);
        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void sortdsc_Test() {
        List<Product> expected = Arrays.asList(new Product("1", "Maslo", 7.62),new Product("0", "Ser", 5.99),new Product("2", "Mleko", 2));
        List<Product> actual = koszyk_zak.sort(descending);
        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void sortalpAsc_Test() {
        List<Product> expected = Arrays.asList(new Product("1", "Maslo", 7.62),new Product("2", "Mleko", 2),new Product("0", "Ser", 5.99));
        List<Product> actual = koszyk_zak.sort(alphAscending);
        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void sortalpDsc_Test() {
        List<Product> expected = Arrays.asList(new Product("0", "Ser", 5.99),new Product("2", "Mleko", 2),new Product("1", "Maslo", 7.62));
        List<Product> actual = koszyk_zak.sort(alphDescending);
        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void findCheap_Test() {
        koszyk_zak.sort(ascending);
        assertEquals("2 Mleko 2.0", koszyk_zak.getProduct(0).toString());
    }
    @Test
    void find2Cheap_Test() {
        List<Product> expected = Arrays.asList(new Product("2", "Mleko", 2),new Product("0", "Ser", 5.99));
        koszyk_zak.sort(ascending);
        assertEquals(expected.toString(), koszyk_zak.getProducts(2).toString());
    }
    @Test
    void findExp_Test() {
        koszyk_zak.sort(descending);
        assertEquals("1 Maslo 7.62", koszyk_zak.getProduct(0).toString());
    }
    @Test
    void find2Exp_Test() {
        List<Product> expected = Arrays.asList(new Product("1", "Maslo", 7.62), new Product("0", "Ser", 5.99));
        koszyk_zak.sort(descending);
        assertEquals(expected.toString(), koszyk_zak.getProducts(2).toString());
    }
}
