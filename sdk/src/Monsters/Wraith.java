package Monsters;

public final class Wraith extends Monster {

    private int transparencyLevel;

    public Wraith(String name, int health, int attack, Powers power, int level, int transparencyLevel) {
        super(name, health, attack, power, level);
        this.transparencyLevel = transparencyLevel;
    }

    public int getTransparencyLevel(){
        return transparencyLevel;
    }

    @Override
    public void specialPowers() {
        System.out.println("Wraith fades into the shadows using " + getPower());
    }
}
