package Kaiju;

import Giant.Giant;
import Jaeger.Jaeger;

public abstract class Kaiju extends Giant {

    public Kaiju(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public abstract String roar();

    public void slash(Jaeger jaeger) {
        jaeger.loseHealth(getAttackValue());
    }
}
