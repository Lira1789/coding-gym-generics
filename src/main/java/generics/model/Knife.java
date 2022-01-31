package generics.model;

public class Knife extends BladeWeapon {

    public Knife(int damage, int stubCount) {
        super(damage, stubCount);
    }

    @Override
    public void stub() {
        int stubsForOneAttack = 50;

        if (stubCount < stubsForOneAttack) {
            System.out.println("Sharpening.....");
            stubCount += stubsForOneAttack;
        }

        System.out.println(String.format("Stubbing: %d", stubsForOneAttack));
        stubCount -= stubsForOneAttack;
    }

    public void cutOffHead() {
        System.out.println("Cut off the head");
    }

    @Override
    public String toString() {
        return "Knife{" +
                "stubCount=" + stubCount +
                ", damage=" + damage +
                '}';
    }
}
