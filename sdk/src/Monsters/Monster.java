package Monsters;

public abstract sealed class Monster
        permits Vampire, Werewolf, Zombie {

    private String name;
    private int health;
    private int attack;
    private Powers power;
    private int level;

    public Monster(String name, int health, int attack, Powers power, int level) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.power = power;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public Powers getPower() {
        return power;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setPower(Powers power) {
        this.power = power;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public abstract void specialPowers();
}

