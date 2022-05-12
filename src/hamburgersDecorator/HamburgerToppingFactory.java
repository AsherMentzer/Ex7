package hamburgersDecorator;

public class HamburgerToppingFactory {
    public static Hamburger createToppingHamburger(String code, Hamburger hamburger){

        if (code == null || hamburger == null)
            return null;
        switch (code){
            case "ch":
                return new ChipsDecorator(hamburger);
            case "or":
                return new OnionRingsDecorator(hamburger);
            case "sa":
                return new SaladDecorator(hamburger);
            case "fe":
                return new FriedEggDecorator(hamburger);
            default:
                throw new RuntimeException("wrong Topping");
        }
    }
}
