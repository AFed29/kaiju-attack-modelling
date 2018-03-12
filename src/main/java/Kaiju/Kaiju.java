package Kaiju;

import Giant.Giant;

public abstract class Kaiju extends Giant {

    public Kaiju(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public abstract String roar();
}
