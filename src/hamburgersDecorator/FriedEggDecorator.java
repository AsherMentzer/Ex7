package hamburgersDecorator;

public class FriedEggDecorator extends HamburgerDecorator{
    public FriedEggDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return super.serve()+" with fried egg";
    }
}
