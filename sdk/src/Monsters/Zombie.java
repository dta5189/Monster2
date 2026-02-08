package Monsters;

public final class Zombie extends Monster {

    private int decayLevel;

    public Zombie(String name, int health, int attack, Powers power, int level, int decayLevel) {
        super(name, health, attack, power, level);
        this.decayLevel = decayLevel;
    }

    public int getDecayLevel(){
        return decayLevel;
    }
    @Override
    public void specialPowers() {
        System.out.println("Zombie activates " + getPower());
    }
}