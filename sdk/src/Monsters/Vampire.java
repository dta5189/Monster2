package Monsters;


public final class Vampire extends Monster {

    public Vampire(String name, int health, int attack, Powers power, int level) {
        super(name, health, attack, power, level);
    }

    @Override
    public void specialPowers() {
        System.out.println("Vampire uses " + getPower());
    }
}