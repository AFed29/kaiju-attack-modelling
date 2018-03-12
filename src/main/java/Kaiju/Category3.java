package Kaiju;

public class Category3 extends Kaiju {

    public Category3(String name) {
        super(name, 300, 90);
    }

    @Override
    public String roar() {
        return "Roar!";
    }
}
