package StrategyPattern.payment;

public class PaypalStrategy implements PaymentStrategy{
    private String email;
    private String password;

    public PaypalStrategy(String email, String pwd) {
        this.email = email;
        this.password = pwd;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using Paypal.");
    }

}
