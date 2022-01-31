package generics.model;

public class BladeWeapon extends Weapon {

    protected int stubCount;

    public BladeWeapon() {
    }

    public BladeWeapon(int damage, int stubCount) {
        super(damage);
        this.stubCount = stubCount;
    }

    public void stub() {

        int stubsForOneAttack = 1;

        if (stubCount < stubsForOneAttack) {
            System.out.println("Sharpening.....");
            stubCount += stubsForOneAttack;
        }

        System.out.println(String.format("Stubs: %d", stubsForOneAttack));
        stubCount -= stubsForOneAttack;
    }

    public int getStubCount() {
        return stubCount;
    }

    public void setStubCount(int stubCount) {
        this.stubCount = stubCount;
    }

    @Override
    public String toString() {
        return "BladeWeapon{" +
                "stubCount=" + stubCount +
                ", damage=" + damage +
                '}';
    }
}
