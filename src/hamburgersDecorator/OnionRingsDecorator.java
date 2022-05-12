package hamburgersDecorator;

public class OnionRingsDecorator extends HamburgerDecorator{
    public OnionRingsDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return super.serve()+" with onion rings";
    }
}
