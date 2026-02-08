package Monsters;

public final class Demon extends Monster {

    public Demon(String name, int health, int attack, Powers power, int level) {
        super(name, health, attack, power, level);


    }
    @Override
    public void specialPowers(){
        System.out.println("Demon Azrael has lifted a car using" + getPower());
    }
}
