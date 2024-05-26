package test;

import main.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Product_Test {
    private Product product;
    @BeforeEach
    void setUp() {
        product = new Product("1", "Ser", 5.99);
    }

    @Test
    void testGetName() {
        assertEquals("Ser", product.getName());
    }
    @Test
    void testSetId() {
        product.setId("2");
        assertEquals("2", product.getId());
    }
    @Test
    void testSetPrice() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> product.setPrice(-5.99));
        String expectedMessage = "Price must be greater than 0";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    void testSetDiscountPrice_wrong() {
        product.setDiscountPrice(-3.99);
        assertEquals(5.99, product.getPrice());
    }
    @Test
    void testSetDiscountPrice_right() {
        product.setDiscountPrice(3.99);
        assertEquals(3.99, product.getDiscountPrice());
    }
}

