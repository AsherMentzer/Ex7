package hamburgersDecorator;

public class LambHamburger implements Hamburger {
    @Override
    public String serve() {
        return "hamburgersDecorator.LambHamburger";
    }
}
