package hamburgersDecorator;

public class HamburgerFactory {
    public static Hamburger createHamburger(String code){
        switch (code) {
            case "":
                return null;
            case "cl":
                return new ClassicHamburger();
            case "sp":
                return new SpicyHamburger();
            case "la":
                return new LambHamburger();
            case "hm":
                return new HomemadeHamburger();
            default:
                throw new RuntimeException("wrong hamburgersDecorator.Hamburger");
        }
    }
}

