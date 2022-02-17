package strategy_pattern.payment;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private HashMap<String, Double> items = new HashMap<String, Double>();

    public void addItem(CartItem item)
    {
        this.items.put(item.getUpcCode(), item.getPrice());
    }

    public void removeItem(String upcCode)
    {
        this.items.remove(upcCode);
    }

    public double calcTotal()
    {
        double amount = 0;
        for(Map.Entry<String, Double> item : items.entrySet()) {
            amount += item.getValue();
        }
        return amount;
    }

    public void pay(PaymentStrategy payment) {
        double amount = this.calcTotal();
        payment.pay(amount);
    }
}
