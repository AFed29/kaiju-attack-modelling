package Kaiju;

public class Category2 extends Kaiju{

    public Category2(String name) {
        super(name, 200, 60);
    }

    @Override
    public String roar() {
        return "Raww";
    }
}
