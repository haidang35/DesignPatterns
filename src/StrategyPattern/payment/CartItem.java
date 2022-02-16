package StrategyPattern.payment;

public class CartItem {
    private String upcCode;
    public double price;

    public CartItem(String upcCode, double price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getUpcCode() {
        return upcCode;
    }
}
