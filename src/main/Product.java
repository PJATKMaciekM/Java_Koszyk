package main;


public class Product {
    private String id;
    private String name;
    private double price;
    private double discountPrice;
    private boolean free;
    public Product(String id, String name, double price, double discountPrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountPrice = discountPrice;
        checkPrice();
    }
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountPrice = price;
    }
    public Product(String id, String name, boolean free) {
        this.id = id;
        this.name = name;
        if(free){this.discountPrice = 0;}
    }
    public Product() {}
    public String getId() {
        return id;
    }
    public void setId(String id) {
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
    public boolean isFree() {
        return free;
    }
    public void setFree(boolean free) {
        this.free = free;
        if(free) {
            this.discountPrice = 0;
        }
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
        }
    }
    public String toString() {
        return id + " " + name + " " + price;
    }
}
