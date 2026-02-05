package Monsters;


//you can now manipulate the powers since we have a setter
public class Main {
    public static void main(String[] args) {
        Monster m1 = new Vampire("Dracula", 100, 40, Powers.FLIGHT, 5);
        m1.setPower(Powers.BLOOD_MANIPULATION);
        m1.setPower(Powers.SHAPESHIFT);

        Monster m2 = new Werewolf("George", 100, 50, Powers.SHAPESHIFT, 10);
        m2.setPower(Powers.BITE);
        m2.setPower(Powers.AGILITY);
        m2.setPower(Powers.SHAPESHIFT);

        Monster m3 = new Zombie("Frank", 200, 30, Powers.SUPER_STRENGTH, 3);
        m3.setPower(Powers.BITE);

    }
}
