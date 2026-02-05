package Monsters;

public final class Zombie extends Monster {

    public Zombie(String name, int health, int attack, Powers power, int level) {
        super(name, health, attack, power, level);
    }

    @Override
    public void specialPowers() {
        System.out.println("Zombie activates " + getPower());
    }
}