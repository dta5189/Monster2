package Monsters;

public final class Demon extends Monster {

    private int hornCount;

    public Demon(String name, int health, int attack, Powers power, int level, int hornCount) {
        super(name, health, attack, power, level);
        this.hornCount = hornCount;
    }

    public int getHornCount(){
        return hornCount;
    }
    @Override
    public void specialPowers(){
        System.out.println("Demon Azrael has lifted a car using " + getPower());
    }
}
