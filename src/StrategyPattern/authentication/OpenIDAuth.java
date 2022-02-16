package StrategyPattern.authentication;

public class OpenIDAuth implements AuthStrategy{
    @Override
    public void auth() {
        System.out.println("OpenID authentication");
    }
}
