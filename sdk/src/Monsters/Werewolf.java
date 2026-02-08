package Monsters;


public final class Werewolf extends Monster {

    private String furColor;


    public Werewolf(String name, int health, int attack, Powers power, int level, String furColor) {
        super(name, health, attack, power, level);
        this.furColor = furColor;
    }
    public String getFurColor(){
        return furColor;
    }

    @Override
    public void specialPowers() {
        System.out.println("Werewolf unleashes " + getPower());
    }
}