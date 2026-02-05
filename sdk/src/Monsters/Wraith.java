package Monsters;

public final class Wraith extends Monster {

    public Wraith(String name, int health, int attack, Powers power, int level) {
        super(name, health, attack, power, level);
    }

    @Override
    public void specialPowers() {
        System.out.println("Wraith fades into the shadows using " + getPower());
    }
}
