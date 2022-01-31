package generics.model;

public class Katana extends BladeWeapon {

    public Katana(int damage, int stubCount) {
        super(damage, stubCount);
    }

    @Override
    public void stub() {
        int stubsForOneAttack = 10;

        if (stubCount < stubsForOneAttack) {
            System.out.println("Sharpening.....");
            stubCount += stubsForOneAttack;
        }

        System.out.println(String.format("Stubbing: %d", stubsForOneAttack));
        stubCount -= stubsForOneAttack;
    }

    public void cutOffLegs() {
        System.out.println("Cut off the legs");
    }

    @Override
    public String toString() {
        return "Katana{" +
                "stubCount=" + stubCount +
                ", damage=" + damage +
                '}';
    }
}
