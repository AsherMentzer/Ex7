package hamburgersDecorator;

public class ClassicHamburger implements Hamburger {
    @Override
    public String serve() {
        return "hamburgersDecorator.ClassicHamburger";
    }
}