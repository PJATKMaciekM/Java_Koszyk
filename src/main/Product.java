package main;


public class Product {
    private int id;
    private String name;
    private double price;
    private double discountPrice;
    public Product(int id, String name, double price, double discountPrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountPrice = discountPrice;
        checkPrice();
    }
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Product() {}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
        checkPrice();
    }
    public double getDiscountPrice() {
        return discountPrice;
    }
    public void setDiscountPrice(double discountPrice) {
        if (discountChecker(discountPrice)) {
            this.discountPrice = discountPrice;
            checkPrice();
        } else {
            this.discountPrice = price;
        }
    }
    private boolean discountChecker(double discountPrice) {

        return !(discountPrice <= 0);
    }
    private void checkPrice() {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        } else if (discountPrice < price) {
            price = discountPrice;
        }
    }
    public String toString() {
        return id + " " + name + " " + price;
    }
}
