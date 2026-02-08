package Monsters;


public final class Vampire extends Monster {

    private int fangLength; // unique to vampire

    public Vampire(String name, int health, int attack, Powers power, int level, int fangLength) {
        super(name, health, attack, power, level);
        this.fangLength = fangLength;
    }

    public int getFangLength() {
        return fangLength;
    }

    @Override
    public void specialPowers() {
        System.out.println("Vampire bites with fangs of length " + fangLength);
    }
}