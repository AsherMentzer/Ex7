package hamburgersDecorator;

public class ChipsDecorator extends HamburgerDecorator{

    public ChipsDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return super.serve()+" with chips";
    }
}
