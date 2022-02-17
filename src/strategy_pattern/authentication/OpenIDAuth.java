package strategy_pattern.authentication;

public class OpenIDAuth implements AuthStrategy{
    @Override
    public void auth() {
        System.out.println("OpenID authentication");
    }
}
