package Jaeger;

import Giant.Giant;
import Kaiju.Kaiju;

public abstract class Jaeger extends Giant {
    private String countryOfOrigin;

    public Jaeger(String name, int healthValue, int attackValue, String countryOfOrigin) {
        super(name, healthValue, attackValue);
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return this.countryOfOrigin;
    }

    public void rocketPunch(Kaiju kaiju) {
        kaiju.loseHealth(getAttackValue());
    }

}
