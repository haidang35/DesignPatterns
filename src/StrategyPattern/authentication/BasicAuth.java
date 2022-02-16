package StrategyPattern.authentication;

public class BasicAuth implements AuthStrategy{

    @Override
    public void auth() {
        System.out.println("Basic authentication");
    }
}
