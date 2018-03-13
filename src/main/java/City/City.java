package City;

import DamageInterface.IDamage;

public class City implements IDamage {
    private String name;
    private int healthValue;

    public City(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
    }

    @Override
    public int getHealthValue() {
        return this.healthValue;
    }

    @Override
    public void loseHealth(int attack) {
        this.healthValue -= attack;
    }
}
