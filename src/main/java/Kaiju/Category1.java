package Kaiju;

public class Category1 extends Kaiju {
    public Category1(String name) {
        super(name, 100, 30);
    }

    @Override
    public String roar() {
        return "rawww";
    }
}
