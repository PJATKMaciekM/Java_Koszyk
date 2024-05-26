package test;

import main.Koszyk;
import main.Product;
import main.Promotions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Promos_Test {
    private Koszyk koszyk_zak;
    private Product product;
    private Disc5 disc5;
    private MugFree mugFree;
    private Coupon30off coupon30off;
    private GetOneFree getOneFree;
    private CouponMinus couponMinus;
    @BeforeEach
    void setUp() {
        koszyk_zak = new Koszyk();
        product = new Product("0", "Ser", 120.89);
        koszyk_zak.appendProduct(product);
        product = new Product("1", "Maslo", 76.19);
        koszyk_zak.appendProduct(product);
        product = new Product("2", "Mleko", 140.72);
        koszyk_zak.appendProduct(product);
        disc5 = new Disc5(koszyk_zak);
        mugFree = new MugFree(koszyk_zak);
        coupon30off = new Coupon30off(koszyk_zak);
        getOneFree = new GetOneFree(koszyk_zak);
        couponMinus = new CouponMinus(koszyk_zak);
    }
    @Test
    void testdisc5() {
        disc5.implement();
        assertEquals(320.91, koszyk_zak.getSum(), 0.0001);
    }
    @Test
    void testmugFree() {
        mugFree.implement();
        koszyk_zak.sortAsc();
        assertEquals("Firmowy Kubek", koszyk_zak.getProduct(0).getName());
    }
    @Test
    void testcoupon30off() {
        coupon30off.setId(1);
        coupon30off.implement();
        assertEquals(53.34, koszyk_zak.getProduct(1).getDiscountPrice(), 0.01);
    }
    @Test
    void testgetOneFree() {
        getOneFree.implement();
        assertEquals(0, koszyk_zak.getProduct(0).getDiscountPrice(), 0.00001);
    }
    @Test
    void testcouponMinus() {
        couponMinus.implement();
        assertEquals(327.8, koszyk_zak.getSum());
    }
    @Test
    void testCombined_disc5_minus() {
        disc5.implement();
        couponMinus.implement();
        assertEquals(310.91, koszyk_zak.getSum(), 0.000001);
    }
    @Test
    void testCombined_Onefree_30off() {
        getOneFree.implement();
        coupon30off.setId(2);
        coupon30off.implement();
        assertEquals(219.394, koszyk_zak.getSum());
    }
    @Test
    void testCombined_disc5_30off() {
        disc5.implement();
        coupon30off.setId(2);
        coupon30off.implement();
        assertEquals(285.73, koszyk_zak.getSum());
    }

}
