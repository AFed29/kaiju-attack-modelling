package Kaiju;

public class Category4 extends Kaiju implements IFly {

    public Category4(String name) {
        super(name, 400, 120);
    }

    @Override
    public String roar() {
        return "ROAAAARRR!!";
    }

    @Override
    public String fly() {
        return getName() + " flies away...";
    }
}
