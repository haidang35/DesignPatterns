package StrategyPattern.authentication;

public class OAuth implements AuthStrategy {

    @Override
    public void auth() {
        System.out.println("Open authentication");
    }
}
