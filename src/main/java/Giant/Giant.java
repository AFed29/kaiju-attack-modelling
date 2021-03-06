package Giant;


import DamageInterface.IDamage;

public abstract class Giant implements IDamage {
    private String name;
    private int healthValue;
    private int attackValue;

    public Giant(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void loseHealth(int attack) {
        this.healthValue -= attack;
    }
}
