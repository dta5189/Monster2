package Monsters;


public final class Werewolf extends Monster {

    public Werewolf(String name, int health, int attack, Powers power, int level) {
        super(name, health, attack, power, level);
    }

    @Override
    public void specialPowers() {
        System.out.println("Werewolf unleashes " + getPower());
    }
}