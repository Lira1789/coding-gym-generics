package generics.model;

public class Machete extends BladeWeapon {

    public Machete(int damage, int stubCount) {
        super(damage, stubCount);
    }

    @Override
    public void stub() {
        int stubsForOneAttack = 100;

        if (stubCount < stubsForOneAttack) {
            System.out.println("Sharpening.....");
            stubCount += stubsForOneAttack;
        }

        System.out.println(String.format("Stubbing: %d", stubsForOneAttack));
        stubCount -= stubsForOneAttack;
    }

    public void cutOffArms() {
        System.out.println("Cut off the arms");
    }

    @Override
    public String toString() {
        return "Machete{" +
                "stubCount=" + stubCount +
                ", damage=" + damage +
                '}';
    }
}
