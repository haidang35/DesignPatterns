package StrategyPattern.payment;

public class StrategyPatternExample {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        CartItem item1 = new CartItem("00123456", 5000);
        CartItem item2 = new CartItem("00123555", 6000);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.pay(new CreditCardStrategy("Demo", "123456789", "489", "12/24"));
        shoppingCart.pay(new PaypalStrategy("abdc@gmail.com", "123456789abc"));
    }
}
